/**
 */
package visualizacionMetricas3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.VisualizacionMetricas3Package
 * @generated
 */
public interface VisualizacionMetricas3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizacionMetricas3Factory eINSTANCE = visualizacionMetricas3.impl.VisualizacionMetricas3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arco</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arco</em>'.
	 * @generated
	 */
	Arco createArco();

	/**
	 * Returns a new object of class '<em>Metrica</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrica</em>'.
	 * @generated
	 */
	Metrica createMetrica();

	/**
	 * Returns a new object of class '<em>Metrica Relacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metrica Relacion</em>'.
	 * @generated
	 */
	MetricaRelacion createMetricaRelacion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisualizacionMetricas3Package getVisualizacionMetricas3Package();

} //VisualizacionMetricas3Factory
