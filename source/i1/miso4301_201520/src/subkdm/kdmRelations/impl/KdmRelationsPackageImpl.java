/**
 */
package subkdm.kdmRelations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

import subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl;

import subkdm.kdmObjects.KdmObjectsPackage;

import subkdm.kdmObjects.impl.KdmObjectsPackageImpl;

import subkdm.kdmRelations.AbstractActionRelationship;
import subkdm.kdmRelations.AbstractCodeRelationship;
import subkdm.kdmRelations.Calls;
import subkdm.kdmRelations.Creates;
import subkdm.kdmRelations.Extends;
import subkdm.kdmRelations.HasValue;
import subkdm.kdmRelations.ImplementationOf;
import subkdm.kdmRelations.Implements;
import subkdm.kdmRelations.Imports;
import subkdm.kdmRelations.KdmRelationsFactory;
import subkdm.kdmRelations.KdmRelationsPackage;
import subkdm.kdmRelations.Reads;
import subkdm.kdmRelations.Writes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KdmRelationsPackageImpl extends EPackageImpl implements KdmRelationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCodeRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementationOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsEClass = null;

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
	 * @see subkdm.kdmRelations.KdmRelationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KdmRelationsPackageImpl() {
		super(eNS_URI, KdmRelationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KdmRelationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KdmRelationsPackage init() {
		if (isInited) return (KdmRelationsPackage)EPackage.Registry.INSTANCE.getEPackage(KdmRelationsPackage.eNS_URI);

		// Obtain or create and register package
		KdmRelationsPackageImpl theKdmRelationsPackage = (KdmRelationsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof KdmRelationsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new KdmRelationsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KdmObjectsPackageImpl theKdmObjectsPackage = (KdmObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmObjectsPackage.eNS_URI) instanceof KdmObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmObjectsPackage.eNS_URI) : KdmObjectsPackage.eINSTANCE);
		SimplifiedDecisionMetricsPackageImpl theSimplifiedDecisionMetricsPackage = (SimplifiedDecisionMetricsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimplifiedDecisionMetricsPackage.eNS_URI) instanceof SimplifiedDecisionMetricsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimplifiedDecisionMetricsPackage.eNS_URI) : SimplifiedDecisionMetricsPackage.eINSTANCE);

		// Create package meta-data objects
		theKdmRelationsPackage.createPackageContents();
		theKdmObjectsPackage.createPackageContents();
		theSimplifiedDecisionMetricsPackage.createPackageContents();

		// Initialize created meta-data
		theKdmRelationsPackage.initializePackageContents();
		theKdmObjectsPackage.initializePackageContents();
		theSimplifiedDecisionMetricsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKdmRelationsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KdmRelationsPackage.eNS_URI, theKdmRelationsPackage);
		return theKdmRelationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCodeRelationship() {
		return abstractCodeRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeRelationship_To() {
		return (EReference)abstractCodeRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCodeRelationship_From() {
		return (EReference)abstractCodeRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalls() {
		return callsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReads() {
		return readsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrites() {
		return writesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreates() {
		return createsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationOf() {
		return implementationOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasValue() {
		return hasValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplements() {
		return implementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractActionRelationship() {
		return abstractActionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActionRelationship_To() {
		return (EReference)abstractActionRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractActionRelationship_From() {
		return (EReference)abstractActionRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtends() {
		return extendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmRelationsFactory getKdmRelationsFactory() {
		return (KdmRelationsFactory)getEFactoryInstance();
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
		abstractCodeRelationshipEClass = createEClass(ABSTRACT_CODE_RELATIONSHIP);
		createEReference(abstractCodeRelationshipEClass, ABSTRACT_CODE_RELATIONSHIP__TO);
		createEReference(abstractCodeRelationshipEClass, ABSTRACT_CODE_RELATIONSHIP__FROM);

		callsEClass = createEClass(CALLS);

		readsEClass = createEClass(READS);

		writesEClass = createEClass(WRITES);

		createsEClass = createEClass(CREATES);

		implementationOfEClass = createEClass(IMPLEMENTATION_OF);

		hasValueEClass = createEClass(HAS_VALUE);

		importsEClass = createEClass(IMPORTS);

		implementsEClass = createEClass(IMPLEMENTS);

		abstractActionRelationshipEClass = createEClass(ABSTRACT_ACTION_RELATIONSHIP);
		createEReference(abstractActionRelationshipEClass, ABSTRACT_ACTION_RELATIONSHIP__TO);
		createEReference(abstractActionRelationshipEClass, ABSTRACT_ACTION_RELATIONSHIP__FROM);

		extendsEClass = createEClass(EXTENDS);
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
		KdmObjectsPackage theKdmObjectsPackage = (KdmObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(KdmObjectsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractCodeRelationshipEClass.getESuperTypes().add(theKdmObjectsPackage.getModelElement());
		callsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		readsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		writesEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		createsEClass.getESuperTypes().add(this.getAbstractActionRelationship());
		implementationOfEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		hasValueEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		importsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		implementsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());
		abstractActionRelationshipEClass.getESuperTypes().add(theKdmObjectsPackage.getModelElement());
		extendsEClass.getESuperTypes().add(this.getAbstractCodeRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCodeRelationshipEClass, AbstractCodeRelationship.class, "AbstractCodeRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCodeRelationship_To(), theKdmObjectsPackage.getAbstractCodeElement(), null, "to", null, 1, 1, AbstractCodeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCodeRelationship_From(), theKdmObjectsPackage.getAbstractCodeElement(), null, "from", null, 1, 1, AbstractCodeRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callsEClass, Calls.class, "Calls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readsEClass, Reads.class, "Reads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writesEClass, Writes.class, "Writes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createsEClass, Creates.class, "Creates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementationOfEClass, ImplementationOf.class, "ImplementationOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasValueEClass, HasValue.class, "HasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractActionRelationshipEClass, AbstractActionRelationship.class, "AbstractActionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractActionRelationship_To(), theKdmObjectsPackage.getAbstractCodeElement(), null, "to", null, 1, 1, AbstractActionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractActionRelationship_From(), theKdmObjectsPackage.getAbstractCodeElement(), null, "from", null, 1, 1, AbstractActionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KdmRelationsPackageImpl
