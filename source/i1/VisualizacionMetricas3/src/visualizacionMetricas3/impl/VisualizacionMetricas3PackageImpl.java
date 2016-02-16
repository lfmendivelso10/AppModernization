/**
 */
package visualizacionMetricas3.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import visualizacionMetricas3.Arco;
import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.Hoja;
import visualizacionMetricas3.Medible;
import visualizacionMetricas3.Metrica;
import visualizacionMetricas3.MetricaRelacion;
import visualizacionMetricas3.Nodo;
import visualizacionMetricas3.TipoMetrica;
import visualizacionMetricas3.TipoRelacion;
import visualizacionMetricas3.Vinculo;
import visualizacionMetricas3.VisualizacionMetricas3Factory;
import visualizacionMetricas3.VisualizacionMetricas3Package;

import visualizacionMetricas3.representacion.RepresentacionPackage;

import visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl;

import visualizacionMetricas3.visualizacion.VisualizacionPackage;

import visualizacionMetricas3.visualizacion.impl.VisualizacionPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizacionMetricas3PackageImpl extends EPackageImpl implements VisualizacionMetricas3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hojaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medibleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arcoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipoRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vinculoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricaRelacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoMetricaEEnum = null;

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
	 * @see visualizacionMetricas3.VisualizacionMetricas3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizacionMetricas3PackageImpl() {
		super(eNS_URI, VisualizacionMetricas3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisualizacionMetricas3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizacionMetricas3Package init() {
		if (isInited) return (VisualizacionMetricas3Package)EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI);

		// Obtain or create and register package
		VisualizacionMetricas3PackageImpl theVisualizacionMetricas3Package = (VisualizacionMetricas3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizacionMetricas3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizacionMetricas3PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RepresentacionPackageImpl theRepresentacionPackage = (RepresentacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI) instanceof RepresentacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI) : RepresentacionPackage.eINSTANCE);
		VisualizacionPackageImpl theVisualizacionPackage = (VisualizacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI) instanceof VisualizacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI) : VisualizacionPackage.eINSTANCE);

		// Create package meta-data objects
		theVisualizacionMetricas3Package.createPackageContents();
		theRepresentacionPackage.createPackageContents();
		theVisualizacionPackage.createPackageContents();

		// Initialize created meta-data
		theVisualizacionMetricas3Package.initializePackageContents();
		theRepresentacionPackage.initializePackageContents();
		theVisualizacionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualizacionMetricas3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizacionMetricas3Package.eNS_URI, theVisualizacionMetricas3Package);
		return theVisualizacionMetricas3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElemento_Relaciones() {
		return (EReference)elementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElemento_Name() {
		return (EAttribute)elementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodo() {
		return nodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodo_Hijos() {
		return (EReference)nodoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHoja() {
		return hojaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedible() {
		return medibleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedible_Metricas() {
		return (EReference)medibleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArco() {
		return arcoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArco_Target() {
		return (EReference)arcoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArco_Tipos() {
		return (EReference)arcoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArco_Source() {
		return (EReference)arcoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetrica() {
		return metricaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetrica_Tipo() {
		return (EAttribute)metricaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetrica_Valor() {
		return (EAttribute)metricaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipoRelacion() {
		return tipoRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVinculo() {
		return vinculoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVinculo_Elementos() {
		return (EReference)vinculoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricaRelacion() {
		return metricaRelacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricaRelacion_Relacion() {
		return (EReference)metricaRelacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoMetrica() {
		return tipoMetricaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionMetricas3Factory getVisualizacionMetricas3Factory() {
		return (VisualizacionMetricas3Factory)getEFactoryInstance();
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
		elementoEClass = createEClass(ELEMENTO);
		createEReference(elementoEClass, ELEMENTO__RELACIONES);
		createEAttribute(elementoEClass, ELEMENTO__NAME);

		nodoEClass = createEClass(NODO);
		createEReference(nodoEClass, NODO__HIJOS);

		hojaEClass = createEClass(HOJA);

		medibleEClass = createEClass(MEDIBLE);
		createEReference(medibleEClass, MEDIBLE__METRICAS);

		arcoEClass = createEClass(ARCO);
		createEReference(arcoEClass, ARCO__TARGET);
		createEReference(arcoEClass, ARCO__TIPOS);
		createEReference(arcoEClass, ARCO__SOURCE);

		metricaEClass = createEClass(METRICA);
		createEAttribute(metricaEClass, METRICA__TIPO);
		createEAttribute(metricaEClass, METRICA__VALOR);

		tipoRelacionEClass = createEClass(TIPO_RELACION);

		vinculoEClass = createEClass(VINCULO);
		createEReference(vinculoEClass, VINCULO__ELEMENTOS);

		metricaRelacionEClass = createEClass(METRICA_RELACION);
		createEReference(metricaRelacionEClass, METRICA_RELACION__RELACION);

		// Create enums
		tipoMetricaEEnum = createEEnum(TIPO_METRICA);
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
		RepresentacionPackage theRepresentacionPackage = (RepresentacionPackage)EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI);
		VisualizacionPackage theVisualizacionPackage = (VisualizacionPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRepresentacionPackage);
		getESubpackages().add(theVisualizacionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementoEClass.getESuperTypes().add(this.getMedible());
		nodoEClass.getESuperTypes().add(this.getElemento());
		hojaEClass.getESuperTypes().add(this.getElemento());
		arcoEClass.getESuperTypes().add(this.getMedible());
		vinculoEClass.getESuperTypes().add(this.getElemento());
		metricaRelacionEClass.getESuperTypes().add(this.getMetrica());

		// Initialize classes and features; add operations and parameters
		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElemento_Relaciones(), this.getArco(), null, "relaciones", null, 0, -1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElemento_Name(), ecorePackage.getEString(), "name", null, 0, 1, Elemento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoEClass, Nodo.class, "Nodo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodo_Hijos(), this.getElemento(), null, "hijos", null, 0, -1, Nodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hojaEClass, Hoja.class, "Hoja", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(medibleEClass, Medible.class, "Medible", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMedible_Metricas(), this.getMetrica(), null, "metricas", null, 0, -1, Medible.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arcoEClass, Arco.class, "Arco", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArco_Target(), this.getElemento(), null, "target", null, 1, 1, Arco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArco_Tipos(), this.getTipoRelacion(), null, "tipos", null, 1, -1, Arco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArco_Source(), this.getElemento(), null, "source", null, 1, 1, Arco.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricaEClass, Metrica.class, "Metrica", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetrica_Tipo(), this.getTipoMetrica(), "tipo", null, 0, 1, Metrica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetrica_Valor(), theXMLTypePackage.getDouble(), "valor", null, 0, 1, Metrica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipoRelacionEClass, TipoRelacion.class, "TipoRelacion", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vinculoEClass, Vinculo.class, "Vinculo", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVinculo_Elementos(), this.getElemento(), null, "elementos", null, 0, -1, Vinculo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricaRelacionEClass, MetricaRelacion.class, "MetricaRelacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricaRelacion_Relacion(), this.getElemento(), null, "relacion", null, 0, 1, MetricaRelacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tipoMetricaEEnum, TipoMetrica.class, "TipoMetrica");
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.CALCULATED_COUPLING);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.WEIGHTED_METHODS_PER_CLASS);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.NUMBER_OF_USES);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.NUMBER_OF_CONTAINMENTS);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.COUPLING_BETWEEN_OBJECTS);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.NUMBER_OF_CLASSES_MEASURE);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.NUMBER_OF_LINES_MEASURE);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET);
		addEEnumLiteral(tipoMetricaEEnum, TipoMetrica.CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE);

		// Create resource
		createResource(eNS_URI);
	}

} //VisualizacionMetricas3PackageImpl
