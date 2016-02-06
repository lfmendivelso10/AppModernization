/**
 */
package subkdm.SimplifiedDecisionMetrics;

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
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsFactory
 * @model kind="package"
 * @generated
 */
public interface SimplifiedDecisionMetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SimplifiedDecisionMetrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subkdm/sdm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sdm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplifiedDecisionMetricsPackage eINSTANCE = subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 0;

	/**
	 * The feature id for the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__WHEN_OBSERVED = 0;

	/**
	 * The feature id for the '<em><b>Measurements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__MEASUREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.MeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.MeasurementImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 2;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURANT = 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURE = 1;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.GradeImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 3;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURANT = MEASUREMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.DimensionalMeasurementImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getDimensionalMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_MEASUREMENT = 4;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURANT = MEASUREMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_OPERATION_COUNT = MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.DimensionalToObjectMeasurementImpl <em>Dimensional To Object Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.DimensionalToObjectMeasurementImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getDimensionalToObjectMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT = 5;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__MEASURANT = DIMENSIONAL_MEASUREMENT__MEASURANT;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimensional To Object Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dimensional To Object Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_TO_OBJECT_MEASUREMENT_OPERATION_COUNT = DIMENSIONAL_MEASUREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsImpl <em>Simplified Decision Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getSimplifiedDecisionMetrics()
	 * @generated
	 */
	int SIMPLIFIED_DECISION_METRICS = 6;

	/**
	 * The feature id for the '<em><b>Observations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS__OBSERVATIONS = 0;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS__MEASURES = 1;

	/**
	 * The number of structural features of the '<em>Simplified Decision Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simplified Decision Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLIFIED_DECISION_METRICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl <em>Mof Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMofElement()
	 * @generated
	 */
	int MOF_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Measurant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT__MEASURANT = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Mof Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mof Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOF_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.CouplingBetweenObjectsMeasureImpl <em>Coupling Between Objects Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.CouplingBetweenObjectsMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getCouplingBetweenObjectsMeasure()
	 * @generated
	 */
	int COUPLING_BETWEEN_OBJECTS_MEASURE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECTS_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECTS_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Coupling Between Objects Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECTS_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Coupling Between Objects Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_BETWEEN_OBJECTS_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.WeightedMethodsPerClassMeasureImpl <em>Weighted Methods Per Class Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.WeightedMethodsPerClassMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getWeightedMethodsPerClassMeasure()
	 * @generated
	 */
	int WEIGHTED_METHODS_PER_CLASS_MEASURE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_METHODS_PER_CLASS_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_METHODS_PER_CLASS_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Weighted Methods Per Class Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_METHODS_PER_CLASS_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Weighted Methods Per Class Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIGHTED_METHODS_PER_CLASS_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfUsesMeasureImpl <em>Number Of Uses Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfUsesMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfUsesMeasure()
	 * @generated
	 */
	int NUMBER_OF_USES_MEASURE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Uses Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Uses Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_USES_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfContainmentsMeasureImpl <em>Number Of Containments Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfContainmentsMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfContainmentsMeasure()
	 * @generated
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Containments Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Containments Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CONTAINMENTS_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.CalculatedCouplingMeasureImpl <em>Calculated Coupling Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.CalculatedCouplingMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getCalculatedCouplingMeasure()
	 * @generated
	 */
	int CALCULATED_COUPLING_MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Calculated Coupling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calculated Coupling Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALCULATED_COUPLING_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfClassesMeasureImpl <em>Number Of Classes Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfClassesMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfClassesMeasure()
	 * @generated
	 */
	int NUMBER_OF_CLASSES_MEASURE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Classes Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Classes Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CLASSES_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfLinesMeasureImpl <em>Number Of Lines Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfLinesMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfLinesMeasure()
	 * @generated
	 */
	int NUMBER_OF_LINES_MEASURE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_LINES_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_LINES_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Number Of Lines Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_LINES_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Of Lines Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_LINES_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.SimplifiedDecisionMetrics.impl.ClusterRelationConflictPercentageMeasureImpl <em>Cluster Relation Conflict Percentage Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.SimplifiedDecisionMetrics.impl.ClusterRelationConflictPercentageMeasureImpl
	 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getClusterRelationConflictPercentageMeasure()
	 * @generated
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE__DESCRIPTION = MEASURE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Cluster Relation Conflict Percentage Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cluster Relation Conflict Percentage Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_OPERATION_COUNT = MEASURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.SimplifiedDecisionMetrics.Observation#getWhenObserved <em>When Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Observed</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Observation#getWhenObserved()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_WhenObserved();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.SimplifiedDecisionMetrics.Observation#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurements</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Observation#getMeasurements()
	 * @see #getObservation()
	 * @generated
	 */
	EReference getObservation_Measurements();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.SimplifiedDecisionMetrics.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.SimplifiedDecisionMetrics.Measure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measure#getDescription()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Description();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the reference '{@link subkdm.SimplifiedDecisionMetrics.Measurement#getMeasurant <em>Measurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measurant</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measurement#getMeasurant()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measurant();

	/**
	 * Returns the meta object for the reference '{@link subkdm.SimplifiedDecisionMetrics.Measurement#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Measurement#getMeasure()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.SimplifiedDecisionMetrics.Grade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.Grade#getValue()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Value();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measurement</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement
	 * @generated
	 */
	EClass getDimensionalMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement#getValue()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EAttribute getDimensionalMeasurement_Value();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement <em>Dimensional To Object Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional To Object Measurement</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement
	 * @generated
	 */
	EClass getDimensionalToObjectMeasurement();

	/**
	 * Returns the meta object for the reference '{@link subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement#getObject()
	 * @see #getDimensionalToObjectMeasurement()
	 * @generated
	 */
	EReference getDimensionalToObjectMeasurement_Object();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics <em>Simplified Decision Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simplified Decision Metrics</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics
	 * @generated
	 */
	EClass getSimplifiedDecisionMetrics();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics#getObservations <em>Observations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Observations</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics#getObservations()
	 * @see #getSimplifiedDecisionMetrics()
	 * @generated
	 */
	EReference getSimplifiedDecisionMetrics_Observations();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics#getMeasures()
	 * @see #getSimplifiedDecisionMetrics()
	 * @generated
	 */
	EReference getSimplifiedDecisionMetrics_Measures();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.MofElement <em>Mof Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mof Element</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.MofElement
	 * @generated
	 */
	EClass getMofElement();

	/**
	 * Returns the meta object for the reference list '{@link subkdm.SimplifiedDecisionMetrics.MofElement#getMeasurant <em>Measurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measurant</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.MofElement#getMeasurant()
	 * @see #getMofElement()
	 * @generated
	 */
	EReference getMofElement_Measurant();

	/**
	 * Returns the meta object for the reference '{@link subkdm.SimplifiedDecisionMetrics.MofElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.MofElement#getElement()
	 * @see #getMofElement()
	 * @generated
	 */
	EReference getMofElement_Element();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.CouplingBetweenObjectsMeasure <em>Coupling Between Objects Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupling Between Objects Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.CouplingBetweenObjectsMeasure
	 * @generated
	 */
	EClass getCouplingBetweenObjectsMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.WeightedMethodsPerClassMeasure <em>Weighted Methods Per Class Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weighted Methods Per Class Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.WeightedMethodsPerClassMeasure
	 * @generated
	 */
	EClass getWeightedMethodsPerClassMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfUsesMeasure <em>Number Of Uses Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Uses Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfUsesMeasure
	 * @generated
	 */
	EClass getNumberOfUsesMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfContainmentsMeasure <em>Number Of Containments Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Containments Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfContainmentsMeasure
	 * @generated
	 */
	EClass getNumberOfContainmentsMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.CalculatedCouplingMeasure <em>Calculated Coupling Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calculated Coupling Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.CalculatedCouplingMeasure
	 * @generated
	 */
	EClass getCalculatedCouplingMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfClassesMeasure <em>Number Of Classes Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Classes Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfClassesMeasure
	 * @generated
	 */
	EClass getNumberOfClassesMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfLinesMeasure <em>Number Of Lines Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Lines Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfLinesMeasure
	 * @generated
	 */
	EClass getNumberOfLinesMeasure();

	/**
	 * Returns the meta object for class '{@link subkdm.SimplifiedDecisionMetrics.ClusterRelationConflictPercentageMeasure <em>Cluster Relation Conflict Percentage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * @see subkdm.SimplifiedDecisionMetrics.ClusterRelationConflictPercentageMeasure
	 * @generated
	 */
	EClass getClusterRelationConflictPercentageMeasure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplifiedDecisionMetricsFactory getSimplifiedDecisionMetricsFactory();

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
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>When Observed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__WHEN_OBSERVED = eINSTANCE.getObservation_WhenObserved();

		/**
		 * The meta object literal for the '<em><b>Measurements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSERVATION__MEASUREMENTS = eINSTANCE.getObservation_Measurements();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.MeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__DESCRIPTION = eINSTANCE.getMeasure_Description();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.MeasurementImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measurant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURANT = eINSTANCE.getMeasurement_Measurant();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURE = eINSTANCE.getMeasurement_Measure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.GradeImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.DimensionalMeasurementImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getDimensionalMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASUREMENT__VALUE = eINSTANCE.getDimensionalMeasurement_Value();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.DimensionalToObjectMeasurementImpl <em>Dimensional To Object Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.DimensionalToObjectMeasurementImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getDimensionalToObjectMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_TO_OBJECT_MEASUREMENT = eINSTANCE.getDimensionalToObjectMeasurement();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT = eINSTANCE.getDimensionalToObjectMeasurement_Object();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsImpl <em>Simplified Decision Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getSimplifiedDecisionMetrics()
		 * @generated
		 */
		EClass SIMPLIFIED_DECISION_METRICS = eINSTANCE.getSimplifiedDecisionMetrics();

		/**
		 * The meta object literal for the '<em><b>Observations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLIFIED_DECISION_METRICS__OBSERVATIONS = eINSTANCE.getSimplifiedDecisionMetrics_Observations();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLIFIED_DECISION_METRICS__MEASURES = eINSTANCE.getSimplifiedDecisionMetrics_Measures();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl <em>Mof Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.MofElementImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getMofElement()
		 * @generated
		 */
		EClass MOF_ELEMENT = eINSTANCE.getMofElement();

		/**
		 * The meta object literal for the '<em><b>Measurant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_ELEMENT__MEASURANT = eINSTANCE.getMofElement_Measurant();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOF_ELEMENT__ELEMENT = eINSTANCE.getMofElement_Element();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.CouplingBetweenObjectsMeasureImpl <em>Coupling Between Objects Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.CouplingBetweenObjectsMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getCouplingBetweenObjectsMeasure()
		 * @generated
		 */
		EClass COUPLING_BETWEEN_OBJECTS_MEASURE = eINSTANCE.getCouplingBetweenObjectsMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.WeightedMethodsPerClassMeasureImpl <em>Weighted Methods Per Class Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.WeightedMethodsPerClassMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getWeightedMethodsPerClassMeasure()
		 * @generated
		 */
		EClass WEIGHTED_METHODS_PER_CLASS_MEASURE = eINSTANCE.getWeightedMethodsPerClassMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfUsesMeasureImpl <em>Number Of Uses Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfUsesMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfUsesMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_USES_MEASURE = eINSTANCE.getNumberOfUsesMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfContainmentsMeasureImpl <em>Number Of Containments Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfContainmentsMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfContainmentsMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_CONTAINMENTS_MEASURE = eINSTANCE.getNumberOfContainmentsMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.CalculatedCouplingMeasureImpl <em>Calculated Coupling Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.CalculatedCouplingMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getCalculatedCouplingMeasure()
		 * @generated
		 */
		EClass CALCULATED_COUPLING_MEASURE = eINSTANCE.getCalculatedCouplingMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfClassesMeasureImpl <em>Number Of Classes Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfClassesMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfClassesMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_CLASSES_MEASURE = eINSTANCE.getNumberOfClassesMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.NumberOfLinesMeasureImpl <em>Number Of Lines Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.NumberOfLinesMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getNumberOfLinesMeasure()
		 * @generated
		 */
		EClass NUMBER_OF_LINES_MEASURE = eINSTANCE.getNumberOfLinesMeasure();

		/**
		 * The meta object literal for the '{@link subkdm.SimplifiedDecisionMetrics.impl.ClusterRelationConflictPercentageMeasureImpl <em>Cluster Relation Conflict Percentage Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.SimplifiedDecisionMetrics.impl.ClusterRelationConflictPercentageMeasureImpl
		 * @see subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsPackageImpl#getClusterRelationConflictPercentageMeasure()
		 * @generated
		 */
		EClass CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE = eINSTANCE.getClusterRelationConflictPercentageMeasure();

	}

} //SimplifiedDecisionMetricsPackage
