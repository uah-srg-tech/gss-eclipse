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
package es.uah.aut.srg.gss.filters.impl;

import es.uah.aut.srg.gss.common.commonPackage;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromArrayItem;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.gss.filters.GSSFilterBoolVarRef;
import es.uah.aut.srg.gss.filters.GSSFilterConstant;
import es.uah.aut.srg.gss.filters.GSSFilterConstantType;
import es.uah.aut.srg.gss.filters.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filters.GSSFilterFilter;
import es.uah.aut.srg.gss.filters.GSSFilterMaxterm;
import es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter;
import es.uah.aut.srg.gss.filters.GSSFilterMinterm;
import es.uah.aut.srg.gss.filters.GSSFilterMintermFilter;
import es.uah.aut.srg.gss.filters.GSSFilterOPType;
import es.uah.aut.srg.gss.filters.GSSFilterSelect;
import es.uah.aut.srg.gss.filters.GSSFilterSelectLine;
import es.uah.aut.srg.gss.filters.GSSFilterSelectType;
import es.uah.aut.srg.gss.filters.filtersFactory;
import es.uah.aut.srg.gss.filters.filtersPackage;

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
public class filtersPackageImpl extends EPackageImpl implements filtersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterMaxtermFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterMintermFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterBoolVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterFieldOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterSelectLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterBoolVarFromArrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterBoolVarFromGroupedArrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterBoolVarFDICEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterMaxtermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterMintermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssFilterBoolVarRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFilterConstantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFilterOPTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssFilterSelectTypeEEnum = null;

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
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private filtersPackageImpl() {
		super(eNS_URI, filtersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link filtersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static filtersPackage init() {
		if (isInited) return (filtersPackage)EPackage.Registry.INSTANCE.getEPackage(filtersPackage.eNS_URI);

		// Obtain or create and register package
		filtersPackageImpl thefiltersPackage = (filtersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof filtersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new filtersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		tm_tc_formatPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thefiltersPackage.createPackageContents();

		// Initialize created meta-data
		thefiltersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thefiltersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(filtersPackage.eNS_URI, thefiltersPackage);
		return thefiltersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterFilter() {
		return gssFilterFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterFilter_FormatFile() {
		return (EReference)gssFilterFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterFilter_BoolVar() {
		return (EReference)gssFilterFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterFilter_BoolVarFromArrayItem() {
		return (EReference)gssFilterFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterFilter_BoolVarFromGroupedArrayItem() {
		return (EReference)gssFilterFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterFilter_BoolVarFDIC() {
		return (EReference)gssFilterFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterMaxtermFilter() {
		return gssFilterMaxtermFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterMaxtermFilter_Maxterm() {
		return (EReference)gssFilterMaxtermFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterMintermFilter() {
		return gssFilterMintermFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterMintermFilter_Minterm() {
		return (EReference)gssFilterMintermFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterBoolVar() {
		return gssFilterBoolVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVar_Id() {
		return (EAttribute)gssFilterBoolVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVar_Name() {
		return (EAttribute)gssFilterBoolVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVar_ConstantType() {
		return (EAttribute)gssFilterBoolVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVar_FieldRef() {
		return (EReference)gssFilterBoolVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVar_Op() {
		return (EReference)gssFilterBoolVarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVar_Constant() {
		return (EReference)gssFilterBoolVarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVar_Select() {
		return (EReference)gssFilterBoolVarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVar_SelectLine() {
		return (EReference)gssFilterBoolVarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterFieldOp() {
		return gssFilterFieldOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterFieldOp_Type() {
		return (EAttribute)gssFilterFieldOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterConstant() {
		return gssFilterConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterConstant_Value() {
		return (EAttribute)gssFilterConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterConstant_Mask() {
		return (EAttribute)gssFilterConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterSelect() {
		return gssFilterSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelect_FromFile() {
		return (EAttribute)gssFilterSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelect_Type() {
		return (EAttribute)gssFilterSelectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelect_Offset() {
		return (EAttribute)gssFilterSelectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelect_Size() {
		return (EAttribute)gssFilterSelectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelect_Mask() {
		return (EAttribute)gssFilterSelectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterSelectLine() {
		return gssFilterSelectLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelectLine_FromFile() {
		return (EAttribute)gssFilterSelectLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelectLine_Line() {
		return (EAttribute)gssFilterSelectLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelectLine_LeftTrim() {
		return (EAttribute)gssFilterSelectLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelectLine_RightTrim() {
		return (EAttribute)gssFilterSelectLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterSelectLine_Mask() {
		return (EAttribute)gssFilterSelectLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterBoolVarFromArrayItem() {
		return gssFilterBoolVarFromArrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromArrayItem_Id() {
		return (EAttribute)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromArrayItem_Name() {
		return (EAttribute)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromArrayItem_ConstantType() {
		return (EAttribute)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromArrayItem_AIFieldRef() {
		return (EReference)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromArrayItem_Op() {
		return (EReference)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromArrayItem_Constant() {
		return (EReference)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromArrayItem_Select() {
		return (EReference)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromArrayItem_SelectLine() {
		return (EReference)gssFilterBoolVarFromArrayItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterBoolVarFromGroupedArrayItem() {
		return gssFilterBoolVarFromGroupedArrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Id() {
		return (EAttribute)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Name() {
		return (EAttribute)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromGroupedArrayItem_ConstantType() {
		return (EAttribute)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFromGroupedArrayItem_Group() {
		return (EAttribute)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs() {
		return (EReference)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromGroupedArrayItem_Op() {
		return (EReference)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromGroupedArrayItem_Constant() {
		return (EReference)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromGroupedArrayItem_Select() {
		return (EReference)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFromGroupedArrayItem_SelectLine() {
		return (EReference)gssFilterBoolVarFromGroupedArrayItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterBoolVarFDIC() {
		return gssFilterBoolVarFDICEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFDIC_Id() {
		return (EAttribute)gssFilterBoolVarFDICEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarFDIC_Name() {
		return (EAttribute)gssFilterBoolVarFDICEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFDIC_FieldRef() {
		return (EReference)gssFilterBoolVarFDICEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterBoolVarFDIC_Op() {
		return (EReference)gssFilterBoolVarFDICEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterMaxterm() {
		return gssFilterMaxtermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterMaxterm_Id() {
		return (EAttribute)gssFilterMaxtermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterMaxterm_BoolVarRef() {
		return (EReference)gssFilterMaxtermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterMinterm() {
		return gssFilterMintermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterMinterm_Id() {
		return (EAttribute)gssFilterMintermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSFilterMinterm_BoolVarRef() {
		return (EReference)gssFilterMintermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSFilterBoolVarRef() {
		return gssFilterBoolVarRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSFilterBoolVarRef_IdRef() {
		return (EAttribute)gssFilterBoolVarRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFilterConstantType() {
		return gssFilterConstantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFilterOPType() {
		return gssFilterOPTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSFilterSelectType() {
		return gssFilterSelectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public filtersFactory getfiltersFactory() {
		return (filtersFactory)getEFactoryInstance();
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
		gssFilterFilterEClass = createEClass(GSS_FILTER_FILTER);
		createEReference(gssFilterFilterEClass, GSS_FILTER_FILTER__FORMAT_FILE);
		createEReference(gssFilterFilterEClass, GSS_FILTER_FILTER__BOOL_VAR);
		createEReference(gssFilterFilterEClass, GSS_FILTER_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
		createEReference(gssFilterFilterEClass, GSS_FILTER_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		createEReference(gssFilterFilterEClass, GSS_FILTER_FILTER__BOOL_VAR_FDIC);

		gssFilterMaxtermFilterEClass = createEClass(GSS_FILTER_MAXTERM_FILTER);
		createEReference(gssFilterMaxtermFilterEClass, GSS_FILTER_MAXTERM_FILTER__MAXTERM);

		gssFilterMintermFilterEClass = createEClass(GSS_FILTER_MINTERM_FILTER);
		createEReference(gssFilterMintermFilterEClass, GSS_FILTER_MINTERM_FILTER__MINTERM);

		gssFilterBoolVarEClass = createEClass(GSS_FILTER_BOOL_VAR);
		createEAttribute(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__ID);
		createEAttribute(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__NAME);
		createEAttribute(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__CONSTANT_TYPE);
		createEReference(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__FIELD_REF);
		createEReference(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__OP);
		createEReference(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__CONSTANT);
		createEReference(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__SELECT);
		createEReference(gssFilterBoolVarEClass, GSS_FILTER_BOOL_VAR__SELECT_LINE);

		gssFilterFieldOpEClass = createEClass(GSS_FILTER_FIELD_OP);
		createEAttribute(gssFilterFieldOpEClass, GSS_FILTER_FIELD_OP__TYPE);

		gssFilterConstantEClass = createEClass(GSS_FILTER_CONSTANT);
		createEAttribute(gssFilterConstantEClass, GSS_FILTER_CONSTANT__VALUE);
		createEAttribute(gssFilterConstantEClass, GSS_FILTER_CONSTANT__MASK);

		gssFilterSelectEClass = createEClass(GSS_FILTER_SELECT);
		createEAttribute(gssFilterSelectEClass, GSS_FILTER_SELECT__FROM_FILE);
		createEAttribute(gssFilterSelectEClass, GSS_FILTER_SELECT__TYPE);
		createEAttribute(gssFilterSelectEClass, GSS_FILTER_SELECT__OFFSET);
		createEAttribute(gssFilterSelectEClass, GSS_FILTER_SELECT__SIZE);
		createEAttribute(gssFilterSelectEClass, GSS_FILTER_SELECT__MASK);

		gssFilterSelectLineEClass = createEClass(GSS_FILTER_SELECT_LINE);
		createEAttribute(gssFilterSelectLineEClass, GSS_FILTER_SELECT_LINE__FROM_FILE);
		createEAttribute(gssFilterSelectLineEClass, GSS_FILTER_SELECT_LINE__LINE);
		createEAttribute(gssFilterSelectLineEClass, GSS_FILTER_SELECT_LINE__LEFT_TRIM);
		createEAttribute(gssFilterSelectLineEClass, GSS_FILTER_SELECT_LINE__RIGHT_TRIM);
		createEAttribute(gssFilterSelectLineEClass, GSS_FILTER_SELECT_LINE__MASK);

		gssFilterBoolVarFromArrayItemEClass = createEClass(GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM);
		createEAttribute(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__ID);
		createEAttribute(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__NAME);
		createEAttribute(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE);
		createEReference(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF);
		createEReference(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__OP);
		createEReference(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT);
		createEReference(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT);
		createEReference(gssFilterBoolVarFromArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE);

		gssFilterBoolVarFromGroupedArrayItemEClass = createEClass(GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		createEAttribute(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID);
		createEAttribute(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME);
		createEAttribute(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE);
		createEAttribute(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP);
		createEReference(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS);
		createEReference(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP);
		createEReference(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT);
		createEReference(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT);
		createEReference(gssFilterBoolVarFromGroupedArrayItemEClass, GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE);

		gssFilterBoolVarFDICEClass = createEClass(GSS_FILTER_BOOL_VAR_FDIC);
		createEAttribute(gssFilterBoolVarFDICEClass, GSS_FILTER_BOOL_VAR_FDIC__ID);
		createEAttribute(gssFilterBoolVarFDICEClass, GSS_FILTER_BOOL_VAR_FDIC__NAME);
		createEReference(gssFilterBoolVarFDICEClass, GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF);
		createEReference(gssFilterBoolVarFDICEClass, GSS_FILTER_BOOL_VAR_FDIC__OP);

		gssFilterMaxtermEClass = createEClass(GSS_FILTER_MAXTERM);
		createEAttribute(gssFilterMaxtermEClass, GSS_FILTER_MAXTERM__ID);
		createEReference(gssFilterMaxtermEClass, GSS_FILTER_MAXTERM__BOOL_VAR_REF);

		gssFilterMintermEClass = createEClass(GSS_FILTER_MINTERM);
		createEAttribute(gssFilterMintermEClass, GSS_FILTER_MINTERM__ID);
		createEReference(gssFilterMintermEClass, GSS_FILTER_MINTERM__BOOL_VAR_REF);

		gssFilterBoolVarRefEClass = createEClass(GSS_FILTER_BOOL_VAR_REF);
		createEAttribute(gssFilterBoolVarRefEClass, GSS_FILTER_BOOL_VAR_REF__ID_REF);

		// Create enums
		gssFilterConstantTypeEEnum = createEEnum(GSS_FILTER_CONSTANT_TYPE);
		gssFilterOPTypeEEnum = createEEnum(GSS_FILTER_OP_TYPE);
		gssFilterSelectTypeEEnum = createEEnum(GSS_FILTER_SELECT_TYPE);
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
		gssFilterFilterEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssFilterMaxtermFilterEClass.getESuperTypes().add(this.getGSSFilterFilter());
		gssFilterMintermFilterEClass.getESuperTypes().add(this.getGSSFilterFilter());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssFilterFilterEClass, GSSFilterFilter.class, "GSSFilterFilter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSFilterFilter_FormatFile(), thetm_tc_formatPackage.getGSSTmTcFormatTmTcFormat(), null, "formatFile", null, 1, 1, GSSFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterFilter_BoolVar(), this.getGSSFilterBoolVar(), null, "BoolVar", null, 0, -1, GSSFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterFilter_BoolVarFromArrayItem(), this.getGSSFilterBoolVarFromArrayItem(), null, "BoolVarFromArrayItem", null, 0, -1, GSSFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterFilter_BoolVarFromGroupedArrayItem(), this.getGSSFilterBoolVarFromGroupedArrayItem(), null, "BoolVarFromGroupedArrayItem", null, 0, -1, GSSFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterFilter_BoolVarFDIC(), this.getGSSFilterBoolVarFDIC(), null, "BoolVarFDIC", null, 0, -1, GSSFilterFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterMaxtermFilterEClass, GSSFilterMaxtermFilter.class, "GSSFilterMaxtermFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSFilterMaxtermFilter_Maxterm(), this.getGSSFilterMaxterm(), null, "Maxterm", null, 1, 10, GSSFilterMaxtermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterMintermFilterEClass, GSSFilterMintermFilter.class, "GSSFilterMintermFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSFilterMintermFilter_Minterm(), this.getGSSFilterMinterm(), null, "Minterm", null, 1, 10, GSSFilterMintermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterBoolVarEClass, GSSFilterBoolVar.class, "GSSFilterBoolVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterBoolVar_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVar_ConstantType(), this.getGSSFilterConstantType(), "constantType", null, 1, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVar_FieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatField(), null, "FieldRef", null, 1, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVar_Op(), this.getGSSFilterFieldOp(), null, "Op", null, 1, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVar_Constant(), this.getGSSFilterConstant(), null, "Constant", null, 0, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVar_Select(), this.getGSSFilterSelect(), null, "Select", null, 0, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVar_SelectLine(), this.getGSSFilterSelectLine(), null, "SelectLine", null, 0, 1, GSSFilterBoolVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterFieldOpEClass, GSSFilterFieldOp.class, "GSSFilterFieldOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterFieldOp_Type(), this.getGSSFilterOPType(), "type", null, 1, 1, GSSFilterFieldOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterConstantEClass, GSSFilterConstant.class, "GSSFilterConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterConstant_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSFilterConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterConstant_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, GSSFilterConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterSelectEClass, GSSFilterSelect.class, "GSSFilterSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterSelect_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, GSSFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelect_Type(), this.getGSSFilterSelectType(), "type", null, 1, 1, GSSFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelect_Offset(), ecorePackage.getEString(), "offset", null, 0, 1, GSSFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelect_Size(), ecorePackage.getEString(), "size", null, 0, 1, GSSFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelect_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, GSSFilterSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterSelectLineEClass, GSSFilterSelectLine.class, "GSSFilterSelectLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterSelectLine_FromFile(), ecorePackage.getEString(), "fromFile", null, 1, 1, GSSFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelectLine_Line(), ecorePackage.getEString(), "line", null, 1, 1, GSSFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelectLine_LeftTrim(), ecorePackage.getEString(), "leftTrim", null, 0, 1, GSSFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelectLine_RightTrim(), ecorePackage.getEString(), "rightTrim", null, 0, 1, GSSFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterSelectLine_Mask(), ecorePackage.getEString(), "mask", null, 0, 1, GSSFilterSelectLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterBoolVarFromArrayItemEClass, GSSFilterBoolVarFromArrayItem.class, "GSSFilterBoolVarFromArrayItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterBoolVarFromArrayItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFromArrayItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFromArrayItem_ConstantType(), this.getGSSFilterConstantType(), "constantType", null, 1, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromArrayItem_AIFieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatAIField(), null, "AIFieldRef", null, 1, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromArrayItem_Op(), this.getGSSFilterFieldOp(), null, "Op", null, 1, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromArrayItem_Constant(), this.getGSSFilterConstant(), null, "Constant", null, 0, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromArrayItem_Select(), this.getGSSFilterSelect(), null, "Select", null, 0, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromArrayItem_SelectLine(), this.getGSSFilterSelectLine(), null, "SelectLine", null, 0, 1, GSSFilterBoolVarFromArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterBoolVarFromGroupedArrayItemEClass, GSSFilterBoolVarFromGroupedArrayItem.class, "GSSFilterBoolVarFromGroupedArrayItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterBoolVarFromGroupedArrayItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFromGroupedArrayItem_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFromGroupedArrayItem_ConstantType(), this.getGSSFilterConstantType(), "constantType", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFromGroupedArrayItem_Group(), ecorePackage.getEString(), "group", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs(), thetm_tc_formatPackage.getGSSTmTcFormatAField(), null, "AIFieldRefs", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromGroupedArrayItem_Op(), this.getGSSFilterFieldOp(), null, "Op", null, 1, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromGroupedArrayItem_Constant(), this.getGSSFilterConstant(), null, "Constant", null, 0, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromGroupedArrayItem_Select(), this.getGSSFilterSelect(), null, "Select", null, 0, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFromGroupedArrayItem_SelectLine(), this.getGSSFilterSelectLine(), null, "SelectLine", null, 0, 1, GSSFilterBoolVarFromGroupedArrayItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterBoolVarFDICEClass, GSSFilterBoolVarFDIC.class, "GSSFilterBoolVarFDIC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterBoolVarFDIC_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSFilterBoolVarFDIC_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFDIC_FieldRef(), thetm_tc_formatPackage.getGSSTmTcFormatFDICField(), null, "FieldRef", null, 1, 1, GSSFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterBoolVarFDIC_Op(), this.getGSSFilterFieldOp(), null, "Op", null, 1, 1, GSSFilterBoolVarFDIC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterMaxtermEClass, GSSFilterMaxterm.class, "GSSFilterMaxterm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterMaxterm_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterMaxterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterMaxterm_BoolVarRef(), this.getGSSFilterBoolVarRef(), null, "BoolVarRef", null, 1, -1, GSSFilterMaxterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterMintermEClass, GSSFilterMinterm.class, "GSSFilterMinterm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterMinterm_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSFilterMinterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSFilterMinterm_BoolVarRef(), this.getGSSFilterBoolVarRef(), null, "BoolVarRef", null, 1, -1, GSSFilterMinterm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssFilterBoolVarRefEClass, GSSFilterBoolVarRef.class, "GSSFilterBoolVarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSFilterBoolVarRef_IdRef(), ecorePackage.getEString(), "idRef", null, 1, 1, GSSFilterBoolVarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssFilterConstantTypeEEnum, GSSFilterConstantType.class, "GSSFilterConstantType");
		addEEnumLiteral(gssFilterConstantTypeEEnum, GSSFilterConstantType.DECIMAL);
		addEEnumLiteral(gssFilterConstantTypeEEnum, GSSFilterConstantType.HEX);
		addEEnumLiteral(gssFilterConstantTypeEEnum, GSSFilterConstantType.BINARY);
		addEEnumLiteral(gssFilterConstantTypeEEnum, GSSFilterConstantType.CHAR);
		addEEnumLiteral(gssFilterConstantTypeEEnum, GSSFilterConstantType.STRING);

		initEEnum(gssFilterOPTypeEEnum, GSSFilterOPType.class, "GSSFilterOPType");
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.EQUAL);
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.DIFFERENT);
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.BIGGER_THAN);
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.SMALLER_THAN);
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.BIGGER_OR_EQUAL);
		addEEnumLiteral(gssFilterOPTypeEEnum, GSSFilterOPType.SMALLER_OR_EQUAL);

		initEEnum(gssFilterSelectTypeEEnum, GSSFilterSelectType.class, "GSSFilterSelectType");
		addEEnumLiteral(gssFilterSelectTypeEEnum, GSSFilterSelectType.DATA);
		addEEnumLiteral(gssFilterSelectTypeEEnum, GSSFilterSelectType.SIZE);
		addEEnumLiteral(gssFilterSelectTypeEEnum, GSSFilterSelectType.CRC);

		// Create resource
		createResource(eNS_URI);
	}

} //filtersPackageImpl
