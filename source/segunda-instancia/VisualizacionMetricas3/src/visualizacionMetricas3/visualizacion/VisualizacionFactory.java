/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage
 * @generated
 */
public interface VisualizacionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizacionFactory eINSTANCE = visualizacionMetricas3.visualizacion.impl.VisualizacionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Elipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elipse</em>'.
	 * @generated
	 */
	Elipse createElipse();

	/**
	 * Returns a new object of class '<em>Cuadrilatero</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cuadrilatero</em>'.
	 * @generated
	 */
	Cuadrilatero createCuadrilatero();

	/**
	 * Returns a new object of class '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clase</em>'.
	 * @generated
	 */
	Clase createClase();

	/**
	 * Returns a new object of class '<em>Rombo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rombo</em>'.
	 * @generated
	 */
	Rombo createRombo();

	/**
	 * Returns a new object of class '<em>Triangulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangulo</em>'.
	 * @generated
	 */
	Triangulo createTriangulo();

	/**
	 * Returns a new object of class '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paquete</em>'.
	 * @generated
	 */
	Paquete createPaquete();

	/**
	 * Returns a new object of class '<em>Diagrama</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagrama</em>'.
	 * @generated
	 */
	Diagrama createDiagrama();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Borde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Borde</em>'.
	 * @generated
	 */
	Borde createBorde();

	/**
	 * Returns a new object of class '<em>Punto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Punto</em>'.
	 * @generated
	 */
	Punto createPunto();

	/**
	 * Returns a new object of class '<em>Herencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Herencia</em>'.
	 * @generated
	 */
	Herencia createHerencia();

	/**
	 * Returns a new object of class '<em>Implementacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementacion</em>'.
	 * @generated
	 */
	Implementacion createImplementacion();

	/**
	 * Returns a new object of class '<em>Dependencia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencia</em>'.
	 * @generated
	 */
	Dependencia createDependencia();

	/**
	 * Returns a new object of class '<em>Asociacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asociacion</em>'.
	 * @generated
	 */
	Asociacion createAsociacion();

	/**
	 * Returns a new object of class '<em>Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agregacion</em>'.
	 * @generated
	 */
	Agregacion createAgregacion();

	/**
	 * Returns a new object of class '<em>Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composicion</em>'.
	 * @generated
	 */
	Composicion createComposicion();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VisualizacionPackage getVisualizacionPackage();

} //VisualizacionFactory
