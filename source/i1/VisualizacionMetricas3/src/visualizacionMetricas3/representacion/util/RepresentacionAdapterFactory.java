/**
 */
package visualizacionMetricas3.representacion.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.Hoja;
import visualizacionMetricas3.Medible;
import visualizacionMetricas3.Nodo;
import visualizacionMetricas3.TipoRelacion;
import visualizacionMetricas3.Vinculo;

import visualizacionMetricas3.representacion.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.representacion.RepresentacionPackage
 * @generated
 */
public class RepresentacionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RepresentacionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RepresentacionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepresentacionSwitch<Adapter> modelSwitch =
		new RepresentacionSwitch<Adapter>() {
			@Override
			public Adapter caseCluster(Cluster object) {
				return createClusterAdapter();
			}
			@Override
			public Adapter casePaquete(Paquete object) {
				return createPaqueteAdapter();
			}
			@Override
			public Adapter caseModulo(Modulo object) {
				return createModuloAdapter();
			}
			@Override
			public Adapter caseClase(Clase object) {
				return createClaseAdapter();
			}
			@Override
			public Adapter caseArchivo(Archivo object) {
				return createArchivoAdapter();
			}
			@Override
			public Adapter caseServicio(Servicio object) {
				return createServicioAdapter();
			}
			@Override
			public Adapter caseTabla(Tabla object) {
				return createTablaAdapter();
			}
			@Override
			public Adapter caseForm(Form object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseAplicacion(Aplicacion object) {
				return createAplicacionAdapter();
			}
			@Override
			public Adapter caseDependencia(Dependencia object) {
				return createDependenciaAdapter();
			}
			@Override
			public Adapter caseAsociacion(Asociacion object) {
				return createAsociacionAdapter();
			}
			@Override
			public Adapter caseComposicion(Composicion object) {
				return createComposicionAdapter();
			}
			@Override
			public Adapter caseAgregacion(Agregacion object) {
				return createAgregacionAdapter();
			}
			@Override
			public Adapter caseGeneralizacion(Generalizacion object) {
				return createGeneralizacionAdapter();
			}
			@Override
			public Adapter caseMetodo(Metodo object) {
				return createMetodoAdapter();
			}
			@Override
			public Adapter caseAtributo(Atributo object) {
				return createAtributoAdapter();
			}
			@Override
			public Adapter caseIntercepcion(Intercepcion object) {
				return createIntercepcionAdapter();
			}
			@Override
			public Adapter caseMedible(Medible object) {
				return createMedibleAdapter();
			}
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseVinculo(Vinculo object) {
				return createVinculoAdapter();
			}
			@Override
			public Adapter caseNodo(Nodo object) {
				return createNodoAdapter();
			}
			@Override
			public Adapter caseTipoRelacion(TipoRelacion object) {
				return createTipoRelacionAdapter();
			}
			@Override
			public Adapter caseHoja(Hoja object) {
				return createHojaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Cluster
	 * @generated
	 */
	public Adapter createClusterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Paquete
	 * @generated
	 */
	public Adapter createPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Clase
	 * @generated
	 */
	public Adapter createClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Archivo <em>Archivo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Archivo
	 * @generated
	 */
	public Adapter createArchivoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Servicio <em>Servicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Servicio
	 * @generated
	 */
	public Adapter createServicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Tabla <em>Tabla</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Tabla
	 * @generated
	 */
	public Adapter createTablaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Form
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Aplicacion <em>Aplicacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Aplicacion
	 * @generated
	 */
	public Adapter createAplicacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Dependencia <em>Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Dependencia
	 * @generated
	 */
	public Adapter createDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Asociacion
	 * @generated
	 */
	public Adapter createAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Composicion
	 * @generated
	 */
	public Adapter createComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Agregacion
	 * @generated
	 */
	public Adapter createAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Generalizacion <em>Generalizacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Generalizacion
	 * @generated
	 */
	public Adapter createGeneralizacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Metodo <em>Metodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Metodo
	 * @generated
	 */
	public Adapter createMetodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Atributo <em>Atributo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Atributo
	 * @generated
	 */
	public Adapter createAtributoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.representacion.Intercepcion <em>Intercepcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.representacion.Intercepcion
	 * @generated
	 */
	public Adapter createIntercepcionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Medible <em>Medible</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Medible
	 * @generated
	 */
	public Adapter createMedibleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Vinculo <em>Vinculo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Vinculo
	 * @generated
	 */
	public Adapter createVinculoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Nodo
	 * @generated
	 */
	public Adapter createNodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.TipoRelacion <em>Tipo Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.TipoRelacion
	 * @generated
	 */
	public Adapter createTipoRelacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Hoja <em>Hoja</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Hoja
	 * @generated
	 */
	public Adapter createHojaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RepresentacionAdapterFactory
