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

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.format.GSSFormatAField;
import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatArrayDimension;
import es.uah.aut.srg.gss.format.GSSFormatArrayRef;
import es.uah.aut.srg.gss.format.GSSFormatBytesBits;
import es.uah.aut.srg.gss.format.GSSFormatCSField;
import es.uah.aut.srg.gss.format.GSSFormatCSFormulaField;
import es.uah.aut.srg.gss.format.GSSFormatCheckType;
import es.uah.aut.srg.gss.format.GSSFormatFDICField;
import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder;
import es.uah.aut.srg.gss.format.GSSFormatFieldToCheck;
import es.uah.aut.srg.gss.format.GSSFormatFieldType;
import es.uah.aut.srg.gss.format.GSSFormatFloatingOffset;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.format.GSSFormatFormatType;
import es.uah.aut.srg.gss.format.GSSFormatFormula;
import es.uah.aut.srg.gss.format.GSSFormatPower;
import es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit;
import es.uah.aut.srg.gss.format.GSSFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.format.GSSFormatUnit;
import es.uah.aut.srg.gss.format.GSSFormatVRFieldSize;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.format.GSSFormatVariableSize;
import es.uah.aut.srg.gss.format.formatFactory;
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class formatPackageImpl extends EPackageImpl implements formatPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatCSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatCSFormulaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatVSFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatVRFieldSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFDICFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatAFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatAIFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatBytesBitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatVariableSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFloatingOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatSortedFieldsToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatFieldToCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatArrayDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFormatArrayRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatFieldByteOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatSFieldFirstBitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatCheckTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFormatPowerEEnum = null;

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
	 * @see es.uah.aut.srg.gss.format.formatPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private formatPackageImpl() {
		super(eNS_URI, formatFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link formatPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static formatPackage init() {
		if (isInited) return (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);

		// Obtain or create and register package
		formatPackageImpl theformatPackage = (formatPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof formatPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new formatPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theformatPackage.createPackageContents();

		// Initialize created meta-data
		theformatPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theformatPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(formatPackage.eNS_URI, theformatPackage);
		return theformatPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatFormat() {
		return gssFormatFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFormat_Protocol() {
		return (EAttribute)gssFormatFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFormat_Type() {
		return (EAttribute)gssFormatFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_CSField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_CSFormulaField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_VSField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_FDICField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_VRFieldSize() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_AField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFormat_AIField() {
		return (EReference)gssFormatFormatEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatField() {
		return gssFormatFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatField_Fid() {
		return (EAttribute)gssFormatFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatField_Pfid() {
		return (EAttribute)gssFormatFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatCSField() {
		return gssFormatCSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatCSField_Type() {
		return (EAttribute)gssFormatCSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatCSField_ByteOrder() {
		return (EAttribute)gssFormatCSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatCSField_FirstBit() {
		return (EAttribute)gssFormatCSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatCSField_Size() {
		return (EReference)gssFormatCSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatCSField_GlobalOffset() {
		return (EReference)gssFormatCSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatCSFormulaField() {
		return gssFormatCSFormulaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatCSFormulaField_Formula() {
		return (EReference)gssFormatCSFormulaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatVSField() {
		return gssFormatVSFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVSField_Type() {
		return (EAttribute)gssFormatVSFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVSField_ByteOrder() {
		return (EAttribute)gssFormatVSFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVSField_FirstBit() {
		return (EAttribute)gssFormatVSFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatVSField_ConstSize() {
		return (EReference)gssFormatVSFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatVSField_VariableSize() {
		return (EReference)gssFormatVSFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatVSField_MaxSize() {
		return (EReference)gssFormatVSFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatVSField_GlobalOffset() {
		return (EReference)gssFormatVSFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatVRFieldSize() {
		return gssFormatVRFieldSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatFDICField() {
		return gssFormatFDICFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFDICField_CheckType() {
		return (EAttribute)gssFormatFDICFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFDICField_ByteOrder() {
		return (EAttribute)gssFormatFDICFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFDICField_FirstBit() {
		return (EAttribute)gssFormatFDICFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFDICField_Size() {
		return (EReference)gssFormatFDICFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFDICField_FloatingOffset() {
		return (EReference)gssFormatFDICFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatFDICField_SortedFieldsToCheck() {
		return (EReference)gssFormatFDICFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatAField() {
		return gssFormatAFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAField_Type() {
		return (EAttribute)gssFormatAFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAField_ByteOrder() {
		return (EAttribute)gssFormatAFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAField_FirstBit() {
		return (EAttribute)gssFormatAFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAField_ArrayDimension() {
		return (EReference)gssFormatAFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAField_Size() {
		return (EReference)gssFormatAFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAField_GlobalOffset() {
		return (EReference)gssFormatAFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatAIField() {
		return gssFormatAIFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAIField_Type() {
		return (EAttribute)gssFormatAIFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAIField_ByteOrder() {
		return (EAttribute)gssFormatAIFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatAIField_FirstBit() {
		return (EAttribute)gssFormatAIFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAIField_ArrayRef() {
		return (EReference)gssFormatAIFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAIField_Size() {
		return (EReference)gssFormatAIFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatAIField_LocalOffset() {
		return (EReference)gssFormatAIFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatBytesBits() {
		return gssFormatBytesBitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatBytesBits_Bytes() {
		return (EAttribute)gssFormatBytesBitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatBytesBits_Bits() {
		return (EAttribute)gssFormatBytesBitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatFormula() {
		return gssFormatFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFormula_Slope() {
		return (EAttribute)gssFormatFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFormula_Intercept() {
		return (EAttribute)gssFormatFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatVariableSize() {
		return gssFormatVariableSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVariableSize_FidRef() {
		return (EAttribute)gssFormatVariableSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVariableSize_Unit() {
		return (EAttribute)gssFormatVariableSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatVariableSize_Power() {
		return (EAttribute)gssFormatVariableSizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatFloatingOffset() {
		return gssFormatFloatingOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFloatingOffset_FidRef() {
		return (EAttribute)gssFormatFloatingOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatSortedFieldsToCheck() {
		return gssFormatSortedFieldsToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFormatSortedFieldsToCheck_FieldToCheck() {
		return (EReference)gssFormatSortedFieldsToCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatFieldToCheck() {
		return gssFormatFieldToCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatFieldToCheck_FidRef() {
		return (EAttribute)gssFormatFieldToCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatArrayDimension() {
		return gssFormatArrayDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatArrayDimension_FidRef() {
		return (EAttribute)gssFormatArrayDimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatArrayDimension_MaxItems() {
		return (EAttribute)gssFormatArrayDimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFormatArrayRef() {
		return gssFormatArrayRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFormatArrayRef_FidRef() {
		return (EAttribute)gssFormatArrayRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatFormatType() {
		return gssFormatFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatFieldType() {
		return gssFormatFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatFieldByteOrder() {
		return gssFormatFieldByteOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatSFieldFirstBit() {
		return gssFormatSFieldFirstBitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatCheckType() {
		return gssFormatCheckTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatUnit() {
		return gssFormatUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFormatPower() {
		return gssFormatPowerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public formatFactory getformatFactory() {
		return (formatFactory)getEFactoryInstance();
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
		gssFormatFormatEClass = createEClass(GSS_FORMAT_FORMAT);
		createEAttribute(gssFormatFormatEClass, GSS_FORMAT_FORMAT__PROTOCOL);
		createEAttribute(gssFormatFormatEClass, GSS_FORMAT_FORMAT__TYPE);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__CS_FIELD);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__CS_FORMULA_FIELD);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__VS_FIELD);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__FDIC_FIELD);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__VR_FIELD_SIZE);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__AFIELD);
		createEReference(gssFormatFormatEClass, GSS_FORMAT_FORMAT__AI_FIELD);

		gssFormatFieldEClass = createEClass(GSS_FORMAT_FIELD);
		createEAttribute(gssFormatFieldEClass, GSS_FORMAT_FIELD__FID);
		createEAttribute(gssFormatFieldEClass, GSS_FORMAT_FIELD__PFID);

		gssFormatCSFieldEClass = createEClass(GSS_FORMAT_CS_FIELD);
		createEAttribute(gssFormatCSFieldEClass, GSS_FORMAT_CS_FIELD__TYPE);
		createEAttribute(gssFormatCSFieldEClass, GSS_FORMAT_CS_FIELD__BYTE_ORDER);
		createEAttribute(gssFormatCSFieldEClass, GSS_FORMAT_CS_FIELD__FIRST_BIT);
		createEReference(gssFormatCSFieldEClass, GSS_FORMAT_CS_FIELD__SIZE);
		createEReference(gssFormatCSFieldEClass, GSS_FORMAT_CS_FIELD__GLOBAL_OFFSET);

		gssFormatCSFormulaFieldEClass = createEClass(GSS_FORMAT_CS_FORMULA_FIELD);
		createEReference(gssFormatCSFormulaFieldEClass, GSS_FORMAT_CS_FORMULA_FIELD__FORMULA);

		gssFormatVSFieldEClass = createEClass(GSS_FORMAT_VS_FIELD);
		createEAttribute(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__TYPE);
		createEAttribute(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__BYTE_ORDER);
		createEAttribute(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__FIRST_BIT);
		createEReference(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__CONST_SIZE);
		createEReference(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__VARIABLE_SIZE);
		createEReference(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__MAX_SIZE);
		createEReference(gssFormatVSFieldEClass, GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET);

		gssFormatVRFieldSizeEClass = createEClass(GSS_FORMAT_VR_FIELD_SIZE);

		gssFormatFDICFieldEClass = createEClass(GSS_FORMAT_FDIC_FIELD);
		createEAttribute(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__CHECK_TYPE);
		createEAttribute(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__BYTE_ORDER);
		createEAttribute(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__FIRST_BIT);
		createEReference(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__SIZE);
		createEReference(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__FLOATING_OFFSET);
		createEReference(gssFormatFDICFieldEClass, GSS_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK);

		gssFormatAFieldEClass = createEClass(GSS_FORMAT_AFIELD);
		createEAttribute(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__TYPE);
		createEAttribute(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__BYTE_ORDER);
		createEAttribute(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__FIRST_BIT);
		createEReference(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__ARRAY_DIMENSION);
		createEReference(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__SIZE);
		createEReference(gssFormatAFieldEClass, GSS_FORMAT_AFIELD__GLOBAL_OFFSET);

		gssFormatAIFieldEClass = createEClass(GSS_FORMAT_AI_FIELD);
		createEAttribute(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__TYPE);
		createEAttribute(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__BYTE_ORDER);
		createEAttribute(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__FIRST_BIT);
		createEReference(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__ARRAY_REF);
		createEReference(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__SIZE);
		createEReference(gssFormatAIFieldEClass, GSS_FORMAT_AI_FIELD__LOCAL_OFFSET);

		gssFormatBytesBitsEClass = createEClass(GSS_FORMAT_BYTES_BITS);
		createEAttribute(gssFormatBytesBitsEClass, GSS_FORMAT_BYTES_BITS__BYTES);
		createEAttribute(gssFormatBytesBitsEClass, GSS_FORMAT_BYTES_BITS__BITS);

		gssFormatFormulaEClass = createEClass(GSS_FORMAT_FORMULA);
		createEAttribute(gssFormatFormulaEClass, GSS_FORMAT_FORMULA__SLOPE);
		createEAttribute(gssFormatFormulaEClass, GSS_FORMAT_FORMULA__INTERCEPT);

		gssFormatVariableSizeEClass = createEClass(GSS_FORMAT_VARIABLE_SIZE);
		createEAttribute(gssFormatVariableSizeEClass, GSS_FORMAT_VARIABLE_SIZE__FID_REF);
		createEAttribute(gssFormatVariableSizeEClass, GSS_FORMAT_VARIABLE_SIZE__UNIT);
		createEAttribute(gssFormatVariableSizeEClass, GSS_FORMAT_VARIABLE_SIZE__POWER);

		gssFormatFloatingOffsetEClass = createEClass(GSS_FORMAT_FLOATING_OFFSET);
		createEAttribute(gssFormatFloatingOffsetEClass, GSS_FORMAT_FLOATING_OFFSET__FID_REF);

		gssFormatSortedFieldsToCheckEClass = createEClass(GSS_FORMAT_SORTED_FIELDS_TO_CHECK);
		createEReference(gssFormatSortedFieldsToCheckEClass, GSS_FORMAT_SORTED_FIELDS_TO_CHECK__FIELD_TO_CHECK);

		gssFormatFieldToCheckEClass = createEClass(GSS_FORMAT_FIELD_TO_CHECK);
		createEAttribute(gssFormatFieldToCheckEClass, GSS_FORMAT_FIELD_TO_CHECK__FID_REF);

		gssFormatArrayDimensionEClass = createEClass(GSS_FORMAT_ARRAY_DIMENSION);
		createEAttribute(gssFormatArrayDimensionEClass, GSS_FORMAT_ARRAY_DIMENSION__FID_REF);
		createEAttribute(gssFormatArrayDimensionEClass, GSS_FORMAT_ARRAY_DIMENSION__MAX_ITEMS);

		gssFormatArrayRefEClass = createEClass(GSS_FORMAT_ARRAY_REF);
		createEAttribute(gssFormatArrayRefEClass, GSS_FORMAT_ARRAY_REF__FID_REF);

		// Create enums
		gssFormatFormatTypeEEnum = createEEnum(GSS_FORMAT_FORMAT_TYPE);
		gssFormatFieldTypeEEnum = createEEnum(GSS_FORMAT_FIELD_TYPE);
		gssFormatFieldByteOrderEEnum = createEEnum(GSS_FORMAT_FIELD_BYTE_ORDER);
		gssFormatSFieldFirstBitEEnum = createEEnum(GSS_FORMAT_SFIELD_FIRST_BIT);
		gssFormatCheckTypeEEnum = createEEnum(GSS_FORMAT_CHECK_TYPE);
		gssFormatUnitEEnum = createEEnum(GSS_FORMAT_UNIT);
		gssFormatPowerEEnum = createEEnum(GSS_FORMAT_POWER);
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
		gssFormatFormatEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssFormatFieldEClass.getESuperTypes().add(thecommonPackage.getGSSModelObject());
		gssFormatCSFieldEClass.getESuperTypes().add(this.getGSSFormatField());
		gssFormatCSFormulaFieldEClass.getESuperTypes().add(this.getGSSFormatCSField());
		gssFormatVSFieldEClass.getESuperTypes().add(this.getGSSFormatField());
		gssFormatVRFieldSizeEClass.getESuperTypes().add(this.getGSSFormatField());
		gssFormatFDICFieldEClass.getESuperTypes().add(this.getGSSFormatField());
		gssFormatAFieldEClass.getESuperTypes().add(this.getGSSFormatField());
		gssFormatAIFieldEClass.getESuperTypes().add(this.getGSSFormatField());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssFormatFormatEClass, GSSFormatFormat.class, "GSSFormatFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatFormat_Protocol(), ecorePackage.getEString(), "protocol", null, 1, 1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatFormat_Type(), this.getGSSFormatFormatType(), "type", null, 1, 1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_CSField(), this.getGSSFormatCSField(), null, "CSField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_CSFormulaField(), this.getGSSFormatCSFormulaField(), null, "CSFormulaField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_VSField(), this.getGSSFormatVSField(), null, "VSField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_FDICField(), this.getGSSFormatFDICField(), null, "FDICField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_VRFieldSize(), this.getGSSFormatVRFieldSize(), null, "VRFieldSize", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_AField(), this.getGSSFormatAField(), null, "AField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFormat_AIField(), this.getGSSFormatAIField(), null, "AIField", null, 0, -1, GSSFormatFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatFieldEClass, GSSFormatField.class, "GSSFormatField", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatField_Fid(), ecorePackage.getEString(), "fid", null, 1, 1, GSSFormatField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatField_Pfid(), ecorePackage.getEString(), "pfid", null, 1, 1, GSSFormatField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatCSFieldEClass, GSSFormatCSField.class, "GSSFormatCSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatCSField_Type(), this.getGSSFormatFieldType(), "type", null, 1, 1, GSSFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatCSField_ByteOrder(), this.getGSSFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatCSField_FirstBit(), this.getGSSFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatCSField_Size(), this.getGSSFormatBytesBits(), null, "size", null, 1, 1, GSSFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatCSField_GlobalOffset(), this.getGSSFormatBytesBits(), null, "globalOffset", null, 1, 1, GSSFormatCSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatCSFormulaFieldEClass, GSSFormatCSFormulaField.class, "GSSFormatCSFormulaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSFormatCSFormulaField_Formula(), this.getGSSFormatFormula(), null, "formula", null, 1, 1, GSSFormatCSFormulaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatVSFieldEClass, GSSFormatVSField.class, "GSSFormatVSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatVSField_Type(), this.getGSSFormatFieldType(), "type", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatVSField_ByteOrder(), this.getGSSFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatVSField_FirstBit(), this.getGSSFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatVSField_ConstSize(), this.getGSSFormatBytesBits(), null, "constSize", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatVSField_VariableSize(), this.getGSSFormatVariableSize(), null, "variableSize", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatVSField_MaxSize(), this.getGSSFormatBytesBits(), null, "maxSize", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatVSField_GlobalOffset(), this.getGSSFormatBytesBits(), null, "globalOffset", null, 1, 1, GSSFormatVSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatVRFieldSizeEClass, GSSFormatVRFieldSize.class, "GSSFormatVRFieldSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssFormatFDICFieldEClass, GSSFormatFDICField.class, "GSSFormatFDICField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatFDICField_CheckType(), this.getGSSFormatCheckType(), "checkType", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatFDICField_ByteOrder(), this.getGSSFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatFDICField_FirstBit(), this.getGSSFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFDICField_Size(), this.getGSSFormatBytesBits(), null, "size", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFDICField_FloatingOffset(), this.getGSSFormatFloatingOffset(), null, "floatingOffset", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatFDICField_SortedFieldsToCheck(), this.getGSSFormatSortedFieldsToCheck(), null, "sortedFieldsToCheck", null, 1, 1, GSSFormatFDICField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatAFieldEClass, GSSFormatAField.class, "GSSFormatAField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatAField_Type(), this.getGSSFormatFieldType(), "type", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatAField_ByteOrder(), this.getGSSFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatAField_FirstBit(), this.getGSSFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAField_ArrayDimension(), this.getGSSFormatArrayDimension(), null, "arrayDimension", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAField_Size(), this.getGSSFormatBytesBits(), null, "size", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAField_GlobalOffset(), this.getGSSFormatBytesBits(), null, "globalOffset", null, 1, 1, GSSFormatAField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatAIFieldEClass, GSSFormatAIField.class, "GSSFormatAIField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatAIField_Type(), this.getGSSFormatFieldType(), "type", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatAIField_ByteOrder(), this.getGSSFormatFieldByteOrder(), "byteOrder", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatAIField_FirstBit(), this.getGSSFormatSFieldFirstBit(), "firstBit", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAIField_ArrayRef(), this.getGSSFormatArrayRef(), null, "arrayRef", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAIField_Size(), this.getGSSFormatBytesBits(), null, "size", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFormatAIField_LocalOffset(), this.getGSSFormatBytesBits(), null, "localOffset", null, 1, 1, GSSFormatAIField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatBytesBitsEClass, GSSFormatBytesBits.class, "GSSFormatBytesBits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatBytesBits_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSFormatBytesBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatBytesBits_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSFormatBytesBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatFormulaEClass, GSSFormatFormula.class, "GSSFormatFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatFormula_Slope(), ecorePackage.getEString(), "slope", null, 1, 1, GSSFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatFormula_Intercept(), ecorePackage.getEString(), "intercept", null, 1, 1, GSSFormatFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatVariableSizeEClass, GSSFormatVariableSize.class, "GSSFormatVariableSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatVariableSize_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatVariableSize_Unit(), this.getGSSFormatUnit(), "unit", null, 1, 1, GSSFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatVariableSize_Power(), this.getGSSFormatPower(), "power", null, 0, 1, GSSFormatVariableSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatFloatingOffsetEClass, GSSFormatFloatingOffset.class, "GSSFormatFloatingOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatFloatingOffset_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSFormatFloatingOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatSortedFieldsToCheckEClass, GSSFormatSortedFieldsToCheck.class, "GSSFormatSortedFieldsToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSFormatSortedFieldsToCheck_FieldToCheck(), this.getGSSFormatFieldToCheck(), null, "fieldToCheck", null, 0, -1, GSSFormatSortedFieldsToCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatFieldToCheckEClass, GSSFormatFieldToCheck.class, "GSSFormatFieldToCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatFieldToCheck_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSFormatFieldToCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatArrayDimensionEClass, GSSFormatArrayDimension.class, "GSSFormatArrayDimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatArrayDimension_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFormatArrayDimension_MaxItems(), ecorePackage.getEString(), "maxItems", null, 1, 1, GSSFormatArrayDimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFormatArrayRefEClass, GSSFormatArrayRef.class, "GSSFormatArrayRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFormatArrayRef_FidRef(), ecorePackage.getEString(), "fidRef", null, 1, 1, GSSFormatArrayRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssFormatFormatTypeEEnum, GSSFormatFormatType.class, "GSSFormatFormatType");
		addEEnumLiteral(gssFormatFormatTypeEEnum, GSSFormatFormatType.TM);
		addEEnumLiteral(gssFormatFormatTypeEEnum, GSSFormatFormatType.TC);

		initEEnum(gssFormatFieldTypeEEnum, GSSFormatFieldType.class, "GSSFormatFieldType");
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.STRUCTURED);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.UINT);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.FLAG);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.ENUMERATED);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.BIT_VECTOR);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.BYTE_VECTOR);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.FLOAT);
		addEEnumLiteral(gssFormatFieldTypeEEnum, GSSFormatFieldType.DEDUCED);

		initEEnum(gssFormatFieldByteOrderEEnum, GSSFormatFieldByteOrder.class, "GSSFormatFieldByteOrder");
		addEEnumLiteral(gssFormatFieldByteOrderEEnum, GSSFormatFieldByteOrder.BIG_ENDIAN);
		addEEnumLiteral(gssFormatFieldByteOrderEEnum, GSSFormatFieldByteOrder.LITTLE_ENDIAN);
		addEEnumLiteral(gssFormatFieldByteOrderEEnum, GSSFormatFieldByteOrder.NA);

		initEEnum(gssFormatSFieldFirstBitEEnum, GSSFormatSFieldFirstBit.class, "GSSFormatSFieldFirstBit");
		addEEnumLiteral(gssFormatSFieldFirstBitEEnum, GSSFormatSFieldFirstBit.MSB);
		addEEnumLiteral(gssFormatSFieldFirstBitEEnum, GSSFormatSFieldFirstBit.LSB);

		initEEnum(gssFormatCheckTypeEEnum, GSSFormatCheckType.class, "GSSFormatCheckType");
		addEEnumLiteral(gssFormatCheckTypeEEnum, GSSFormatCheckType.CRC16);
		addEEnumLiteral(gssFormatCheckTypeEEnum, GSSFormatCheckType.CHECKSUM16);

		initEEnum(gssFormatUnitEEnum, GSSFormatUnit.class, "GSSFormatUnit");
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.BYTES);
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.BITS);
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.HALFWORD);
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.STRING10);
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.STRING17);
		addEEnumLiteral(gssFormatUnitEEnum, GSSFormatUnit.STRING69);

		initEEnum(gssFormatPowerEEnum, GSSFormatPower.class, "GSSFormatPower");
		addEEnumLiteral(gssFormatPowerEEnum, GSSFormatPower._2);
		addEEnumLiteral(gssFormatPowerEEnum, GSSFormatPower._2WITH_0);

		// Create resource
		createResource(eNS_URI);
	}

} //formatPackageImpl
