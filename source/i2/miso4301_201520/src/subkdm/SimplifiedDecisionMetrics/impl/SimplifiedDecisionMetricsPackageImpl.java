/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement;
import subkdm.SimplifiedDecisionMetrics.Grade;
import subkdm.SimplifiedDecisionMetrics.Measure;
import subkdm.SimplifiedDecisionMetrics.Measurement;
import subkdm.SimplifiedDecisionMetrics.MofElement;
import subkdm.SimplifiedDecisionMetrics.Observation;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsFactory;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

import subkdm.kdmObjects.KdmObjectsPackage;

import subkdm.kdmObjects.impl.KdmObjectsPackageImpl;

import subkdm.kdmRelations.KdmRelationsPackage;

import subkdm.kdmRelations.impl.KdmRelationsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedDecisionMetricsPackageImpl extends EPackageImpl implements SimplifiedDecisionMetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionalMeasurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplifiedDecisionMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mofElementEClass = null;

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
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplifiedDecisionMetricsPackageImpl() {
		super(eNS_URI, SimplifiedDecisionMetricsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SimplifiedDecisionMetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplifiedDecisionMetricsPackage init() {
		if (isInited) return (SimplifiedDecisionMetricsPackage)EPackage.Registry.INSTANCE.getEPackage(SimplifiedDecisionMetricsPackage.eNS_URI);

		// Obtain or create and register package
		SimplifiedDecisionMetricsPackageImpl theSimplifiedDecisionMetricsPackage = (SimplifiedDecisionMetricsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimplifiedDecisionMetricsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimplifiedDecisionMetricsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KdmObjectsPackageImpl theKdmObjectsPackage = (KdmObjectsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmObjectsPackage.eNS_URI) instanceof KdmObjectsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmObjectsPackage.eNS_URI) : KdmObjectsPackage.eINSTANCE);
		KdmRelationsPackageImpl theKdmRelationsPackage = (KdmRelationsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KdmRelationsPackage.eNS_URI) instanceof KdmRelationsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KdmRelationsPackage.eNS_URI) : KdmRelationsPackage.eINSTANCE);

		// Create package meta-data objects
		theSimplifiedDecisionMetricsPackage.createPackageContents();
		theKdmObjectsPackage.createPackageContents();
		theKdmRelationsPackage.createPackageContents();

		// Initialize created meta-data
		theSimplifiedDecisionMetricsPackage.initializePackageContents();
		theKdmObjectsPackage.initializePackageContents();
		theKdmRelationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplifiedDecisionMetricsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimplifiedDecisionMetricsPackage.eNS_URI, theSimplifiedDecisionMetricsPackage);
		return theSimplifiedDecisionMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservation_WhenObserved() {
		return (EAttribute)observationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Measures() {
		return (EReference)observationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasure_Measurements() {
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Name() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasure_Description() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_Measurant() {
		return (EReference)measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrade_Value() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionalMeasurement() {
		return dimensionalMeasurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionalMeasurement_Value() {
		return (EAttribute)dimensionalMeasurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplifiedDecisionMetrics() {
		return simplifiedDecisionMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplifiedDecisionMetrics_Observations() {
		return (EReference)simplifiedDecisionMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMofElement() {
		return mofElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofElement_Measurant() {
		return (EReference)mofElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMofElement_Element() {
		return (EReference)mofElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetricsFactory getSimplifiedDecisionMetricsFactory() {
		return (SimplifiedDecisionMetricsFactory)getEFactoryInstance();
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
		observationEClass = createEClass(OBSERVATION);
		createEAttribute(observationEClass, OBSERVATION__WHEN_OBSERVED);
		createEReference(observationEClass, OBSERVATION__MEASURES);

		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__MEASUREMENTS);
		createEAttribute(measureEClass, MEASURE__NAME);
		createEAttribute(measureEClass, MEASURE__DESCRIPTION);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__MEASURANT);

		gradeEClass = createEClass(GRADE);
		createEAttribute(gradeEClass, GRADE__VALUE);

		dimensionalMeasurementEClass = createEClass(DIMENSIONAL_MEASUREMENT);
		createEAttribute(dimensionalMeasurementEClass, DIMENSIONAL_MEASUREMENT__VALUE);

		simplifiedDecisionMetricsEClass = createEClass(SIMPLIFIED_DECISION_METRICS);
		createEReference(simplifiedDecisionMetricsEClass, SIMPLIFIED_DECISION_METRICS__OBSERVATIONS);

		mofElementEClass = createEClass(MOF_ELEMENT);
		createEReference(mofElementEClass, MOF_ELEMENT__MEASURANT);
		createEReference(mofElementEClass, MOF_ELEMENT__ELEMENT);
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
		gradeEClass.getESuperTypes().add(this.getMeasurement());
		dimensionalMeasurementEClass.getESuperTypes().add(this.getMeasurement());

		// Initialize classes, features, and operations; add parameters
		initEClass(observationEClass, Observation.class, "Observation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObservation_WhenObserved(), ecorePackage.getEDate(), "whenObserved", null, 0, 1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObservation_Measures(), this.getMeasure(), null, "measures", null, 0, -1, Observation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_Measurements(), this.getMeasurement(), null, "measurements", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Description(), ecorePackage.getEString(), "description", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measurementEClass, Measurement.class, "Measurement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_Measurant(), this.getMofElement(), this.getMofElement_Measurant(), "measurant", null, 0, 1, Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrade_Value(), ecorePackage.getEString(), "value", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionalMeasurementEClass, DimensionalMeasurement.class, "DimensionalMeasurement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensionalMeasurement_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DimensionalMeasurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplifiedDecisionMetricsEClass, SimplifiedDecisionMetrics.class, "SimplifiedDecisionMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplifiedDecisionMetrics_Observations(), this.getObservation(), null, "observations", null, 0, -1, SimplifiedDecisionMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mofElementEClass, MofElement.class, "MofElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMofElement_Measurant(), this.getMeasurement(), this.getMeasurement_Measurant(), "measurant", null, 0, -1, MofElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMofElement_Element(), theKdmObjectsPackage.getModelElement(), null, "element", null, 0, 1, MofElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SimplifiedDecisionMetricsPackageImpl
