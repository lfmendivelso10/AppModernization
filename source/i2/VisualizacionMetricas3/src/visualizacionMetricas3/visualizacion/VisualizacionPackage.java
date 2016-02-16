/**
 */
package visualizacionMetricas3.visualizacion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see visualizacionMetricas3.visualizacion.VisualizacionFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizacionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualizacion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://visualizacionMetricas3/visualizacion";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualizacionMetricas3.visualizacion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizacionPackage eINSTANCE = visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl.init();

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama <em>Navegacion Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.NavegacionDiagrama
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getNavegacionDiagrama()
	 * @generated
	 */
	int NAVEGACION_DIAGRAMA = 10;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_DIAGRAMA__DIAGRAMA = 0;

	/**
	 * The number of structural features of the '<em>Navegacion Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_DIAGRAMA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama <em>Elemento Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getElementoDiagrama()
	 * @generated
	 */
	int ELEMENTO_DIAGRAMA = 9;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA__DIAGRAMA = NAVEGACION_DIAGRAMA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA__NAME = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA__LABEL = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA__BORDE = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA__CONECTORES = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Elemento Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_DIAGRAMA_FEATURE_COUNT = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl <em>Figura Geometrica</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getFiguraGeometrica()
	 * @generated
	 */
	int FIGURA_GEOMETRICA = 4;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__DIAGRAMA = ELEMENTO_DIAGRAMA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__NAME = ELEMENTO_DIAGRAMA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__LABEL = ELEMENTO_DIAGRAMA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__BORDE = ELEMENTO_DIAGRAMA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__CONECTORES = ELEMENTO_DIAGRAMA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__COLOR = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__LARGO = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA__ALTO = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Figura Geometrica</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURA_GEOMETRICA_FEATURE_COUNT = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ElipseImpl <em>Elipse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ElipseImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getElipse()
	 * @generated
	 */
	int ELIPSE = 0;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__DIAGRAMA = FIGURA_GEOMETRICA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__NAME = FIGURA_GEOMETRICA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__LABEL = FIGURA_GEOMETRICA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__BORDE = FIGURA_GEOMETRICA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__CONECTORES = FIGURA_GEOMETRICA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__COLOR = FIGURA_GEOMETRICA__COLOR;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__LARGO = FIGURA_GEOMETRICA__LARGO;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE__ALTO = FIGURA_GEOMETRICA__ALTO;

	/**
	 * The number of structural features of the '<em>Elipse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELIPSE_FEATURE_COUNT = FIGURA_GEOMETRICA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.CuadrilateroImpl <em>Cuadrilatero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.CuadrilateroImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getCuadrilatero()
	 * @generated
	 */
	int CUADRILATERO = 1;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__DIAGRAMA = FIGURA_GEOMETRICA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__NAME = FIGURA_GEOMETRICA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__LABEL = FIGURA_GEOMETRICA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__BORDE = FIGURA_GEOMETRICA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__CONECTORES = FIGURA_GEOMETRICA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__COLOR = FIGURA_GEOMETRICA__COLOR;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__LARGO = FIGURA_GEOMETRICA__LARGO;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO__ALTO = FIGURA_GEOMETRICA__ALTO;

	/**
	 * The number of structural features of the '<em>Cuadrilatero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUADRILATERO_FEATURE_COUNT = FIGURA_GEOMETRICA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.Contenedor <em>Contenedor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.Contenedor
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getContenedor()
	 * @generated
	 */
	int CONTENEDOR = 2;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__DIAGRAMA = ELEMENTO_DIAGRAMA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__NAME = ELEMENTO_DIAGRAMA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__LABEL = ELEMENTO_DIAGRAMA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__BORDE = ELEMENTO_DIAGRAMA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__CONECTORES = ELEMENTO_DIAGRAMA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR__ELEMENTOS = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contenedor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENEDOR_FEATURE_COUNT = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl <em>Clase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ClaseImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getClase()
	 * @generated
	 */
	int CLASE = 3;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__DIAGRAMA = CONTENEDOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__NAME = CONTENEDOR__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__LABEL = CONTENEDOR__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__BORDE = CONTENEDOR__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__CONECTORES = CONTENEDOR__CONECTORES;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE__ELEMENTOS = CONTENEDOR__ELEMENTOS;

	/**
	 * The number of structural features of the '<em>Clase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASE_FEATURE_COUNT = CONTENEDOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.RomboImpl <em>Rombo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.RomboImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getRombo()
	 * @generated
	 */
	int ROMBO = 5;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__DIAGRAMA = FIGURA_GEOMETRICA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__NAME = FIGURA_GEOMETRICA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__LABEL = FIGURA_GEOMETRICA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__BORDE = FIGURA_GEOMETRICA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__CONECTORES = FIGURA_GEOMETRICA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__COLOR = FIGURA_GEOMETRICA__COLOR;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__LARGO = FIGURA_GEOMETRICA__LARGO;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO__ALTO = FIGURA_GEOMETRICA__ALTO;

	/**
	 * The number of structural features of the '<em>Rombo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMBO_FEATURE_COUNT = FIGURA_GEOMETRICA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.TrianguloImpl <em>Triangulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.TrianguloImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTriangulo()
	 * @generated
	 */
	int TRIANGULO = 6;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__DIAGRAMA = FIGURA_GEOMETRICA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__NAME = FIGURA_GEOMETRICA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__LABEL = FIGURA_GEOMETRICA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__BORDE = FIGURA_GEOMETRICA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__CONECTORES = FIGURA_GEOMETRICA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__COLOR = FIGURA_GEOMETRICA__COLOR;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__LARGO = FIGURA_GEOMETRICA__LARGO;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO__ALTO = FIGURA_GEOMETRICA__ALTO;

	/**
	 * The number of structural features of the '<em>Triangulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGULO_FEATURE_COUNT = FIGURA_GEOMETRICA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.PaqueteImpl <em>Paquete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.PaqueteImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPaquete()
	 * @generated
	 */
	int PAQUETE = 7;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__DIAGRAMA = CONTENEDOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__NAME = CONTENEDOR__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__LABEL = CONTENEDOR__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__BORDE = CONTENEDOR__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__CONECTORES = CONTENEDOR__CONECTORES;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE__ELEMENTOS = CONTENEDOR__ELEMENTOS;

	/**
	 * The number of structural features of the '<em>Paquete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAQUETE_FEATURE_COUNT = CONTENEDOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl <em>Diagrama</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.DiagramaImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDiagrama()
	 * @generated
	 */
	int DIAGRAMA = 8;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__DIAGRAMA = CONTENEDOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__NAME = CONTENEDOR__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__LABEL = CONTENEDOR__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__BORDE = CONTENEDOR__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__CONECTORES = CONTENEDOR__CONECTORES;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__ELEMENTOS = CONTENEDOR__ELEMENTOS;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA__IS_ROOT = CONTENEDOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagrama</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAMA_FEATURE_COUNT = CONTENEDOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.LabelImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 11;

	/**
	 * The feature id for the '<em><b>Is Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__IS_BOLD = 0;

	/**
	 * The feature id for the '<em><b>Is Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__IS_ITALIC = 1;

	/**
	 * The feature id for the '<em><b>Alineacion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ALINEACION = 2;

	/**
	 * The feature id for the '<em><b>Posicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSICION = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Tamanio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TAMANIO = 5;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.Dibujable <em>Dibujable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.Dibujable
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDibujable()
	 * @generated
	 */
	int DIBUJABLE = 22;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIBUJABLE__GROSOR = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIBUJABLE__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Dibujable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIBUJABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.BordeImpl <em>Borde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.BordeImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getBorde()
	 * @generated
	 */
	int BORDE = 12;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDE__GROSOR = DIBUJABLE__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDE__COLOR = DIBUJABLE__COLOR;

	/**
	 * The number of structural features of the '<em>Borde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDE_FEATURE_COUNT = DIBUJABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl <em>Conector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ConectorImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getConector()
	 * @generated
	 */
	int CONECTOR = 13;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__DIAGRAMA = NAVEGACION_DIAGRAMA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__GROSOR = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__COLOR = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__NAME = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__ESTILO = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__ENRUTAMIENTO = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__FLECHA_SOURCE = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__FLECHA_TARGET = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__SOURCE = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__TARGET = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__NAME_SOURCE = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR__NAME_TARGET = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Conector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONECTOR_FEATURE_COUNT = NAVEGACION_DIAGRAMA_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.PuntoImpl <em>Punto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.PuntoImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPunto()
	 * @generated
	 */
	int PUNTO = 14;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__DIAGRAMA = FIGURA_GEOMETRICA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__NAME = FIGURA_GEOMETRICA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__LABEL = FIGURA_GEOMETRICA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__BORDE = FIGURA_GEOMETRICA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__CONECTORES = FIGURA_GEOMETRICA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__COLOR = FIGURA_GEOMETRICA__COLOR;

	/**
	 * The feature id for the '<em><b>Largo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__LARGO = FIGURA_GEOMETRICA__LARGO;

	/**
	 * The feature id for the '<em><b>Alto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO__ALTO = FIGURA_GEOMETRICA__ALTO;

	/**
	 * The number of structural features of the '<em>Punto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUNTO_FEATURE_COUNT = FIGURA_GEOMETRICA_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.HerenciaImpl <em>Herencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.HerenciaImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getHerencia()
	 * @generated
	 */
	int HERENCIA = 15;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Herencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HERENCIA_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ImplementacionImpl <em>Implementacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ImplementacionImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getImplementacion()
	 * @generated
	 */
	int IMPLEMENTACION = 16;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Implementacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTACION_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.DependenciaImpl <em>Dependencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.DependenciaImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDependencia()
	 * @generated
	 */
	int DEPENDENCIA = 17;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Dependencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIA_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.AsociacionImpl <em>Asociacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.AsociacionImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAsociacion()
	 * @generated
	 */
	int ASOCIACION = 18;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Asociacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASOCIACION_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.AgregacionImpl <em>Agregacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.AgregacionImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAgregacion()
	 * @generated
	 */
	int AGREGACION = 19;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Agregacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGREGACION_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ComposicionImpl <em>Composicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ComposicionImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getComposicion()
	 * @generated
	 */
	int COMPOSICION = 20;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__DIAGRAMA = CONECTOR__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Grosor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__GROSOR = CONECTOR__GROSOR;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__COLOR = CONECTOR__COLOR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__NAME = CONECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Estilo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__ESTILO = CONECTOR__ESTILO;

	/**
	 * The feature id for the '<em><b>Enrutamiento</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__ENRUTAMIENTO = CONECTOR__ENRUTAMIENTO;

	/**
	 * The feature id for the '<em><b>Flecha source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__FLECHA_SOURCE = CONECTOR__FLECHA_SOURCE;

	/**
	 * The feature id for the '<em><b>Flecha target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__FLECHA_TARGET = CONECTOR__FLECHA_TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__SOURCE = CONECTOR__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__TARGET = CONECTOR__TARGET;

	/**
	 * The feature id for the '<em><b>Name Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__NAME_SOURCE = CONECTOR__NAME_SOURCE;

	/**
	 * The feature id for the '<em><b>Name Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION__NAME_TARGET = CONECTOR__NAME_TARGET;

	/**
	 * The number of structural features of the '<em>Composicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSICION_FEATURE_COUNT = CONECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.impl.ItemImpl
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 21;

	/**
	 * The feature id for the '<em><b>Diagrama</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DIAGRAMA = ELEMENTO_DIAGRAMA__DIAGRAMA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = ELEMENTO_DIAGRAMA__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LABEL = ELEMENTO_DIAGRAMA__LABEL;

	/**
	 * The feature id for the '<em><b>Borde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BORDE = ELEMENTO_DIAGRAMA__BORDE;

	/**
	 * The feature id for the '<em><b>Conectores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONECTORES = ELEMENTO_DIAGRAMA__CONECTORES;

	/**
	 * The feature id for the '<em><b>Icono</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ICONO = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = ELEMENTO_DIAGRAMA_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 23;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.Alineacion <em>Alineacion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.Alineacion
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAlineacion()
	 * @generated
	 */
	int ALINEACION = 24;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.Posicion <em>Posicion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.Posicion
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPosicion()
	 * @generated
	 */
	int POSICION = 25;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.EstiloLinea <em>Estilo Linea</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.EstiloLinea
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getEstiloLinea()
	 * @generated
	 */
	int ESTILO_LINEA = 26;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.TipoEnrutamiento <em>Tipo Enrutamiento</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.TipoEnrutamiento
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTipoEnrutamiento()
	 * @generated
	 */
	int TIPO_ENRUTAMIENTO = 27;

	/**
	 * The meta object id for the '{@link visualizacionMetricas3.visualizacion.TipoFlecha <em>Tipo Flecha</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTipoFlecha()
	 * @generated
	 */
	int TIPO_FLECHA = 28;


	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Elipse <em>Elipse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elipse</em>'.
	 * @see visualizacionMetricas3.visualizacion.Elipse
	 * @generated
	 */
	EClass getElipse();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Cuadrilatero <em>Cuadrilatero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cuadrilatero</em>'.
	 * @see visualizacionMetricas3.visualizacion.Cuadrilatero
	 * @generated
	 */
	EClass getCuadrilatero();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Contenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contenedor</em>'.
	 * @see visualizacionMetricas3.visualizacion.Contenedor
	 * @generated
	 */
	EClass getContenedor();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizacionMetricas3.visualizacion.Contenedor#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elementos</em>'.
	 * @see visualizacionMetricas3.visualizacion.Contenedor#getElementos()
	 * @see #getContenedor()
	 * @generated
	 */
	EReference getContenedor_Elementos();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clase</em>'.
	 * @see visualizacionMetricas3.visualizacion.Clase
	 * @generated
	 */
	EClass getClase();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica <em>Figura Geometrica</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figura Geometrica</em>'.
	 * @see visualizacionMetricas3.visualizacion.FiguraGeometrica
	 * @generated
	 */
	EClass getFiguraGeometrica();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see visualizacionMetricas3.visualizacion.FiguraGeometrica#getColor()
	 * @see #getFiguraGeometrica()
	 * @generated
	 */
	EAttribute getFiguraGeometrica_Color();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getLargo <em>Largo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Largo</em>'.
	 * @see visualizacionMetricas3.visualizacion.FiguraGeometrica#getLargo()
	 * @see #getFiguraGeometrica()
	 * @generated
	 */
	EAttribute getFiguraGeometrica_Largo();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica#getAlto <em>Alto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alto</em>'.
	 * @see visualizacionMetricas3.visualizacion.FiguraGeometrica#getAlto()
	 * @see #getFiguraGeometrica()
	 * @generated
	 */
	EAttribute getFiguraGeometrica_Alto();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Rombo <em>Rombo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rombo</em>'.
	 * @see visualizacionMetricas3.visualizacion.Rombo
	 * @generated
	 */
	EClass getRombo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Triangulo <em>Triangulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangulo</em>'.
	 * @see visualizacionMetricas3.visualizacion.Triangulo
	 * @generated
	 */
	EClass getTriangulo();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paquete</em>'.
	 * @see visualizacionMetricas3.visualizacion.Paquete
	 * @generated
	 */
	EClass getPaquete();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagrama</em>'.
	 * @see visualizacionMetricas3.visualizacion.Diagrama
	 * @generated
	 */
	EClass getDiagrama();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Diagrama#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see visualizacionMetricas3.visualizacion.Diagrama#isIsRoot()
	 * @see #getDiagrama()
	 * @generated
	 */
	EAttribute getDiagrama_IsRoot();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama <em>Elemento Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Diagrama</em>'.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama
	 * @generated
	 */
	EClass getElementoDiagrama();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama#getName()
	 * @see #getElementoDiagrama()
	 * @generated
	 */
	EAttribute getElementoDiagrama_Name();

	/**
	 * Returns the meta object for the containment reference '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama#getLabel()
	 * @see #getElementoDiagrama()
	 * @generated
	 */
	EReference getElementoDiagrama_Label();

	/**
	 * Returns the meta object for the containment reference '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getBorde <em>Borde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Borde</em>'.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama#getBorde()
	 * @see #getElementoDiagrama()
	 * @generated
	 */
	EReference getElementoDiagrama_Borde();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama#getConectores <em>Conectores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conectores</em>'.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama#getConectores()
	 * @see #getElementoDiagrama()
	 * @generated
	 */
	EReference getElementoDiagrama_Conectores();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama <em>Navegacion Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navegacion Diagrama</em>'.
	 * @see visualizacionMetricas3.visualizacion.NavegacionDiagrama
	 * @generated
	 */
	EClass getNavegacionDiagrama();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama#getDiagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagrama</em>'.
	 * @see visualizacionMetricas3.visualizacion.NavegacionDiagrama#getDiagrama()
	 * @see #getNavegacionDiagrama()
	 * @generated
	 */
	EReference getNavegacionDiagrama_Diagrama();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#isIsBold <em>Is Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bold</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#isIsBold()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_IsBold();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#isIsItalic <em>Is Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Italic</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#isIsItalic()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_IsItalic();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#getAlineacion <em>Alineacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alineacion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#getAlineacion()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Alineacion();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#getPosicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posicion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#getPosicion()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Posicion();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Label#getTamanio <em>Tamanio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tamanio</em>'.
	 * @see visualizacionMetricas3.visualizacion.Label#getTamanio()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Tamanio();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Borde <em>Borde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Borde</em>'.
	 * @see visualizacionMetricas3.visualizacion.Borde
	 * @generated
	 */
	EClass getBorde();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Conector <em>Conector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conector</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector
	 * @generated
	 */
	EClass getConector();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getName()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Name();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getEstilo <em>Estilo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estilo</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getEstilo()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Estilo();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getEnrutamiento <em>Enrutamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enrutamiento</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getEnrutamiento()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Enrutamiento();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_source <em>Flecha source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flecha source</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getFlecha_source()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Flecha_source();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getFlecha_target <em>Flecha target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flecha target</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getFlecha_target()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_Flecha_target();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.visualizacion.Conector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getSource()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_Source();

	/**
	 * Returns the meta object for the reference '{@link visualizacionMetricas3.visualizacion.Conector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getTarget()
	 * @see #getConector()
	 * @generated
	 */
	EReference getConector_Target();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getNameSource <em>Name Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Source</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getNameSource()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_NameSource();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Conector#getNameTarget <em>Name Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Target</em>'.
	 * @see visualizacionMetricas3.visualizacion.Conector#getNameTarget()
	 * @see #getConector()
	 * @generated
	 */
	EAttribute getConector_NameTarget();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Punto <em>Punto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Punto</em>'.
	 * @see visualizacionMetricas3.visualizacion.Punto
	 * @generated
	 */
	EClass getPunto();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Herencia</em>'.
	 * @see visualizacionMetricas3.visualizacion.Herencia
	 * @generated
	 */
	EClass getHerencia();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementacion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Implementacion
	 * @generated
	 */
	EClass getImplementacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Dependencia <em>Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencia</em>'.
	 * @see visualizacionMetricas3.visualizacion.Dependencia
	 * @generated
	 */
	EClass getDependencia();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asociacion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Asociacion
	 * @generated
	 */
	EClass getAsociacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agregacion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Agregacion
	 * @generated
	 */
	EClass getAgregacion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composicion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Composicion
	 * @generated
	 */
	EClass getComposicion();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see visualizacionMetricas3.visualizacion.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Item#getIcono <em>Icono</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icono</em>'.
	 * @see visualizacionMetricas3.visualizacion.Item#getIcono()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Icono();

	/**
	 * Returns the meta object for class '{@link visualizacionMetricas3.visualizacion.Dibujable <em>Dibujable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dibujable</em>'.
	 * @see visualizacionMetricas3.visualizacion.Dibujable
	 * @generated
	 */
	EClass getDibujable();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Dibujable#getGrosor <em>Grosor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grosor</em>'.
	 * @see visualizacionMetricas3.visualizacion.Dibujable#getGrosor()
	 * @see #getDibujable()
	 * @generated
	 */
	EAttribute getDibujable_Grosor();

	/**
	 * Returns the meta object for the attribute '{@link visualizacionMetricas3.visualizacion.Dibujable#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see visualizacionMetricas3.visualizacion.Dibujable#getColor()
	 * @see #getDibujable()
	 * @generated
	 */
	EAttribute getDibujable_Color();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see visualizacionMetricas3.visualizacion.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.Alineacion <em>Alineacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alineacion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Alineacion
	 * @generated
	 */
	EEnum getAlineacion();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.Posicion <em>Posicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Posicion</em>'.
	 * @see visualizacionMetricas3.visualizacion.Posicion
	 * @generated
	 */
	EEnum getPosicion();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.EstiloLinea <em>Estilo Linea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Estilo Linea</em>'.
	 * @see visualizacionMetricas3.visualizacion.EstiloLinea
	 * @generated
	 */
	EEnum getEstiloLinea();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.TipoEnrutamiento <em>Tipo Enrutamiento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Enrutamiento</em>'.
	 * @see visualizacionMetricas3.visualizacion.TipoEnrutamiento
	 * @generated
	 */
	EEnum getTipoEnrutamiento();

	/**
	 * Returns the meta object for enum '{@link visualizacionMetricas3.visualizacion.TipoFlecha <em>Tipo Flecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Flecha</em>'.
	 * @see visualizacionMetricas3.visualizacion.TipoFlecha
	 * @generated
	 */
	EEnum getTipoFlecha();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizacionFactory getVisualizacionFactory();

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
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ElipseImpl <em>Elipse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ElipseImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getElipse()
		 * @generated
		 */
		EClass ELIPSE = eINSTANCE.getElipse();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.CuadrilateroImpl <em>Cuadrilatero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.CuadrilateroImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getCuadrilatero()
		 * @generated
		 */
		EClass CUADRILATERO = eINSTANCE.getCuadrilatero();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.Contenedor <em>Contenedor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.Contenedor
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getContenedor()
		 * @generated
		 */
		EClass CONTENEDOR = eINSTANCE.getContenedor();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENEDOR__ELEMENTOS = eINSTANCE.getContenedor_Elementos();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl <em>Clase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ClaseImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getClase()
		 * @generated
		 */
		EClass CLASE = eINSTANCE.getClase();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl <em>Figura Geometrica</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getFiguraGeometrica()
		 * @generated
		 */
		EClass FIGURA_GEOMETRICA = eINSTANCE.getFiguraGeometrica();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURA_GEOMETRICA__COLOR = eINSTANCE.getFiguraGeometrica_Color();

		/**
		 * The meta object literal for the '<em><b>Largo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURA_GEOMETRICA__LARGO = eINSTANCE.getFiguraGeometrica_Largo();

		/**
		 * The meta object literal for the '<em><b>Alto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURA_GEOMETRICA__ALTO = eINSTANCE.getFiguraGeometrica_Alto();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.RomboImpl <em>Rombo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.RomboImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getRombo()
		 * @generated
		 */
		EClass ROMBO = eINSTANCE.getRombo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.TrianguloImpl <em>Triangulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.TrianguloImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTriangulo()
		 * @generated
		 */
		EClass TRIANGULO = eINSTANCE.getTriangulo();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.PaqueteImpl <em>Paquete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.PaqueteImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPaquete()
		 * @generated
		 */
		EClass PAQUETE = eINSTANCE.getPaquete();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl <em>Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.DiagramaImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDiagrama()
		 * @generated
		 */
		EClass DIAGRAMA = eINSTANCE.getDiagrama();

		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAMA__IS_ROOT = eINSTANCE.getDiagrama_IsRoot();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama <em>Elemento Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getElementoDiagrama()
		 * @generated
		 */
		EClass ELEMENTO_DIAGRAMA = eINSTANCE.getElementoDiagrama();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENTO_DIAGRAMA__NAME = eINSTANCE.getElementoDiagrama_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_DIAGRAMA__LABEL = eINSTANCE.getElementoDiagrama_Label();

		/**
		 * The meta object literal for the '<em><b>Borde</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_DIAGRAMA__BORDE = eINSTANCE.getElementoDiagrama_Borde();

		/**
		 * The meta object literal for the '<em><b>Conectores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTO_DIAGRAMA__CONECTORES = eINSTANCE.getElementoDiagrama_Conectores();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama <em>Navegacion Diagrama</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.NavegacionDiagrama
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getNavegacionDiagrama()
		 * @generated
		 */
		EClass NAVEGACION_DIAGRAMA = eINSTANCE.getNavegacionDiagrama();

		/**
		 * The meta object literal for the '<em><b>Diagrama</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVEGACION_DIAGRAMA__DIAGRAMA = eINSTANCE.getNavegacionDiagrama_Diagrama();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.LabelImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Is Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__IS_BOLD = eINSTANCE.getLabel_IsBold();

		/**
		 * The meta object literal for the '<em><b>Is Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__IS_ITALIC = eINSTANCE.getLabel_IsItalic();

		/**
		 * The meta object literal for the '<em><b>Alineacion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ALINEACION = eINSTANCE.getLabel_Alineacion();

		/**
		 * The meta object literal for the '<em><b>Posicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__POSICION = eINSTANCE.getLabel_Posicion();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '<em><b>Tamanio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TAMANIO = eINSTANCE.getLabel_Tamanio();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.BordeImpl <em>Borde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.BordeImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getBorde()
		 * @generated
		 */
		EClass BORDE = eINSTANCE.getBorde();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl <em>Conector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ConectorImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getConector()
		 * @generated
		 */
		EClass CONECTOR = eINSTANCE.getConector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__NAME = eINSTANCE.getConector_Name();

		/**
		 * The meta object literal for the '<em><b>Estilo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__ESTILO = eINSTANCE.getConector_Estilo();

		/**
		 * The meta object literal for the '<em><b>Enrutamiento</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__ENRUTAMIENTO = eINSTANCE.getConector_Enrutamiento();

		/**
		 * The meta object literal for the '<em><b>Flecha source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__FLECHA_SOURCE = eINSTANCE.getConector_Flecha_source();

		/**
		 * The meta object literal for the '<em><b>Flecha target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__FLECHA_TARGET = eINSTANCE.getConector_Flecha_target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__SOURCE = eINSTANCE.getConector_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONECTOR__TARGET = eINSTANCE.getConector_Target();

		/**
		 * The meta object literal for the '<em><b>Name Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__NAME_SOURCE = eINSTANCE.getConector_NameSource();

		/**
		 * The meta object literal for the '<em><b>Name Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONECTOR__NAME_TARGET = eINSTANCE.getConector_NameTarget();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.PuntoImpl <em>Punto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.PuntoImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPunto()
		 * @generated
		 */
		EClass PUNTO = eINSTANCE.getPunto();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.HerenciaImpl <em>Herencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.HerenciaImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getHerencia()
		 * @generated
		 */
		EClass HERENCIA = eINSTANCE.getHerencia();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ImplementacionImpl <em>Implementacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ImplementacionImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getImplementacion()
		 * @generated
		 */
		EClass IMPLEMENTACION = eINSTANCE.getImplementacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.DependenciaImpl <em>Dependencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.DependenciaImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDependencia()
		 * @generated
		 */
		EClass DEPENDENCIA = eINSTANCE.getDependencia();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.AsociacionImpl <em>Asociacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.AsociacionImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAsociacion()
		 * @generated
		 */
		EClass ASOCIACION = eINSTANCE.getAsociacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.AgregacionImpl <em>Agregacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.AgregacionImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAgregacion()
		 * @generated
		 */
		EClass AGREGACION = eINSTANCE.getAgregacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ComposicionImpl <em>Composicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ComposicionImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getComposicion()
		 * @generated
		 */
		EClass COMPOSICION = eINSTANCE.getComposicion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.impl.ItemImpl
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Icono</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ICONO = eINSTANCE.getItem_Icono();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.Dibujable <em>Dibujable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.Dibujable
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getDibujable()
		 * @generated
		 */
		EClass DIBUJABLE = eINSTANCE.getDibujable();

		/**
		 * The meta object literal for the '<em><b>Grosor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIBUJABLE__GROSOR = eINSTANCE.getDibujable_Grosor();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIBUJABLE__COLOR = eINSTANCE.getDibujable_Color();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.Color
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.Alineacion <em>Alineacion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.Alineacion
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getAlineacion()
		 * @generated
		 */
		EEnum ALINEACION = eINSTANCE.getAlineacion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.Posicion <em>Posicion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.Posicion
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getPosicion()
		 * @generated
		 */
		EEnum POSICION = eINSTANCE.getPosicion();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.EstiloLinea <em>Estilo Linea</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.EstiloLinea
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getEstiloLinea()
		 * @generated
		 */
		EEnum ESTILO_LINEA = eINSTANCE.getEstiloLinea();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.TipoEnrutamiento <em>Tipo Enrutamiento</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.TipoEnrutamiento
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTipoEnrutamiento()
		 * @generated
		 */
		EEnum TIPO_ENRUTAMIENTO = eINSTANCE.getTipoEnrutamiento();

		/**
		 * The meta object literal for the '{@link visualizacionMetricas3.visualizacion.TipoFlecha <em>Tipo Flecha</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizacionMetricas3.visualizacion.TipoFlecha
		 * @see visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl#getTipoFlecha()
		 * @generated
		 */
		EEnum TIPO_FLECHA = eINSTANCE.getTipoFlecha();

	}

} //VisualizacionPackage
