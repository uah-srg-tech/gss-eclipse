/**
 */
package test_campaign.impl;

import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import test_campaign.GSSTestCampaignTestCampaign;
import test_campaign.Test_campaignFactory;
import test_campaign.Test_campaignPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Test_campaignPackageImpl extends EPackageImpl implements Test_campaignPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssTestCampaignTestCampaignEClass = null;

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
	 * @see test_campaign.Test_campaignPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Test_campaignPackageImpl() {
		super(eNS_URI, Test_campaignFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Test_campaignPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Test_campaignPackage init() {
		if (isInited) return (Test_campaignPackage)EPackage.Registry.INSTANCE.getEPackage(Test_campaignPackage.eNS_URI);

		// Obtain or create and register package
		Test_campaignPackageImpl theTest_campaignPackage = (Test_campaignPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Test_campaignPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Test_campaignPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		test_procPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTest_campaignPackage.createPackageContents();

		// Initialize created meta-data
		theTest_campaignPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTest_campaignPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Test_campaignPackage.eNS_URI, theTest_campaignPackage);
		return theTest_campaignPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSTestCampaignTestCampaign() {
		return gssTestCampaignTestCampaignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSTestCampaignTestCampaign_Name() {
		return (EAttribute)gssTestCampaignTestCampaignEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSTestCampaignTestCampaign_Test_proc() {
		return (EReference)gssTestCampaignTestCampaignEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test_campaignFactory getTest_campaignFactory() {
		return (Test_campaignFactory)getEFactoryInstance();
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
		gssTestCampaignTestCampaignEClass = createEClass(GSS_TEST_CAMPAIGN_TEST_CAMPAIGN);
		createEAttribute(gssTestCampaignTestCampaignEClass, GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__NAME);
		createEReference(gssTestCampaignTestCampaignEClass, GSS_TEST_CAMPAIGN_TEST_CAMPAIGN__TEST_PROC);
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
		test_procPackage thetest_procPackage = (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gssTestCampaignTestCampaignEClass, GSSTestCampaignTestCampaign.class, "GSSTestCampaignTestCampaign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSTestCampaignTestCampaign_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSTestCampaignTestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSTestCampaignTestCampaign_Test_proc(), thetest_procPackage.getGSSTestProcTestProc(), null, "test_proc", null, 1, -1, GSSTestCampaignTestCampaign.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Test_campaignPackageImpl
