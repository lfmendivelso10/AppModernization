/**
 */
package subkdm.SimplifiedDecisionMetrics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import subkdm.SimplifiedDecisionMetrics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage
 * @generated
 */
public class SimplifiedDecisionMetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplifiedDecisionMetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplifiedDecisionMetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplifiedDecisionMetricsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimplifiedDecisionMetricsPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.MEASURE: {
				Measure measure = (Measure)theEObject;
				T result = caseMeasure(measure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.MEASUREMENT: {
				Measurement measurement = (Measurement)theEObject;
				T result = caseMeasurement(measurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.GRADE: {
				Grade grade = (Grade)theEObject;
				T result = caseGrade(grade);
				if (result == null) result = caseMeasurement(grade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_MEASUREMENT: {
				DimensionalMeasurement dimensionalMeasurement = (DimensionalMeasurement)theEObject;
				T result = caseDimensionalMeasurement(dimensionalMeasurement);
				if (result == null) result = caseMeasurement(dimensionalMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT: {
				DimensionalToObjectMeasurement dimensionalToObjectMeasurement = (DimensionalToObjectMeasurement)theEObject;
				T result = caseDimensionalToObjectMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = caseDimensionalMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = caseMeasurement(dimensionalToObjectMeasurement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.SIMPLIFIED_DECISION_METRICS: {
				SimplifiedDecisionMetrics simplifiedDecisionMetrics = (SimplifiedDecisionMetrics)theEObject;
				T result = caseSimplifiedDecisionMetrics(simplifiedDecisionMetrics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.MOF_ELEMENT: {
				MofElement mofElement = (MofElement)theEObject;
				T result = caseMofElement(mofElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.COUPLING_BETWEEN_OBJECTS_MEASURE: {
				CouplingBetweenObjectsMeasure couplingBetweenObjectsMeasure = (CouplingBetweenObjectsMeasure)theEObject;
				T result = caseCouplingBetweenObjectsMeasure(couplingBetweenObjectsMeasure);
				if (result == null) result = caseMeasure(couplingBetweenObjectsMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.WEIGHTED_METHODS_PER_CLASS_MEASURE: {
				WeightedMethodsPerClassMeasure weightedMethodsPerClassMeasure = (WeightedMethodsPerClassMeasure)theEObject;
				T result = caseWeightedMethodsPerClassMeasure(weightedMethodsPerClassMeasure);
				if (result == null) result = caseMeasure(weightedMethodsPerClassMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_USES_MEASURE: {
				NumberOfUsesMeasure numberOfUsesMeasure = (NumberOfUsesMeasure)theEObject;
				T result = caseNumberOfUsesMeasure(numberOfUsesMeasure);
				if (result == null) result = caseMeasure(numberOfUsesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_CONTAINMENTS_MEASURE: {
				NumberOfContainmentsMeasure numberOfContainmentsMeasure = (NumberOfContainmentsMeasure)theEObject;
				T result = caseNumberOfContainmentsMeasure(numberOfContainmentsMeasure);
				if (result == null) result = caseMeasure(numberOfContainmentsMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.CALCULATED_COUPLING_MEASURE: {
				CalculatedCouplingMeasure calculatedCouplingMeasure = (CalculatedCouplingMeasure)theEObject;
				T result = caseCalculatedCouplingMeasure(calculatedCouplingMeasure);
				if (result == null) result = caseMeasure(calculatedCouplingMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_CLASSES_MEASURE: {
				NumberOfClassesMeasure numberOfClassesMeasure = (NumberOfClassesMeasure)theEObject;
				T result = caseNumberOfClassesMeasure(numberOfClassesMeasure);
				if (result == null) result = caseMeasure(numberOfClassesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.NUMBER_OF_LINES_MEASURE: {
				NumberOfLinesMeasure numberOfLinesMeasure = (NumberOfLinesMeasure)theEObject;
				T result = caseNumberOfLinesMeasure(numberOfLinesMeasure);
				if (result == null) result = caseMeasure(numberOfLinesMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplifiedDecisionMetricsPackage.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE: {
				ClusterRelationConflictPercentageMeasure clusterRelationConflictPercentageMeasure = (ClusterRelationConflictPercentageMeasure)theEObject;
				T result = caseClusterRelationConflictPercentageMeasure(clusterRelationConflictPercentageMeasure);
				if (result == null) result = caseMeasure(clusterRelationConflictPercentageMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrade(Grade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalMeasurement(DimensionalMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional To Object Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional To Object Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalToObjectMeasurement(DimensionalToObjectMeasurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simplified Decision Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simplified Decision Metrics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplifiedDecisionMetrics(SimplifiedDecisionMetrics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mof Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mof Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMofElement(MofElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupling Between Objects Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupling Between Objects Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouplingBetweenObjectsMeasure(CouplingBetweenObjectsMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Weighted Methods Per Class Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Weighted Methods Per Class Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWeightedMethodsPerClassMeasure(WeightedMethodsPerClassMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Uses Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Uses Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfUsesMeasure(NumberOfUsesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Containments Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Containments Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfContainmentsMeasure(NumberOfContainmentsMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Coupling Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Coupling Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedCouplingMeasure(CalculatedCouplingMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Classes Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Classes Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfClassesMeasure(NumberOfClassesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Of Lines Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Of Lines Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberOfLinesMeasure(NumberOfLinesMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Relation Conflict Percentage Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterRelationConflictPercentageMeasure(ClusterRelationConflictPercentageMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplifiedDecisionMetricsSwitch
