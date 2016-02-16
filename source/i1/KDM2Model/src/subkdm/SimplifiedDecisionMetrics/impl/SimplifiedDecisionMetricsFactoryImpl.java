/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import subkdm.SimplifiedDecisionMetrics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplifiedDecisionMetricsFactoryImpl extends EFactoryImpl implements SimplifiedDecisionMetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplifiedDecisionMetricsFactory init() {
		try {
			SimplifiedDecisionMetricsFactory theSimplifiedDecisionMetricsFactory = (SimplifiedDecisionMetricsFactory)EPackage.Registry.INSTANCE.getEFactory(SimplifiedDecisionMetricsPackage.eNS_URI);
			if (theSimplifiedDecisionMetricsFactory != null) {
				return theSimplifiedDecisionMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplifiedDecisionMetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetricsFactoryImpl() {
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
			case SimplifiedDecisionMetricsPackage.OBSERVATION: return createObservation();
			case SimplifiedDecisionMetricsPackage.MEASURE: return createMeasure();
			case SimplifiedDecisionMetricsPackage.GRADE: return createGrade();
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_MEASUREMENT: return createDimensionalMeasurement();
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT: return createDimensionalToObjectMeasurement();
			case SimplifiedDecisionMetricsPackage.SIMPLIFIED_DECISION_METRICS: return createSimplifiedDecisionMetrics();
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT: return createMofElement();
			case SimplifiedDecisionMetricsPackage.COUPLING_BETWEEN_OBJECTS_MEASURE: return createCouplingBetweenObjectsMeasure();
			case SimplifiedDecisionMetricsPackage.WEIGHTED_METHODS_PER_CLASS_MEASURE: return createWeightedMethodsPerClassMeasure();
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_USES_MEASURE: return createNumberOfUsesMeasure();
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_CONTAINMENTS_MEASURE: return createNumberOfContainmentsMeasure();
			case SimplifiedDecisionMetricsPackage.CALCULATED_COUPLING_MEASURE: return createCalculatedCouplingMeasure();
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_CLASSES_MEASURE: return createNumberOfClassesMeasure();
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_LINES_MEASURE: return createNumberOfLinesMeasure();
			case SimplifiedDecisionMetricsPackage.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE: return createClusterRelationConflictPercentageMeasure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation createObservation() {
		ObservationImpl observation = new ObservationImpl();
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure createMeasure() {
		MeasureImpl measure = new MeasureImpl();
		return measure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalMeasurement createDimensionalMeasurement() {
		DimensionalMeasurementImpl dimensionalMeasurement = new DimensionalMeasurementImpl();
		return dimensionalMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionalToObjectMeasurement createDimensionalToObjectMeasurement() {
		DimensionalToObjectMeasurementImpl dimensionalToObjectMeasurement = new DimensionalToObjectMeasurementImpl();
		return dimensionalToObjectMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetrics createSimplifiedDecisionMetrics() {
		SimplifiedDecisionMetricsImpl simplifiedDecisionMetrics = new SimplifiedDecisionMetricsImpl();
		return simplifiedDecisionMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MofElement createMofElement() {
		MofElementImpl mofElement = new MofElementImpl();
		return mofElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouplingBetweenObjectsMeasure createCouplingBetweenObjectsMeasure() {
		CouplingBetweenObjectsMeasureImpl couplingBetweenObjectsMeasure = new CouplingBetweenObjectsMeasureImpl();
		return couplingBetweenObjectsMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightedMethodsPerClassMeasure createWeightedMethodsPerClassMeasure() {
		WeightedMethodsPerClassMeasureImpl weightedMethodsPerClassMeasure = new WeightedMethodsPerClassMeasureImpl();
		return weightedMethodsPerClassMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfUsesMeasure createNumberOfUsesMeasure() {
		NumberOfUsesMeasureImpl numberOfUsesMeasure = new NumberOfUsesMeasureImpl();
		return numberOfUsesMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfContainmentsMeasure createNumberOfContainmentsMeasure() {
		NumberOfContainmentsMeasureImpl numberOfContainmentsMeasure = new NumberOfContainmentsMeasureImpl();
		return numberOfContainmentsMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedCouplingMeasure createCalculatedCouplingMeasure() {
		CalculatedCouplingMeasureImpl calculatedCouplingMeasure = new CalculatedCouplingMeasureImpl();
		return calculatedCouplingMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfClassesMeasure createNumberOfClassesMeasure() {
		NumberOfClassesMeasureImpl numberOfClassesMeasure = new NumberOfClassesMeasureImpl();
		return numberOfClassesMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfLinesMeasure createNumberOfLinesMeasure() {
		NumberOfLinesMeasureImpl numberOfLinesMeasure = new NumberOfLinesMeasureImpl();
		return numberOfLinesMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClusterRelationConflictPercentageMeasure createClusterRelationConflictPercentageMeasure() {
		ClusterRelationConflictPercentageMeasureImpl clusterRelationConflictPercentageMeasure = new ClusterRelationConflictPercentageMeasureImpl();
		return clusterRelationConflictPercentageMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetricsPackage getSimplifiedDecisionMetricsPackage() {
		return (SimplifiedDecisionMetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplifiedDecisionMetricsPackage getPackage() {
		return SimplifiedDecisionMetricsPackage.eINSTANCE;
	}

} //SimplifiedDecisionMetricsFactoryImpl
