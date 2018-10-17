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
package es.uah.aut.srg.gss.export.impl;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.export.GSSExportActivateDICs;
import es.uah.aut.srg.gss.export.GSSExportDIC;
import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromConst;
import es.uah.aut.srg.gss.export.GSSExportSettingFromField;
import es.uah.aut.srg.gss.export.GSSExportSettingFromFile;
import es.uah.aut.srg.gss.export.GSSExportSettingFromSize;
import es.uah.aut.srg.gss.export.GSSExportSettings;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength;
import es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine;
import es.uah.aut.srg.gss.export.GSSExportSizeInBits;
import es.uah.aut.srg.gss.export.GSSExportSizes;
import es.uah.aut.srg.gss.export.GSSExportUnit;
import es.uah.aut.srg.gss.export.exportFactory;
import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;
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
public class exportPackageImpl extends EPackageImpl implements exportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportExportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSizesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSizeFromFileLengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSizeFromFileLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSizeInBitsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingFromConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingFromSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingFromFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingAIFromFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportSettingAIFromConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportActivateDICsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssExportDICEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssExportUnitEEnum = null;

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
	 * @see es.uah.aut.srg.gss.export.exportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private exportPackageImpl() {
		super(eNS_URI, exportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link exportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static exportPackage init() {
		if (isInited) return (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);

		// Obtain or create and register package
		exportPackageImpl theexportPackage = (exportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof exportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new exportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		tm_tc_formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theexportPackage.createPackageContents();

		// Initialize created meta-data
		theexportPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theexportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(exportPackage.eNS_URI, theexportPackage);
		return theexportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportExport() {
		return gssExportExportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportExport_From() {
		return (EReference)gssExportExportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportExport_To() {
		return (EReference)gssExportExportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportExport_Sizes() {
		return (EReference)gssExportExportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportExport_Settings() {
		return (EReference)gssExportExportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportExport_ActivateDICs() {
		return (EReference)gssExportExportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSizes() {
		return gssExportSizesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSizes_SizeFromFileLength() {
		return (EReference)gssExportSizesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSizes_SizeFromFileLine() {
		return (EReference)gssExportSizesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSizes_SizeInBits() {
		return (EReference)gssExportSizesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSizeFromFileLength() {
		return gssExportSizeFromFileLengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLength_Id() {
		return (EAttribute)gssExportSizeFromFileLengthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLength_FromFile() {
		return (EAttribute)gssExportSizeFromFileLengthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLength_AddSize() {
		return (EAttribute)gssExportSizeFromFileLengthEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLength_Unit() {
		return (EAttribute)gssExportSizeFromFileLengthEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSizeFromFileLength_SettingFromConst() {
		return (EReference)gssExportSizeFromFileLengthEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSizeFromFileLine() {
		return gssExportSizeFromFileLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLine_Id() {
		return (EAttribute)gssExportSizeFromFileLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLine_FromFile() {
		return (EAttribute)gssExportSizeFromFileLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLine_Line() {
		return (EAttribute)gssExportSizeFromFileLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLine_AddSize() {
		return (EAttribute)gssExportSizeFromFileLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeFromFileLine_Unit() {
		return (EAttribute)gssExportSizeFromFileLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSizeInBits() {
		return gssExportSizeInBitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeInBits_Id() {
		return (EAttribute)gssExportSizeInBitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeInBits_From() {
		return (EAttribute)gssExportSizeInBitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeInBits_AddSize() {
		return (EAttribute)gssExportSizeInBitsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSizeInBits_Unit() {
		return (EAttribute)gssExportSizeInBitsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettings() {
		return gssExportSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingFromConst() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingFromSize() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingFromFile() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingFromField() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingAIFromConst() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettings_SettingAIFromFile() {
		return (EReference)gssExportSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingFromConst() {
		return gssExportSettingFromConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromConst_Value() {
		return (EAttribute)gssExportSettingFromConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingFromConst_ToFieldRef() {
		return (EReference)gssExportSettingFromConstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingFromSize() {
		return gssExportSettingFromSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromSize_SizeRef() {
		return (EAttribute)gssExportSettingFromSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingFromSize_ToFieldRef() {
		return (EReference)gssExportSettingFromSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingFromFile() {
		return gssExportSettingFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromFile_File() {
		return (EAttribute)gssExportSettingFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingFromFile_ToFieldRef() {
		return (EReference)gssExportSettingFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromFile_Offset() {
		return (EAttribute)gssExportSettingFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromFile_Size() {
		return (EAttribute)gssExportSettingFromFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingFromFile_Line() {
		return (EAttribute)gssExportSettingFromFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingFromField() {
		return gssExportSettingFromFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingFromField_FieldRef() {
		return (EReference)gssExportSettingFromFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingFromField_ToFieldRef() {
		return (EReference)gssExportSettingFromFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingAIFromFile() {
		return gssExportSettingAIFromFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromFile_File() {
		return (EAttribute)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingAIFromFile_ToFieldRef() {
		return (EReference)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromFile_ToArrayIndex() {
		return (EAttribute)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromFile_Offset() {
		return (EAttribute)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromFile_Size() {
		return (EAttribute)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromFile_Line() {
		return (EAttribute)gssExportSettingAIFromFileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportSettingAIFromConst() {
		return gssExportSettingAIFromConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromConst_Value() {
		return (EAttribute)gssExportSettingAIFromConstEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportSettingAIFromConst_ToFieldRef() {
		return (EReference)gssExportSettingAIFromConstEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportSettingAIFromConst_ToArrayIndex() {
		return (EAttribute)gssExportSettingAIFromConstEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportActivateDICs() {
		return gssExportActivateDICsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSExportActivateDICs_DIC() {
		return (EReference)gssExportActivateDICsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSExportDIC() {
		return gssExportDICEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportDIC_Id() {
		return (EAttribute)gssExportDICEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSExportDIC_DICRef() {
		return (EAttribute)gssExportDICEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSExportUnit() {
		return gssExportUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exportFactory getexportFactory() {
		return (exportFactory)getEFactoryInstance();
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
		gssExportExportEClass = createEClass(GSS_EXPORT_EXPORT);
		createEReference(gssExportExportEClass, GSS_EXPORT_EXPORT__FROM);
		createEReference(gssExportExportEClass, GSS_EXPORT_EXPORT__TO);
		createEReference(gssExportExportEClass, GSS_EXPORT_EXPORT__SIZES);
		createEReference(gssExportExportEClass, GSS_EXPORT_EXPORT__SETTINGS);
		createEReference(gssExportExportEClass, GSS_EXPORT_EXPORT__ACTIVATE_DI_CS);

		gssExportSizesEClass = createEClass(GSS_EXPORT_SIZES);
		createEReference(gssExportSizesEClass, GSS_EXPORT_SIZES__SIZE_FROM_FILE_LENGTH);
		createEReference(gssExportSizesEClass, GSS_EXPORT_SIZES__SIZE_FROM_FILE_LINE);
		createEReference(gssExportSizesEClass, GSS_EXPORT_SIZES__SIZE_IN_BITS);

		gssExportSizeFromFileLengthEClass = createEClass(GSS_EXPORT_SIZE_FROM_FILE_LENGTH);
		createEAttribute(gssExportSizeFromFileLengthEClass, GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ID);
		createEAttribute(gssExportSizeFromFileLengthEClass, GSS_EXPORT_SIZE_FROM_FILE_LENGTH__FROM_FILE);
		createEAttribute(gssExportSizeFromFileLengthEClass, GSS_EXPORT_SIZE_FROM_FILE_LENGTH__ADD_SIZE);
		createEAttribute(gssExportSizeFromFileLengthEClass, GSS_EXPORT_SIZE_FROM_FILE_LENGTH__UNIT);
		createEReference(gssExportSizeFromFileLengthEClass, GSS_EXPORT_SIZE_FROM_FILE_LENGTH__SETTING_FROM_CONST);

		gssExportSizeFromFileLineEClass = createEClass(GSS_EXPORT_SIZE_FROM_FILE_LINE);
		createEAttribute(gssExportSizeFromFileLineEClass, GSS_EXPORT_SIZE_FROM_FILE_LINE__ID);
		createEAttribute(gssExportSizeFromFileLineEClass, GSS_EXPORT_SIZE_FROM_FILE_LINE__FROM_FILE);
		createEAttribute(gssExportSizeFromFileLineEClass, GSS_EXPORT_SIZE_FROM_FILE_LINE__LINE);
		createEAttribute(gssExportSizeFromFileLineEClass, GSS_EXPORT_SIZE_FROM_FILE_LINE__ADD_SIZE);
		createEAttribute(gssExportSizeFromFileLineEClass, GSS_EXPORT_SIZE_FROM_FILE_LINE__UNIT);

		gssExportSizeInBitsEClass = createEClass(GSS_EXPORT_SIZE_IN_BITS);
		createEAttribute(gssExportSizeInBitsEClass, GSS_EXPORT_SIZE_IN_BITS__ID);
		createEAttribute(gssExportSizeInBitsEClass, GSS_EXPORT_SIZE_IN_BITS__FROM);
		createEAttribute(gssExportSizeInBitsEClass, GSS_EXPORT_SIZE_IN_BITS__ADD_SIZE);
		createEAttribute(gssExportSizeInBitsEClass, GSS_EXPORT_SIZE_IN_BITS__UNIT);

		gssExportSettingsEClass = createEClass(GSS_EXPORT_SETTINGS);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_FROM_CONST);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_FROM_SIZE);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_FROM_FILE);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_FROM_FIELD);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_AI_FROM_CONST);
		createEReference(gssExportSettingsEClass, GSS_EXPORT_SETTINGS__SETTING_AI_FROM_FILE);

		gssExportSettingFromConstEClass = createEClass(GSS_EXPORT_SETTING_FROM_CONST);
		createEAttribute(gssExportSettingFromConstEClass, GSS_EXPORT_SETTING_FROM_CONST__VALUE);
		createEReference(gssExportSettingFromConstEClass, GSS_EXPORT_SETTING_FROM_CONST__TO_FIELD_REF);

		gssExportSettingFromSizeEClass = createEClass(GSS_EXPORT_SETTING_FROM_SIZE);
		createEAttribute(gssExportSettingFromSizeEClass, GSS_EXPORT_SETTING_FROM_SIZE__SIZE_REF);
		createEReference(gssExportSettingFromSizeEClass, GSS_EXPORT_SETTING_FROM_SIZE__TO_FIELD_REF);

		gssExportSettingFromFileEClass = createEClass(GSS_EXPORT_SETTING_FROM_FILE);
		createEAttribute(gssExportSettingFromFileEClass, GSS_EXPORT_SETTING_FROM_FILE__FILE);
		createEReference(gssExportSettingFromFileEClass, GSS_EXPORT_SETTING_FROM_FILE__TO_FIELD_REF);
		createEAttribute(gssExportSettingFromFileEClass, GSS_EXPORT_SETTING_FROM_FILE__OFFSET);
		createEAttribute(gssExportSettingFromFileEClass, GSS_EXPORT_SETTING_FROM_FILE__SIZE);
		createEAttribute(gssExportSettingFromFileEClass, GSS_EXPORT_SETTING_FROM_FILE__LINE);

		gssExportSettingFromFieldEClass = createEClass(GSS_EXPORT_SETTING_FROM_FIELD);
		createEReference(gssExportSettingFromFieldEClass, GSS_EXPORT_SETTING_FROM_FIELD__FIELD_REF);
		createEReference(gssExportSettingFromFieldEClass, GSS_EXPORT_SETTING_FROM_FIELD__TO_FIELD_REF);

		gssExportSettingAIFromConstEClass = createEClass(GSS_EXPORT_SETTING_AI_FROM_CONST);
		createEAttribute(gssExportSettingAIFromConstEClass, GSS_EXPORT_SETTING_AI_FROM_CONST__VALUE);
		createEReference(gssExportSettingAIFromConstEClass, GSS_EXPORT_SETTING_AI_FROM_CONST__TO_FIELD_REF);
		createEAttribute(gssExportSettingAIFromConstEClass, GSS_EXPORT_SETTING_AI_FROM_CONST__TO_ARRAY_INDEX);

		gssExportSettingAIFromFileEClass = createEClass(GSS_EXPORT_SETTING_AI_FROM_FILE);
		createEAttribute(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__FILE);
		createEReference(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__TO_FIELD_REF);
		createEAttribute(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__TO_ARRAY_INDEX);
		createEAttribute(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__OFFSET);
		createEAttribute(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__SIZE);
		createEAttribute(gssExportSettingAIFromFileEClass, GSS_EXPORT_SETTING_AI_FROM_FILE__LINE);

		gssExportActivateDICsEClass = createEClass(GSS_EXPORT_ACTIVATE_DI_CS);
		createEReference(gssExportActivateDICsEClass, GSS_EXPORT_ACTIVATE_DI_CS__DIC);

		gssExportDICEClass = createEClass(GSS_EXPORT_DIC);
		createEAttribute(gssExportDICEClass, GSS_EXPORT_DIC__ID);
		createEAttribute(gssExportDICEClass, GSS_EXPORT_DIC__DIC_REF);

		// Create enums
		gssExportUnitEEnum = createEEnum(GSS_EXPORT_UNIT);
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
		tm_tc_formatPackage thetm_tc_formatPackage = (tm_tc_formatPackage)EPackage.Registry.INSTANCE.getEPackage(tm_tc_formatPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssExportExportEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssExportExportEClass, GSSExportExport.class, "GSSExportExport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSExportExport_From(), thetm_tc_formatPackage.getGSSTmTcFormatTmTCFormat(), null, "from", null, 1, 1, GSSExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportExport_To(), thetm_tc_formatPackage.getGSSTmTcFormatTmTCFormat(), null, "to", null, 1, 1, GSSExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportExport_Sizes(), this.getGSSExportSizes(), null, "Sizes", null, 0, 1, GSSExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportExport_Settings(), this.getGSSExportSettings(), null, "settings", null, 1, 1, GSSExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportExport_ActivateDICs(), this.getGSSExportActivateDICs(), null, "activateDICs", null, 0, 1, GSSExportExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSizesEClass, GSSExportSizes.class, "GSSExportSizes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSExportSizes_SizeFromFileLength(), this.getGSSExportSizeFromFileLength(), null, "sizeFromFileLength", null, 0, -1, GSSExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSizes_SizeFromFileLine(), this.getGSSExportSizeFromFileLine(), null, "sizeFromFileLine", null, 0, -1, GSSExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSizes_SizeInBits(), this.getGSSExportSizeInBits(), null, "sizeInBits", null, 0, -1, GSSExportSizes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSizeFromFileLengthEClass, GSSExportSizeFromFileLength.class, "GSSExportSizeFromFileLength", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSizeFromFileLength_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLength_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, GSSExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLength_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, GSSExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLength_Unit(), this.getGSSExportUnit(), "unit", null, 0, 1, GSSExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSizeFromFileLength_SettingFromConst(), this.getGSSExportSettingFromConst(), null, "settingFromConst", null, 0, -1, GSSExportSizeFromFileLength.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSizeFromFileLineEClass, GSSExportSizeFromFileLine.class, "GSSExportSizeFromFileLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSizeFromFileLine_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLine_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, GSSExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLine_Line(), ecorePackage.getEString(), "line", null, 1, 1, GSSExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLine_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, GSSExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeFromFileLine_Unit(), this.getGSSExportUnit(), "unit", null, 0, 1, GSSExportSizeFromFileLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSizeInBitsEClass, GSSExportSizeInBits.class, "GSSExportSizeInBits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSizeInBits_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSExportSizeInBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeInBits_From(), ecorePackage.getEString(), "from", null, 1, 1, GSSExportSizeInBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeInBits_AddSize(), ecorePackage.getEString(), "addSize", null, 0, 1, GSSExportSizeInBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSizeInBits_Unit(), this.getGSSExportUnit(), "unit", null, 0, 1, GSSExportSizeInBits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingsEClass, GSSExportSettings.class, "GSSExportSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSExportSettings_SettingFromConst(), this.getGSSExportSettingFromConst(), null, "settingFromConst", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettings_SettingFromSize(), this.getGSSExportSettingFromSize(), null, "settingFromSize", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettings_SettingFromFile(), this.getGSSExportSettingFromFile(), null, "settingFromFile", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettings_SettingFromField(), this.getGSSExportSettingFromField(), null, "settingFromField", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettings_SettingAIFromConst(), this.getGSSExportSettingAIFromConst(), null, "settingAIFromConst", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettings_SettingAIFromFile(), this.getGSSExportSettingAIFromFile(), null, "settingAIFromFile", null, 0, -1, GSSExportSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingFromConstEClass, GSSExportSettingFromConst.class, "GSSExportSettingFromConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSettingFromConst_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSExportSettingFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingFromConst_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "toFieldRef", null, 1, 1, GSSExportSettingFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingFromSizeEClass, GSSExportSettingFromSize.class, "GSSExportSettingFromSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSettingFromSize_SizeRef(), ecorePackage.getEString(), "sizeRef", null, 1, 1, GSSExportSettingFromSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingFromSize_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "toFieldRef", null, 1, 1, GSSExportSettingFromSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingFromFileEClass, GSSExportSettingFromFile.class, "GSSExportSettingFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSettingFromFile_File(), ecorePackage.getEString(), "file", null, 1, 1, GSSExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingFromFile_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "toFieldRef", null, 1, 1, GSSExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingFromFile_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, GSSExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingFromFile_Size(), ecorePackage.getEString(), "size", null, 0, 1, GSSExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingFromFile_Line(), ecorePackage.getEString(), "line", null, 0, 1, GSSExportSettingFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingFromFieldEClass, GSSExportSettingFromField.class, "GSSExportSettingFromField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSExportSettingFromField_FieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "fieldRef", null, 1, 1, GSSExportSettingFromField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingFromField_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "toFieldRef", null, 1, 1, GSSExportSettingFromField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingAIFromConstEClass, GSSExportSettingAIFromConst.class, "GSSExportSettingAIFromConst", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSettingAIFromConst_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSExportSettingAIFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingAIFromConst_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatAIField(), null, "toFieldRef", null, 1, 1, GSSExportSettingAIFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingAIFromConst_ToArrayIndex(), ecorePackage.getEString(), "toArrayIndex", null, 1, 1, GSSExportSettingAIFromConst.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportSettingAIFromFileEClass, GSSExportSettingAIFromFile.class, "GSSExportSettingAIFromFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportSettingAIFromFile_File(), ecorePackage.getEString(), "file", null, 1, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSExportSettingAIFromFile_ToFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatAIField(), null, "toFieldRef", null, 1, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingAIFromFile_ToArrayIndex(), ecorePackage.getEString(), "toArrayIndex", null, 1, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingAIFromFile_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingAIFromFile_Size(), ecorePackage.getEString(), "size", null, 0, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportSettingAIFromFile_Line(), ecorePackage.getEString(), "line", null, 0, 1, GSSExportSettingAIFromFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportActivateDICsEClass, GSSExportActivateDICs.class, "GSSExportActivateDICs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSExportActivateDICs_DIC(), this.getGSSExportDIC(), null, "DIC", null, 1, 10, GSSExportActivateDICs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssExportDICEClass, GSSExportDIC.class, "GSSExportDIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSExportDIC_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSExportDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSExportDIC_DICRef(), ecorePackage.getEString(), "DICRef", null, 1, 1, GSSExportDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssExportUnitEEnum, GSSExportUnit.class, "GSSExportUnit");
		addEEnumLiteral(gssExportUnitEEnum, GSSExportUnit.BITS);
		addEEnumLiteral(gssExportUnitEEnum, GSSExportUnit.BYTES);

		// Create resource
		createResource(eNS_URI);
	}

} //exportPackageImpl
