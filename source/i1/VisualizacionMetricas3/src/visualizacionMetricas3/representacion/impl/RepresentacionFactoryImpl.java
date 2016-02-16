/**
 */
package visualizacionMetricas3.representacion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visualizacionMetricas3.representacion.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentacionFactoryImpl extends EFactoryImpl implements RepresentacionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepresentacionFactory init() {
		try {
			RepresentacionFactory theRepresentacionFactory = (RepresentacionFactory)EPackage.Registry.INSTANCE.getEFactory(RepresentacionPackage.eNS_URI);
			if (theRepresentacionFactory != null) {
				return theRepresentacionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RepresentacionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionFactoryImpl() {
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
			case RepresentacionPackage.CLUSTER: return createCluster();
			case RepresentacionPackage.PAQUETE: return createPaquete();
			case RepresentacionPackage.MODULO: return createModulo();
			case RepresentacionPackage.CLASE: return createClase();
			case RepresentacionPackage.ARCHIVO: return createArchivo();
			case RepresentacionPackage.SERVICIO: return createServicio();
			case RepresentacionPackage.TABLA: return createTabla();
			case RepresentacionPackage.FORM: return createForm();
			case RepresentacionPackage.APLICACION: return createAplicacion();
			case RepresentacionPackage.DEPENDENCIA: return createDependencia();
			case RepresentacionPackage.ASOCIACION: return createAsociacion();
			case RepresentacionPackage.COMPOSICION: return createComposicion();
			case RepresentacionPackage.AGREGACION: return createAgregacion();
			case RepresentacionPackage.GENERALIZACION: return createGeneralizacion();
			case RepresentacionPackage.METODO: return createMetodo();
			case RepresentacionPackage.ATRIBUTO: return createAtributo();
			case RepresentacionPackage.INTERCEPCION: return createIntercepcion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paquete createPaquete() {
		PaqueteImpl paquete = new PaqueteImpl();
		return paquete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clase createClase() {
		ClaseImpl clase = new ClaseImpl();
		return clase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Archivo createArchivo() {
		ArchivoImpl archivo = new ArchivoImpl();
		return archivo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servicio createServicio() {
		ServicioImpl servicio = new ServicioImpl();
		return servicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabla createTabla() {
		TablaImpl tabla = new TablaImpl();
		return tabla;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aplicacion createAplicacion() {
		AplicacionImpl aplicacion = new AplicacionImpl();
		return aplicacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependencia createDependencia() {
		DependenciaImpl dependencia = new DependenciaImpl();
		return dependencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Asociacion createAsociacion() {
		AsociacionImpl asociacion = new AsociacionImpl();
		return asociacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composicion createComposicion() {
		ComposicionImpl composicion = new ComposicionImpl();
		return composicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agregacion createAgregacion() {
		AgregacionImpl agregacion = new AgregacionImpl();
		return agregacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalizacion createGeneralizacion() {
		GeneralizacionImpl generalizacion = new GeneralizacionImpl();
		return generalizacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metodo createMetodo() {
		MetodoImpl metodo = new MetodoImpl();
		return metodo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atributo createAtributo() {
		AtributoImpl atributo = new AtributoImpl();
		return atributo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intercepcion createIntercepcion() {
		IntercepcionImpl intercepcion = new IntercepcionImpl();
		return intercepcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionPackage getRepresentacionPackage() {
		return (RepresentacionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RepresentacionPackage getPackage() {
		return RepresentacionPackage.eINSTANCE;
	}

} //RepresentacionFactoryImpl
