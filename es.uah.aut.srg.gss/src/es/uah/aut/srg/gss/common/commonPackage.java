/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.common.commonFactory
 * @model kind="package"
 * @generated
 */
public interface commonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	commonPackage eINSTANCE = es.uah.aut.srg.gss.common.impl.commonPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelFileImpl <em>GSS Model File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.common.impl.GSSModelFileImpl
	 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelFile()
	 * @generated
	 */
	int GSS_MODEL_FILE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>GSS Model File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Model File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelFileImportImpl <em>GSS Model File Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.common.impl.GSSModelFileImportImpl
	 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelFileImport()
	 * @generated
	 */
	int GSS_MODEL_FILE_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE_IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>GSS Model File Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE_IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Model File Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_FILE_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelElementImpl <em>GSS Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.common.impl.GSSModelElementImpl
	 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelElement()
	 * @generated
	 */
	int GSS_MODEL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT__URI = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>GSS Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelObjectImpl <em>GSS Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.common.impl.GSSModelObjectImpl
	 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelObject()
	 * @generated
	 */
	int GSS_MODEL_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_OBJECT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>GSS Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_MODEL_OBJECT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.common.GSSModelFile <em>GSS Model File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Model File</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelFile
	 * @generated
	 */
	EClass getGSSModelFile();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.common.GSSModelFile#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelFile#getElement()
	 * @see #getGSSModelFile()
	 * @generated
	 */
	EReference getGSSModelFile_Element();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.common.GSSModelFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelFile#getImports()
	 * @see #getGSSModelFile()
	 * @generated
	 */
	EReference getGSSModelFile_Imports();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.common.GSSModelFileImport <em>GSS Model File Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Model File Import</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelFileImport
	 * @generated
	 */
	EClass getGSSModelFileImport();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelFileImport#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelFileImport#getImportURI()
	 * @see #getGSSModelFileImport()
	 * @generated
	 */
	EAttribute getGSSModelFileImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.common.GSSModelElement <em>GSS Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Model Element</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement
	 * @generated
	 */
	EClass getGSSModelElement();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement#getName()
	 * @see #getGSSModelElement()
	 * @generated
	 */
	EAttribute getGSSModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelElement#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement#getUri()
	 * @see #getGSSModelElement()
	 * @generated
	 */
	EAttribute getGSSModelElement_Uri();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement#getVersion()
	 * @see #getGSSModelElement()
	 * @generated
	 */
	EAttribute getGSSModelElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement#getDescription()
	 * @see #getGSSModelElement()
	 * @generated
	 */
	EAttribute getGSSModelElement_Description();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.common.GSSModelObject <em>GSS Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Model Object</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelObject
	 * @generated
	 */
	EClass getGSSModelObject();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelObject#getName()
	 * @see #getGSSModelObject()
	 * @generated
	 */
	EAttribute getGSSModelObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.common.GSSModelObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.uah.aut.srg.gss.common.GSSModelObject#getDescription()
	 * @see #getGSSModelObject()
	 * @generated
	 */
	EAttribute getGSSModelObject_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	commonFactory getcommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelFileImpl <em>GSS Model File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.common.impl.GSSModelFileImpl
		 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelFile()
		 * @generated
		 */
		EClass GSS_MODEL_FILE = eINSTANCE.getGSSModelFile();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_MODEL_FILE__ELEMENT = eINSTANCE.getGSSModelFile_Element();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_MODEL_FILE__IMPORTS = eINSTANCE.getGSSModelFile_Imports();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelFileImportImpl <em>GSS Model File Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.common.impl.GSSModelFileImportImpl
		 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelFileImport()
		 * @generated
		 */
		EClass GSS_MODEL_FILE_IMPORT = eINSTANCE.getGSSModelFileImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_FILE_IMPORT__IMPORT_URI = eINSTANCE.getGSSModelFileImport_ImportURI();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelElementImpl <em>GSS Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.common.impl.GSSModelElementImpl
		 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelElement()
		 * @generated
		 */
		EClass GSS_MODEL_ELEMENT = eINSTANCE.getGSSModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_ELEMENT__NAME = eINSTANCE.getGSSModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_ELEMENT__URI = eINSTANCE.getGSSModelElement_Uri();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_ELEMENT__VERSION = eINSTANCE.getGSSModelElement_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getGSSModelElement_Description();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.common.impl.GSSModelObjectImpl <em>GSS Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.common.impl.GSSModelObjectImpl
		 * @see es.uah.aut.srg.gss.common.impl.commonPackageImpl#getGSSModelObject()
		 * @generated
		 */
		EClass GSS_MODEL_OBJECT = eINSTANCE.getGSSModelObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_OBJECT__NAME = eINSTANCE.getGSSModelObject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_MODEL_OBJECT__DESCRIPTION = eINSTANCE.getGSSModelObject_Description();

	}

} //commonPackage
