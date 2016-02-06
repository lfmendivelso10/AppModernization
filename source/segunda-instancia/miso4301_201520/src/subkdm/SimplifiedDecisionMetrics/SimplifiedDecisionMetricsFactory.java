/**
 */
package subkdm.SimplifiedDecisionMetrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage
 * @generated
 */
public interface SimplifiedDecisionMetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplifiedDecisionMetricsFactory eINSTANCE = subkdm.SimplifiedDecisionMetrics.impl.SimplifiedDecisionMetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation</em>'.
	 * @generated
	 */
	Observation createObservation();

	/**
	 * Returns a new object of class '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measure</em>'.
	 * @generated
	 */
	Measure createMeasure();

	/**
	 * Returns a new object of class '<em>Grade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grade</em>'.
	 * @generated
	 */
	Grade createGrade();

	/**
	 * Returns a new object of class '<em>Dimensional Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimensional Measurement</em>'.
	 * @generated
	 */
	DimensionalMeasurement createDimensionalMeasurement();

	/**
	 * Returns a new object of class '<em>Simplified Decision Metrics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simplified Decision Metrics</em>'.
	 * @generated
	 */
	SimplifiedDecisionMetrics createSimplifiedDecisionMetrics();

	/**
	 * Returns a new object of class '<em>Mof Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mof Element</em>'.
	 * @generated
	 */
	MofElement createMofElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplifiedDecisionMetricsPackage getSimplifiedDecisionMetricsPackage();

} //SimplifiedDecisionMetricsFactory
