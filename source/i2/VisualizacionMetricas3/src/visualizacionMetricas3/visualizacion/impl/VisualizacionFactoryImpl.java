/**
 */
package visualizacionMetricas3.visualizacion.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visualizacionMetricas3.visualizacion.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizacionFactoryImpl extends EFactoryImpl implements VisualizacionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizacionFactory init() {
		try {
			VisualizacionFactory theVisualizacionFactory = (VisualizacionFactory)EPackage.Registry.INSTANCE.getEFactory(VisualizacionPackage.eNS_URI);
			if (theVisualizacionFactory != null) {
				return theVisualizacionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizacionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionFactoryImpl() {
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
			case VisualizacionPackage.ELIPSE: return createElipse();
			case VisualizacionPackage.CUADRILATERO: return createCuadrilatero();
			case VisualizacionPackage.CLASE: return createClase();
			case VisualizacionPackage.ROMBO: return createRombo();
			case VisualizacionPackage.TRIANGULO: return createTriangulo();
			case VisualizacionPackage.PAQUETE: return createPaquete();
			case VisualizacionPackage.DIAGRAMA: return createDiagrama();
			case VisualizacionPackage.LABEL: return createLabel();
			case VisualizacionPackage.BORDE: return createBorde();
			case VisualizacionPackage.PUNTO: return createPunto();
			case VisualizacionPackage.HERENCIA: return createHerencia();
			case VisualizacionPackage.IMPLEMENTACION: return createImplementacion();
			case VisualizacionPackage.DEPENDENCIA: return createDependencia();
			case VisualizacionPackage.ASOCIACION: return createAsociacion();
			case VisualizacionPackage.AGREGACION: return createAgregacion();
			case VisualizacionPackage.COMPOSICION: return createComposicion();
			case VisualizacionPackage.ITEM: return createItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizacionPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case VisualizacionPackage.ALINEACION:
				return createAlineacionFromString(eDataType, initialValue);
			case VisualizacionPackage.POSICION:
				return createPosicionFromString(eDataType, initialValue);
			case VisualizacionPackage.ESTILO_LINEA:
				return createEstiloLineaFromString(eDataType, initialValue);
			case VisualizacionPackage.TIPO_ENRUTAMIENTO:
				return createTipoEnrutamientoFromString(eDataType, initialValue);
			case VisualizacionPackage.TIPO_FLECHA:
				return createTipoFlechaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizacionPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case VisualizacionPackage.ALINEACION:
				return convertAlineacionToString(eDataType, instanceValue);
			case VisualizacionPackage.POSICION:
				return convertPosicionToString(eDataType, instanceValue);
			case VisualizacionPackage.ESTILO_LINEA:
				return convertEstiloLineaToString(eDataType, instanceValue);
			case VisualizacionPackage.TIPO_ENRUTAMIENTO:
				return convertTipoEnrutamientoToString(eDataType, instanceValue);
			case VisualizacionPackage.TIPO_FLECHA:
				return convertTipoFlechaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elipse createElipse() {
		ElipseImpl elipse = new ElipseImpl();
		return elipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cuadrilatero createCuadrilatero() {
		CuadrilateroImpl cuadrilatero = new CuadrilateroImpl();
		return cuadrilatero;
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
	public Rombo createRombo() {
		RomboImpl rombo = new RomboImpl();
		return rombo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Triangulo createTriangulo() {
		TrianguloImpl triangulo = new TrianguloImpl();
		return triangulo;
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
	public Diagrama createDiagrama() {
		DiagramaImpl diagrama = new DiagramaImpl();
		return diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Borde createBorde() {
		BordeImpl borde = new BordeImpl();
		return borde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Punto createPunto() {
		PuntoImpl punto = new PuntoImpl();
		return punto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Herencia createHerencia() {
		HerenciaImpl herencia = new HerenciaImpl();
		return herencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implementacion createImplementacion() {
		ImplementacionImpl implementacion = new ImplementacionImpl();
		return implementacion;
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
	public Agregacion createAgregacion() {
		AgregacionImpl agregacion = new AgregacionImpl();
		return agregacion;
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
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alineacion createAlineacionFromString(EDataType eDataType, String initialValue) {
		Alineacion result = Alineacion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlineacionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Posicion createPosicionFromString(EDataType eDataType, String initialValue) {
		Posicion result = Posicion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosicionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloLinea createEstiloLineaFromString(EDataType eDataType, String initialValue) {
		EstiloLinea result = EstiloLinea.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEstiloLineaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoEnrutamiento createTipoEnrutamientoFromString(EDataType eDataType, String initialValue) {
		TipoEnrutamiento result = TipoEnrutamiento.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoEnrutamientoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFlecha createTipoFlechaFromString(EDataType eDataType, String initialValue) {
		TipoFlecha result = TipoFlecha.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoFlechaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionPackage getVisualizacionPackage() {
		return (VisualizacionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizacionPackage getPackage() {
		return VisualizacionPackage.eINSTANCE;
	}

} //VisualizacionFactoryImpl
