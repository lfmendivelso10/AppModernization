/**
 */
package subkdm.SimplifiedDecisionMetrics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import subkdm.SimplifiedDecisionMetrics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage
 * @generated
 */
public class SimplifiedDecisionMetricsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplifiedDecisionMetricsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetricsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimplifiedDecisionMetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplifiedDecisionMetricsSwitch<Adapter> modelSwitch =
		new SimplifiedDecisionMetricsSwitch<Adapter>() {
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseMeasurement(Measurement object) {
				return createMeasurementAdapter();
			}
			@Override
			public Adapter caseGrade(Grade object) {
				return createGradeAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasurement(DimensionalMeasurement object) {
				return createDimensionalMeasurementAdapter();
			}
			@Override
			public Adapter caseDimensionalToObjectMeasurement(DimensionalToObjectMeasurement object) {
				return createDimensionalToObjectMeasurementAdapter();
			}
			@Override
			public Adapter caseSimplifiedDecisionMetrics(SimplifiedDecisionMetrics object) {
				return createSimplifiedDecisionMetricsAdapter();
			}
			@Override
			public Adapter caseMofElement(MofElement object) {
				return createMofElementAdapter();
			}
			@Override
			public Adapter caseCouplingBetweenObjectsMeasure(CouplingBetweenObjectsMeasure object) {
				return createCouplingBetweenObjectsMeasureAdapter();
			}
			@Override
			public Adapter caseWeightedMethodsPerClassMeasure(WeightedMethodsPerClassMeasure object) {
				return createWeightedMethodsPerClassMeasureAdapter();
			}
			@Override
			public Adapter caseNumberOfUsesMeasure(NumberOfUsesMeasure object) {
				return createNumberOfUsesMeasureAdapter();
			}
			@Override
			public Adapter caseNumberOfContainmentsMeasure(NumberOfContainmentsMeasure object) {
				return createNumberOfContainmentsMeasureAdapter();
			}
			@Override
			public Adapter caseCalculatedCouplingMeasure(CalculatedCouplingMeasure object) {
				return createCalculatedCouplingMeasureAdapter();
			}
			@Override
			public Adapter caseNumberOfClassesMeasure(NumberOfClassesMeasure object) {
				return createNumberOfClassesMeasureAdapter();
			}
			@Override
			public Adapter caseNumberOfLinesMeasure(NumberOfLinesMeasure object) {
				return createNumberOfLinesMeasureAdapter();
			}
			@Override
			public Adapter caseClusterRelationConflictPercentageMeasure(ClusterRelationConflictPercentageMeasure object) {
				return createClusterRelationConflictPercentageMeasureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.Measurement
	 * @generated
	 */
	public Adapter createMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalMeasurement
	 * @generated
	 */
	public Adapter createDimensionalMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement <em>Dimensional To Object Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement
	 * @generated
	 */
	public Adapter createDimensionalToObjectMeasurementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics <em>Simplified Decision Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics
	 * @generated
	 */
	public Adapter createSimplifiedDecisionMetricsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.MofElement <em>Mof Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.MofElement
	 * @generated
	 */
	public Adapter createMofElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.CouplingBetweenObjectsMeasure <em>Coupling Between Objects Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.CouplingBetweenObjectsMeasure
	 * @generated
	 */
	public Adapter createCouplingBetweenObjectsMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.WeightedMethodsPerClassMeasure <em>Weighted Methods Per Class Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.WeightedMethodsPerClassMeasure
	 * @generated
	 */
	public Adapter createWeightedMethodsPerClassMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfUsesMeasure <em>Number Of Uses Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfUsesMeasure
	 * @generated
	 */
	public Adapter createNumberOfUsesMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfContainmentsMeasure <em>Number Of Containments Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfContainmentsMeasure
	 * @generated
	 */
	public Adapter createNumberOfContainmentsMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.CalculatedCouplingMeasure <em>Calculated Coupling Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.CalculatedCouplingMeasure
	 * @generated
	 */
	public Adapter createCalculatedCouplingMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfClassesMeasure <em>Number Of Classes Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfClassesMeasure
	 * @generated
	 */
	public Adapter createNumberOfClassesMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.NumberOfLinesMeasure <em>Number Of Lines Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.NumberOfLinesMeasure
	 * @generated
	 */
	public Adapter createNumberOfLinesMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.SimplifiedDecisionMetrics.ClusterRelationConflictPercentageMeasure <em>Cluster Relation Conflict Percentage Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.SimplifiedDecisionMetrics.ClusterRelationConflictPercentageMeasure
	 * @generated
	 */
	public Adapter createClusterRelationConflictPercentageMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimplifiedDecisionMetricsAdapterFactory
