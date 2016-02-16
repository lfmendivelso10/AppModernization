/**
 */
package visualizacionMetricas3.representacion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import visualizacionMetricas3.VisualizacionMetricas3Package;

import visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl;

import visualizacionMetricas3.representacion.Agregacion;
import visualizacionMetricas3.representacion.Aplicacion;
import visualizacionMetricas3.representacion.Archivo;
import visualizacionMetricas3.representacion.Asociacion;
import visualizacionMetricas3.representacion.Atributo;
import visualizacionMetricas3.representacion.Clase;
import visualizacionMetricas3.representacion.Cluster;
import visualizacionMetricas3.representacion.Composicion;
import visualizacionMetricas3.representacion.Dependencia;
import visualizacionMetricas3.representacion.Form;
import visualizacionMetricas3.representacion.Generalizacion;
import visualizacionMetricas3.representacion.Intercepcion;
import visualizacionMetricas3.representacion.Metodo;
import visualizacionMetricas3.representacion.Modulo;
import visualizacionMetricas3.representacion.Paquete;
import visualizacionMetricas3.representacion.RepresentacionFactory;
import visualizacionMetricas3.representacion.RepresentacionPackage;
import visualizacionMetricas3.representacion.Servicio;
import visualizacionMetricas3.representacion.Tabla;

import visualizacionMetricas3.visualizacion.VisualizacionPackage;

import visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentacionPackageImpl extends EPackageImpl implements RepresentacionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paqueteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archivoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aplicacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asociacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass composicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agregacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atributoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intercepcionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see visualizacionMetricas3.representacion.RepresentacionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepresentacionPackageImpl() {
		super(eNS_URI, RepresentacionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RepresentacionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepresentacionPackage init() {
		if (isInited) return (RepresentacionPackage)EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI);

		// Obtain or create and register package
		RepresentacionPackageImpl theRepresentacionPackage = (RepresentacionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RepresentacionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RepresentacionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VisualizacionMetricas3PackageImpl theVisualizacionMetricas3Package = (VisualizacionMetricas3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI) instanceof VisualizacionMetricas3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI) : VisualizacionMetricas3Package.eINSTANCE);
		VisualizacionPackageImpl theVisualizacionPackage = (VisualizacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI) instanceof VisualizacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI) : VisualizacionPackage.eINSTANCE);

		// Create package meta-data objects
		theRepresentacionPackage.createPackageContents();
		theVisualizacionMetricas3Package.createPackageContents();
		theVisualizacionPackage.createPackageContents();

		// Initialize created meta-data
		theRepresentacionPackage.initializePackageContents();
		theVisualizacionMetricas3Package.initializePackageContents();
		theVisualizacionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepresentacionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepresentacionPackage.eNS_URI, theRepresentacionPackage);
		return theRepresentacionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCluster() {
		return clusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaquete() {
		return paqueteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClase() {
		return claseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchivo() {
		return archivoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicio() {
		return servicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabla() {
		return tablaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAplicacion() {
		return aplicacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependencia() {
		return dependenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsociacion() {
		return asociacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposicion() {
		return composicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgregacion() {
		return agregacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizacion() {
		return generalizacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetodo() {
		return metodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtributo() {
		return atributoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntercepcion() {
		return intercepcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntercepcion_Arco() {
		return (EReference)intercepcionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionFactory getRepresentacionFactory() {
		return (RepresentacionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		clusterEClass = createEClass(CLUSTER);

		paqueteEClass = createEClass(PAQUETE);

		moduloEClass = createEClass(MODULO);

		claseEClass = createEClass(CLASE);

		archivoEClass = createEClass(ARCHIVO);

		servicioEClass = createEClass(SERVICIO);

		tablaEClass = createEClass(TABLA);

		formEClass = createEClass(FORM);

		aplicacionEClass = createEClass(APLICACION);

		dependenciaEClass = createEClass(DEPENDENCIA);

		asociacionEClass = createEClass(ASOCIACION);

		composicionEClass = createEClass(COMPOSICION);

		agregacionEClass = createEClass(AGREGACION);

		generalizacionEClass = createEClass(GENERALIZACION);

		metodoEClass = createEClass(METODO);

		atributoEClass = createEClass(ATRIBUTO);

		intercepcionEClass = createEClass(INTERCEPCION);
		createEReference(intercepcionEClass, INTERCEPCION__ARCO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		VisualizacionMetricas3Package theVisualizacionMetricas3Package = (VisualizacionMetricas3Package)EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		clusterEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getVinculo());
		paqueteEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		moduloEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		claseEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		archivoEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		servicioEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getVinculo());
		tablaEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		formEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		aplicacionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getNodo());
		dependenciaEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getTipoRelacion());
		asociacionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getTipoRelacion());
		composicionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getTipoRelacion());
		agregacionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getTipoRelacion());
		generalizacionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getTipoRelacion());
		metodoEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getHoja());
		atributoEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getHoja());
		intercepcionEClass.getESuperTypes().add(theVisualizacionMetricas3Package.getVinculo());

		// Initialize classes and features; add operations and parameters
		initEClass(clusterEClass, Cluster.class, "Cluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paqueteEClass, Paquete.class, "Paquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(archivoEClass, Archivo.class, "Archivo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicioEClass, Servicio.class, "Servicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tablaEClass, Tabla.class, "Tabla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aplicacionEClass, Aplicacion.class, "Aplicacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependenciaEClass, Dependencia.class, "Dependencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asociacionEClass, Asociacion.class, "Asociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composicionEClass, Composicion.class, "Composicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agregacionEClass, Agregacion.class, "Agregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalizacionEClass, Generalizacion.class, "Generalizacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metodoEClass, Metodo.class, "Metodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intercepcionEClass, Intercepcion.class, "Intercepcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntercepcion_Arco(), theVisualizacionMetricas3Package.getArco(), null, "arco", null, 1, 1, Intercepcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RepresentacionPackageImpl
