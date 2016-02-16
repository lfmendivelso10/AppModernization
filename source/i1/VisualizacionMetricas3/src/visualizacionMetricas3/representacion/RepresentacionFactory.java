/**
 */
package visualizacionMetricas3.representacion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.representacion.RepresentacionPackage
 * @generated
 */
public interface RepresentacionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentacionFactory eINSTANCE = visualizacionMetricas3.representacion.impl.RepresentacionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster</em>'.
	 * @generated
	 */
	Cluster createCluster();

	/**
	 * Returns a new object of class '<em>Paquete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paquete</em>'.
	 * @generated
	 */
	Paquete createPaquete();

	/**
	 * Returns a new object of class '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modulo</em>'.
	 * @generated
	 */
	Modulo createModulo();

	/**
	 * Returns a new object of class '<em>Clase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clase</em>'.
	 * @generated
	 */
	Clase createClase();

	/**
	 * Returns a new object of class '<em>Archivo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archivo</em>'.
	 * @generated
	 */
	Archivo createArchivo();

	/**
	 * Returns a new object of class '<em>Servicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Servicio</em>'.
	 * @generated
	 */
	Servicio createServicio();

	/**
	 * Returns a new object of class '<em>Tabla</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tabla</em>'.
	 * @generated
	 */
	Tabla createTabla();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Aplicacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aplicacion</em>'.
	 * @generated
	 */
	Aplicacion createAplicacion();

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
	 * Returns a new object of class '<em>Composicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composicion</em>'.
	 * @generated
	 */
	Composicion createComposicion();

	/**
	 * Returns a new object of class '<em>Agregacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agregacion</em>'.
	 * @generated
	 */
	Agregacion createAgregacion();

	/**
	 * Returns a new object of class '<em>Generalizacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalizacion</em>'.
	 * @generated
	 */
	Generalizacion createGeneralizacion();

	/**
	 * Returns a new object of class '<em>Metodo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metodo</em>'.
	 * @generated
	 */
	Metodo createMetodo();

	/**
	 * Returns a new object of class '<em>Atributo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atributo</em>'.
	 * @generated
	 */
	Atributo createAtributo();

	/**
	 * Returns a new object of class '<em>Intercepcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intercepcion</em>'.
	 * @generated
	 */
	Intercepcion createIntercepcion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RepresentacionPackage getRepresentacionPackage();

} //RepresentacionFactory
