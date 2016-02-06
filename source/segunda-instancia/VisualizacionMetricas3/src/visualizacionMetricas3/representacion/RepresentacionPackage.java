/**
 */
package visualizacionMetricas3.representacion;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import visualizacionMetricas3.VisualizacionMetricas3Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.representacion.RepresentacionFactory
 * @model kind="package"
 * @generated
 */
public interface RepresentacionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "representacion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://visualizacionMetricas3/representacion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualizacionMetricas3.representacion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RepresentacionPackage eINSTANCE = visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl.init();

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ClusterImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__METRICAS = VisualizacionMetricas3Package.VINCULO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__RELACIONES = VisualizacionMetricas3Package.VINCULO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = VisualizacionMetricas3Package.VINCULO__NAME;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ELEMENTOS = VisualizacionMetricas3Package.VINCULO__ELEMENTOS;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = VisualizacionMetricas3Package.VINCULO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.PaqueteImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 1;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ModuloImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 2;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ClaseImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 3;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ArchivoImpl <em>Archivo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ArchivoImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getArchivo()
	 * @generated
	 */
	int ARCHIVO = 4;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Archivo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIVO_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ServicioImpl <em>Servicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ServicioImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getServicio()
	 * @generated
	 */
	int SERVICIO = 5;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__METRICAS = VisualizacionMetricas3Package.VINCULO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__RELACIONES = VisualizacionMetricas3Package.VINCULO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__NAME = VisualizacionMetricas3Package.VINCULO__NAME;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO__ELEMENTOS = VisualizacionMetricas3Package.VINCULO__ELEMENTOS;

	/**
	 * The number of structural features of the '<em>Servicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICIO_FEATURE_COUNT = VisualizacionMetricas3Package.VINCULO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.TablaImpl <em>Tabla</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.TablaImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getTabla()
	 * @generated
	 */
	int TABLA = 6;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Tabla</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLA_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.FormImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 7;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.AplicacionImpl <em>Aplicacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.AplicacionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAplicacion()
	 * @generated
	 */
	int APLICACION = 8;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__METRICAS = VisualizacionMetricas3Package.NODO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__RELACIONES = VisualizacionMetricas3Package.NODO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__NAME = VisualizacionMetricas3Package.NODO__NAME;

	/**
	 * The feature id for the '<em><b>Hijos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION__HIJOS = VisualizacionMetricas3Package.NODO__HIJOS;

	/**
	 * The number of structural features of the '<em>Aplicacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APLICACION_FEATURE_COUNT = VisualizacionMetricas3Package.NODO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.DependenciaImpl <em>Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.DependenciaImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getDependencia()
	 * @generated
	 */
	int DEPENDENCIA = 9;

	/**
	 * The number of structural features of the '<em>Dependencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA_FEATURE_COUNT = VisualizacionMetricas3Package.TIPO_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.AsociacionImpl <em>Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.AsociacionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAsociacion()
	 * @generated
	 */
	int ASOCIACION = 10;

	/**
	 * The number of structural features of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_FEATURE_COUNT = VisualizacionMetricas3Package.TIPO_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.ComposicionImpl <em>Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.ComposicionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getComposicion()
	 * @generated
	 */
	int COMPOSICION = 11;

	/**
	 * The number of structural features of the '<em>Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION_FEATURE_COUNT = VisualizacionMetricas3Package.TIPO_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.AgregacionImpl <em>Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.AgregacionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAgregacion()
	 * @generated
	 */
	int AGREGACION = 12;

	/**
	 * The number of structural features of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_FEATURE_COUNT = VisualizacionMetricas3Package.TIPO_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.GeneralizacionImpl <em>Generalizacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.GeneralizacionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getGeneralizacion()
	 * @generated
	 */
	int GENERALIZACION = 13;

	/**
	 * The number of structural features of the '<em>Generalizacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZACION_FEATURE_COUNT = VisualizacionMetricas3Package.TIPO_RELACION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.MetodoImpl <em>Metodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.MetodoImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getMetodo()
	 * @generated
	 */
	int METODO = 14;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__METRICAS = VisualizacionMetricas3Package.HOJA__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__RELACIONES = VisualizacionMetricas3Package.HOJA__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO__NAME = VisualizacionMetricas3Package.HOJA__NAME;

	/**
	 * The number of structural features of the '<em>Metodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METODO_FEATURE_COUNT = VisualizacionMetricas3Package.HOJA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.AtributoImpl <em>Atributo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.AtributoImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAtributo()
	 * @generated
	 */
	int ATRIBUTO = 15;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__METRICAS = VisualizacionMetricas3Package.HOJA__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__RELACIONES = VisualizacionMetricas3Package.HOJA__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO__NAME = VisualizacionMetricas3Package.HOJA__NAME;

	/**
	 * The number of structural features of the '<em>Atributo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRIBUTO_FEATURE_COUNT = VisualizacionMetricas3Package.HOJA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.representacion.impl.IntercepcionImpl <em>Intercepcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.representacion.impl.IntercepcionImpl
	 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getIntercepcion()
	 * @generated
	 */
	int INTERCEPCION = 16;

	/**
	 * The feature id for the '<em><b>Metricas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION__METRICAS = VisualizacionMetricas3Package.VINCULO__METRICAS;

	/**
	 * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION__RELACIONES = VisualizacionMetricas3Package.VINCULO__RELACIONES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION__NAME = VisualizacionMetricas3Package.VINCULO__NAME;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION__ELEMENTOS = VisualizacionMetricas3Package.VINCULO__ELEMENTOS;

	/**
	 * The feature id for the '<em><b>Arco</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION__ARCO = VisualizacionMetricas3Package.VINCULO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Intercepcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCEPCION_FEATURE_COUNT = VisualizacionMetricas3Package.VINCULO_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see visualizacionMetricas3.representacion.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see visualizacionMetricas3.representacion.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see visualizacionMetricas3.representacion.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see visualizacionMetricas3.representacion.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Archivo <em>Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archivo</em>'.
	 * @see visualizacionMetricas3.representacion.Archivo
	 * @generated
	 */
	EClass getArchivo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servicio</em>'.
	 * @see visualizacionMetricas3.representacion.Servicio
	 * @generated
	 */
	EClass getServicio();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabla</em>'.
	 * @see visualizacionMetricas3.representacion.Tabla
	 * @generated
	 */
	EClass getTabla();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see visualizacionMetricas3.representacion.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aplicacion</em>'.
	 * @see visualizacionMetricas3.representacion.Aplicacion
	 * @generated
	 */
	EClass getAplicacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Dependencia <em>Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencia</em>'.
	 * @see visualizacionMetricas3.representacion.Dependencia
	 * @generated
	 */
	EClass getDependencia();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asociacion</em>'.
	 * @see visualizacionMetricas3.representacion.Asociacion
	 * @generated
	 */
	EClass getAsociacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composicion</em>'.
	 * @see visualizacionMetricas3.representacion.Composicion
	 * @generated
	 */
	EClass getComposicion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregacion</em>'.
	 * @see visualizacionMetricas3.representacion.Agregacion
	 * @generated
	 */
	EClass getAgregacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Generalizacion <em>Generalizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalizacion</em>'.
	 * @see visualizacionMetricas3.representacion.Generalizacion
	 * @generated
	 */
	EClass getGeneralizacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Metodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metodo</em>'.
	 * @see visualizacionMetricas3.representacion.Metodo
	 * @generated
	 */
	EClass getMetodo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atributo</em>'.
	 * @see visualizacionMetricas3.representacion.Atributo
	 * @generated
	 */
	EClass getAtributo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.representacion.Intercepcion <em>Intercepcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intercepcion</em>'.
	 * @see visualizacionMetricas3.representacion.Intercepcion
	 * @generated
	 */
	EClass getIntercepcion();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.representacion.Intercepcion#getArco <em>Arco</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arco</em>'.
	 * @see visualizacionMetricas3.representacion.Intercepcion#getArco()
	 * @see #getIntercepcion()
	 * @generated
	 */
	EReference getIntercepcion_Arco();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RepresentacionFactory getRepresentacionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ClusterImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.PaqueteImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ModuloImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ClaseImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ArchivoImpl <em>Archivo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ArchivoImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getArchivo()
		 * @generated
		 */
		EClass ARCHIVO = eINSTANCE.getArchivo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ServicioImpl <em>Servicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ServicioImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getServicio()
		 * @generated
		 */
		EClass SERVICIO = eINSTANCE.getServicio();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.TablaImpl <em>Tabla</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.TablaImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getTabla()
		 * @generated
		 */
		EClass TABLA = eINSTANCE.getTabla();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.FormImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.AplicacionImpl <em>Aplicacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.AplicacionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAplicacion()
		 * @generated
		 */
		EClass APLICACION = eINSTANCE.getAplicacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.DependenciaImpl <em>Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.DependenciaImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getDependencia()
		 * @generated
		 */
		EClass DEPENDENCIA = eINSTANCE.getDependencia();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.AsociacionImpl <em>Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.AsociacionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAsociacion()
		 * @generated
		 */
		EClass ASOCIACION = eINSTANCE.getAsociacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.ComposicionImpl <em>Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.ComposicionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getComposicion()
		 * @generated
		 */
		EClass COMPOSICION = eINSTANCE.getComposicion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.AgregacionImpl <em>Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.AgregacionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAgregacion()
		 * @generated
		 */
		EClass AGREGACION = eINSTANCE.getAgregacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.GeneralizacionImpl <em>Generalizacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.GeneralizacionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getGeneralizacion()
		 * @generated
		 */
		EClass GENERALIZACION = eINSTANCE.getGeneralizacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.MetodoImpl <em>Metodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.MetodoImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getMetodo()
		 * @generated
		 */
		EClass METODO = eINSTANCE.getMetodo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.AtributoImpl <em>Atributo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.AtributoImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getAtributo()
		 * @generated
		 */
		EClass ATRIBUTO = eINSTANCE.getAtributo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.representacion.impl.IntercepcionImpl <em>Intercepcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.representacion.impl.IntercepcionImpl
		 * @see visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl#getIntercepcion()
		 * @generated
		 */
		EClass INTERCEPCION = eINSTANCE.getIntercepcion();

		/**
		 * The meta object literal for the '<em><b>Arco</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERCEPCION__ARCO = eINSTANCE.getIntercepcion_Arco();

	}

} //RepresentacionPackage
