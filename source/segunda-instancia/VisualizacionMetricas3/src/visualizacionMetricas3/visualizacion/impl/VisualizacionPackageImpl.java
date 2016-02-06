/**
 */
package visualizacionMetricas3.visualizacion.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import visualizacionMetricas3.VisualizacionMetricas3Package;

import visualizacionMetricas3.impl.VisualizacionMetricas3PackageImpl;

import visualizacionMetricas3.representacion.RepresentacionPackage;

import visualizacionMetricas3.representacion.impl.RepresentacionPackageImpl;

import visualizacionMetricas3.visualizacion.Agregacion;
import visualizacionMetricas3.visualizacion.Alineacion;
import visualizacionMetricas3.visualizacion.Asociacion;
import visualizacionMetricas3.visualizacion.Borde;
import visualizacionMetricas3.visualizacion.Clase;
import visualizacionMetricas3.visualizacion.Color;
import visualizacionMetricas3.visualizacion.Composicion;
import visualizacionMetricas3.visualizacion.Conector;
import visualizacionMetricas3.visualizacion.Contenedor;
import visualizacionMetricas3.visualizacion.Cuadrilatero;
import visualizacionMetricas3.visualizacion.Dependencia;
import visualizacionMetricas3.visualizacion.Diagrama;
import visualizacionMetricas3.visualizacion.Dibujable;
import visualizacionMetricas3.visualizacion.ElementoDiagrama;
import visualizacionMetricas3.visualizacion.Elipse;
import visualizacionMetricas3.visualizacion.EstiloLinea;
import visualizacionMetricas3.visualizacion.FiguraGeometrica;
import visualizacionMetricas3.visualizacion.Herencia;
import visualizacionMetricas3.visualizacion.Implementacion;
import visualizacionMetricas3.visualizacion.Item;
import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.NavegacionDiagrama;
import visualizacionMetricas3.visualizacion.Paquete;
import visualizacionMetricas3.visualizacion.Posicion;
import visualizacionMetricas3.visualizacion.Punto;
import visualizacionMetricas3.visualizacion.Rombo;
import visualizacionMetricas3.visualizacion.TipoEnrutamiento;
import visualizacionMetricas3.visualizacion.TipoFlecha;
import visualizacionMetricas3.visualizacion.Triangulo;
import visualizacionMetricas3.visualizacion.VisualizacionFactory;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizacionPackageImpl extends EPackageImpl implements VisualizacionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cuadrilateroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contenedorEClass = null;

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
	private EClass figuraGeometricaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass romboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trianguloEClass = null;

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
	private EClass diagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoDiagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navegacionDiagramaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bordeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puntoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass herenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementacionEClass = null;

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
	private EClass agregacionEClass = null;

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
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dibujableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alineacionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum posicionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum estiloLineaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoEnrutamientoEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tipoFlechaEEnum = null;

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
	 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizacionPackageImpl() {
		super(eNS_URI, VisualizacionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link VisualizacionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizacionPackage init() {
		if (isInited) return (VisualizacionPackage)EPackage.Registry.INSTANCE.getEPackage(VisualizacionPackage.eNS_URI);

		// Obtain or create and register package
		VisualizacionPackageImpl theVisualizacionPackage = (VisualizacionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizacionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizacionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		VisualizacionMetricas3PackageImpl theVisualizacionMetricas3Package = (VisualizacionMetricas3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI) instanceof VisualizacionMetricas3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VisualizacionMetricas3Package.eNS_URI) : VisualizacionMetricas3Package.eINSTANCE);
		RepresentacionPackageImpl theRepresentacionPackage = (RepresentacionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI) instanceof RepresentacionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresentacionPackage.eNS_URI) : RepresentacionPackage.eINSTANCE);

		// Create package meta-data objects
		theVisualizacionPackage.createPackageContents();
		theVisualizacionMetricas3Package.createPackageContents();
		theRepresentacionPackage.createPackageContents();

		// Initialize created meta-data
		theVisualizacionPackage.initializePackageContents();
		theVisualizacionMetricas3Package.initializePackageContents();
		theRepresentacionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualizacionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizacionPackage.eNS_URI, theVisualizacionPackage);
		return theVisualizacionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElipse() {
		return elipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCuadrilatero() {
		return cuadrilateroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContenedor() {
		return contenedorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContenedor_Elementos() {
		return (EReference)contenedorEClass.getEStructuralFeatures().get(0);
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
	public EClass getFiguraGeometrica() {
		return figuraGeometricaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiguraGeometrica_Color() {
		return (EAttribute)figuraGeometricaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiguraGeometrica_Largo() {
		return (EAttribute)figuraGeometricaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFiguraGeometrica_Alto() {
		return (EAttribute)figuraGeometricaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRombo() {
		return romboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangulo() {
		return trianguloEClass;
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
	public EClass getDiagrama() {
		return diagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagrama_IsRoot() {
		return (EAttribute)diagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementoDiagrama() {
		return elementoDiagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementoDiagrama_Name() {
		return (EAttribute)elementoDiagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoDiagrama_Label() {
		return (EReference)elementoDiagramaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoDiagrama_Borde() {
		return (EReference)elementoDiagramaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementoDiagrama_Conectores() {
		return (EReference)elementoDiagramaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavegacionDiagrama() {
		return navegacionDiagramaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavegacionDiagrama_Diagrama() {
		return (EReference)navegacionDiagramaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_IsBold() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_IsItalic() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Alineacion() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Posicion() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Color() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Tamanio() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBorde() {
		return bordeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConector() {
		return conectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_Name() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_Estilo() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_Enrutamiento() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_Flecha_source() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_Flecha_target() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConector_Source() {
		return (EReference)conectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConector_Target() {
		return (EReference)conectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_NameSource() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConector_NameTarget() {
		return (EAttribute)conectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPunto() {
		return puntoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHerencia() {
		return herenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementacion() {
		return implementacionEClass;
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
	public EClass getAgregacion() {
		return agregacionEClass;
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
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Icono() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDibujable() {
		return dibujableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDibujable_Grosor() {
		return (EAttribute)dibujableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDibujable_Color() {
		return (EAttribute)dibujableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlineacion() {
		return alineacionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPosicion() {
		return posicionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEstiloLinea() {
		return estiloLineaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoEnrutamiento() {
		return tipoEnrutamientoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTipoFlecha() {
		return tipoFlechaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionFactory getVisualizacionFactory() {
		return (VisualizacionFactory)getEFactoryInstance();
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
		elipseEClass = createEClass(ELIPSE);

		cuadrilateroEClass = createEClass(CUADRILATERO);

		contenedorEClass = createEClass(CONTENEDOR);
		createEReference(contenedorEClass, CONTENEDOR__ELEMENTOS);

		claseEClass = createEClass(CLASE);

		figuraGeometricaEClass = createEClass(FIGURA_GEOMETRICA);
		createEAttribute(figuraGeometricaEClass, FIGURA_GEOMETRICA__COLOR);
		createEAttribute(figuraGeometricaEClass, FIGURA_GEOMETRICA__LARGO);
		createEAttribute(figuraGeometricaEClass, FIGURA_GEOMETRICA__ALTO);

		romboEClass = createEClass(ROMBO);

		trianguloEClass = createEClass(TRIANGULO);

		paqueteEClass = createEClass(PAQUETE);

		diagramaEClass = createEClass(DIAGRAMA);
		createEAttribute(diagramaEClass, DIAGRAMA__IS_ROOT);

		elementoDiagramaEClass = createEClass(ELEMENTO_DIAGRAMA);
		createEAttribute(elementoDiagramaEClass, ELEMENTO_DIAGRAMA__NAME);
		createEReference(elementoDiagramaEClass, ELEMENTO_DIAGRAMA__LABEL);
		createEReference(elementoDiagramaEClass, ELEMENTO_DIAGRAMA__BORDE);
		createEReference(elementoDiagramaEClass, ELEMENTO_DIAGRAMA__CONECTORES);

		navegacionDiagramaEClass = createEClass(NAVEGACION_DIAGRAMA);
		createEReference(navegacionDiagramaEClass, NAVEGACION_DIAGRAMA__DIAGRAMA);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__IS_BOLD);
		createEAttribute(labelEClass, LABEL__IS_ITALIC);
		createEAttribute(labelEClass, LABEL__ALINEACION);
		createEAttribute(labelEClass, LABEL__POSICION);
		createEAttribute(labelEClass, LABEL__COLOR);
		createEAttribute(labelEClass, LABEL__TAMANIO);

		bordeEClass = createEClass(BORDE);

		conectorEClass = createEClass(CONECTOR);
		createEAttribute(conectorEClass, CONECTOR__NAME);
		createEAttribute(conectorEClass, CONECTOR__ESTILO);
		createEAttribute(conectorEClass, CONECTOR__ENRUTAMIENTO);
		createEAttribute(conectorEClass, CONECTOR__FLECHA_SOURCE);
		createEAttribute(conectorEClass, CONECTOR__FLECHA_TARGET);
		createEReference(conectorEClass, CONECTOR__SOURCE);
		createEReference(conectorEClass, CONECTOR__TARGET);
		createEAttribute(conectorEClass, CONECTOR__NAME_SOURCE);
		createEAttribute(conectorEClass, CONECTOR__NAME_TARGET);

		puntoEClass = createEClass(PUNTO);

		herenciaEClass = createEClass(HERENCIA);

		implementacionEClass = createEClass(IMPLEMENTACION);

		dependenciaEClass = createEClass(DEPENDENCIA);

		asociacionEClass = createEClass(ASOCIACION);

		agregacionEClass = createEClass(AGREGACION);

		composicionEClass = createEClass(COMPOSICION);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ICONO);

		dibujableEClass = createEClass(DIBUJABLE);
		createEAttribute(dibujableEClass, DIBUJABLE__GROSOR);
		createEAttribute(dibujableEClass, DIBUJABLE__COLOR);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		alineacionEEnum = createEEnum(ALINEACION);
		posicionEEnum = createEEnum(POSICION);
		estiloLineaEEnum = createEEnum(ESTILO_LINEA);
		tipoEnrutamientoEEnum = createEEnum(TIPO_ENRUTAMIENTO);
		tipoFlechaEEnum = createEEnum(TIPO_FLECHA);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elipseEClass.getESuperTypes().add(this.getFiguraGeometrica());
		cuadrilateroEClass.getESuperTypes().add(this.getFiguraGeometrica());
		contenedorEClass.getESuperTypes().add(this.getElementoDiagrama());
		claseEClass.getESuperTypes().add(this.getContenedor());
		figuraGeometricaEClass.getESuperTypes().add(this.getElementoDiagrama());
		romboEClass.getESuperTypes().add(this.getFiguraGeometrica());
		trianguloEClass.getESuperTypes().add(this.getFiguraGeometrica());
		paqueteEClass.getESuperTypes().add(this.getContenedor());
		diagramaEClass.getESuperTypes().add(this.getContenedor());
		elementoDiagramaEClass.getESuperTypes().add(this.getNavegacionDiagrama());
		bordeEClass.getESuperTypes().add(this.getDibujable());
		conectorEClass.getESuperTypes().add(this.getNavegacionDiagrama());
		conectorEClass.getESuperTypes().add(this.getDibujable());
		puntoEClass.getESuperTypes().add(this.getFiguraGeometrica());
		herenciaEClass.getESuperTypes().add(this.getConector());
		implementacionEClass.getESuperTypes().add(this.getConector());
		dependenciaEClass.getESuperTypes().add(this.getConector());
		asociacionEClass.getESuperTypes().add(this.getConector());
		agregacionEClass.getESuperTypes().add(this.getConector());
		composicionEClass.getESuperTypes().add(this.getConector());
		itemEClass.getESuperTypes().add(this.getElementoDiagrama());

		// Initialize classes and features; add operations and parameters
		initEClass(elipseEClass, Elipse.class, "Elipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cuadrilateroEClass, Cuadrilatero.class, "Cuadrilatero", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contenedorEClass, Contenedor.class, "Contenedor", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContenedor_Elementos(), this.getElementoDiagrama(), null, "elementos", null, 0, -1, Contenedor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(figuraGeometricaEClass, FiguraGeometrica.class, "FiguraGeometrica", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFiguraGeometrica_Color(), this.getColor(), "color", "gray", 0, 1, FiguraGeometrica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiguraGeometrica_Largo(), theXMLTypePackage.getInt(), "largo", "3", 0, 1, FiguraGeometrica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFiguraGeometrica_Alto(), theXMLTypePackage.getInt(), "alto", "3", 0, 1, FiguraGeometrica.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(romboEClass, Rombo.class, "Rombo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trianguloEClass, Triangulo.class, "Triangulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paqueteEClass, Paquete.class, "Paquete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagrama_IsRoot(), ecorePackage.getEBoolean(), "isRoot", "false", 0, 1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoDiagramaEClass, ElementoDiagrama.class, "ElementoDiagrama", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementoDiagrama_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoDiagrama_Label(), this.getLabel(), null, "label", null, 0, 1, ElementoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoDiagrama_Borde(), this.getBorde(), null, "borde", null, 0, 1, ElementoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementoDiagrama_Conectores(), this.getConector(), null, "conectores", null, 0, -1, ElementoDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navegacionDiagramaEClass, NavegacionDiagrama.class, "NavegacionDiagrama", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavegacionDiagrama_Diagrama(), this.getContenedor(), null, "diagrama", null, 0, 1, NavegacionDiagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_IsBold(), theXMLTypePackage.getBoolean(), "isBold", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_IsItalic(), theXMLTypePackage.getBoolean(), "isItalic", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Alineacion(), this.getAlineacion(), "alineacion", "CENTRO", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Posicion(), this.getPosicion(), "posicion", "BORDE", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Color(), this.getColor(), "color", "black", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Tamanio(), theXMLTypePackage.getInt(), "tamanio", "8", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bordeEClass, Borde.class, "Borde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conectorEClass, Conector.class, "Conector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConector_Name(), ecorePackage.getEString(), "name", null, 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_Estilo(), this.getEstiloLinea(), "estilo", null, 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_Enrutamiento(), this.getTipoEnrutamiento(), "enrutamiento", null, 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_Flecha_source(), this.getTipoFlecha(), "flecha_source", "NO_TIENE", 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_Flecha_target(), this.getTipoFlecha(), "flecha_target", "SENCILLA", 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConector_Source(), this.getElementoDiagrama(), null, "source", null, 1, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConector_Target(), this.getElementoDiagrama(), null, "target", null, 1, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_NameSource(), ecorePackage.getEString(), "nameSource", null, 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConector_NameTarget(), ecorePackage.getEString(), "nameTarget", null, 0, 1, Conector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(puntoEClass, Punto.class, "Punto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(herenciaEClass, Herencia.class, "Herencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementacionEClass, Implementacion.class, "Implementacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependenciaEClass, Dependencia.class, "Dependencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asociacionEClass, Asociacion.class, "Asociacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agregacionEClass, Agregacion.class, "Agregacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(composicionEClass, Composicion.class, "Composicion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Icono(), ecorePackage.getEString(), "icono", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dibujableEClass, Dibujable.class, "Dibujable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDibujable_Grosor(), theXMLTypePackage.getInt(), "grosor", "0", 0, 1, Dibujable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDibujable_Color(), this.getColor(), "color", "black", 0, 1, Dibujable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.CHOCOLATE);
		addEEnumLiteral(colorEEnum, Color.GRAY);
		addEEnumLiteral(colorEEnum, Color.GREEN);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.PURPLE);
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.YELLOW);

		initEEnum(alineacionEEnum, Alineacion.class, "Alineacion");
		addEEnumLiteral(alineacionEEnum, Alineacion.CENTRO);
		addEEnumLiteral(alineacionEEnum, Alineacion.IZQUIERDA);
		addEEnumLiteral(alineacionEEnum, Alineacion.DERECHA);

		initEEnum(posicionEEnum, Posicion.class, "Posicion");
		addEEnumLiteral(posicionEEnum, Posicion.BORDE);
		addEEnumLiteral(posicionEEnum, Posicion.NODO);

		initEEnum(estiloLineaEEnum, EstiloLinea.class, "EstiloLinea");
		addEEnumLiteral(estiloLineaEEnum, EstiloLinea.SOLIDA);
		addEEnumLiteral(estiloLineaEEnum, EstiloLinea.TRAZOS);
		addEEnumLiteral(estiloLineaEEnum, EstiloLinea.PUNTOS);
		addEEnumLiteral(estiloLineaEEnum, EstiloLinea.MIXTA);

		initEEnum(tipoEnrutamientoEEnum, TipoEnrutamiento.class, "TipoEnrutamiento");
		addEEnumLiteral(tipoEnrutamientoEEnum, TipoEnrutamiento.DIRECTO);
		addEEnumLiteral(tipoEnrutamientoEEnum, TipoEnrutamiento.RECTILINEO);
		addEEnumLiteral(tipoEnrutamientoEEnum, TipoEnrutamiento.ARBOL);

		initEEnum(tipoFlechaEEnum, TipoFlecha.class, "TipoFlecha");
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.NO_TIENE);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.SENCILLA);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.TRIANGULAR);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.TRIANGULAR_RELLENA);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.DIAMANTE);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.DIAMANTE_RELLENA);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.FLECHA_DIAMANTE);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.FLECHA_DIAMANTE_RELLENA);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.PATA_GALLINA);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.PATA_GALLINA_TRIANGULAR);
		addEEnumLiteral(tipoFlechaEEnum, TipoFlecha.PATA_GALLINA_RELLENA);
	}

} //VisualizacionPackageImpl
