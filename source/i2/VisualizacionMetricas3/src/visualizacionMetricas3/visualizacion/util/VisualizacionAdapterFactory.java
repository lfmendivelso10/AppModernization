/**
 */
package visualizacionMetricas3.visualizacion.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import visualizacionMetricas3.visualizacion.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage
 * @generated
 */
public class VisualizacionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizacionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisualizacionPackage.eINSTANCE;
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
	protected VisualizacionSwitch<Adapter> modelSwitch =
		new VisualizacionSwitch<Adapter>() {
			@Override
			public Adapter caseElipse(Elipse object) {
				return createElipseAdapter();
			}
			@Override
			public Adapter caseCuadrilatero(Cuadrilatero object) {
				return createCuadrilateroAdapter();
			}
			@Override
			public Adapter caseContenedor(Contenedor object) {
				return createContenedorAdapter();
			}
			@Override
			public Adapter caseClase(Clase object) {
				return createClaseAdapter();
			}
			@Override
			public Adapter caseFiguraGeometrica(FiguraGeometrica object) {
				return createFiguraGeometricaAdapter();
			}
			@Override
			public Adapter caseRombo(Rombo object) {
				return createRomboAdapter();
			}
			@Override
			public Adapter caseTriangulo(Triangulo object) {
				return createTrianguloAdapter();
			}
			@Override
			public Adapter casePaquete(Paquete object) {
				return createPaqueteAdapter();
			}
			@Override
			public Adapter caseDiagrama(Diagrama object) {
				return createDiagramaAdapter();
			}
			@Override
			public Adapter caseElementoDiagrama(ElementoDiagrama object) {
				return createElementoDiagramaAdapter();
			}
			@Override
			public Adapter caseNavegacionDiagrama(NavegacionDiagrama object) {
				return createNavegacionDiagramaAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseBorde(Borde object) {
				return createBordeAdapter();
			}
			@Override
			public Adapter caseConector(Conector object) {
				return createConectorAdapter();
			}
			@Override
			public Adapter casePunto(Punto object) {
				return createPuntoAdapter();
			}
			@Override
			public Adapter caseHerencia(Herencia object) {
				return createHerenciaAdapter();
			}
			@Override
			public Adapter caseImplementacion(Implementacion object) {
				return createImplementacionAdapter();
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
			public Adapter caseAgregacion(Agregacion object) {
				return createAgregacionAdapter();
			}
			@Override
			public Adapter caseComposicion(Composicion object) {
				return createComposicionAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseDibujable(Dibujable object) {
				return createDibujableAdapter();
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
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Elipse <em>Elipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Elipse
	 * @generated
	 */
	public Adapter createElipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Cuadrilatero <em>Cuadrilatero</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Cuadrilatero
	 * @generated
	 */
	public Adapter createCuadrilateroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Contenedor <em>Contenedor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Contenedor
	 * @generated
	 */
	public Adapter createContenedorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Clase <em>Clase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Clase
	 * @generated
	 */
	public Adapter createClaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.FiguraGeometrica <em>Figura Geometrica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.FiguraGeometrica
	 * @generated
	 */
	public Adapter createFiguraGeometricaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Rombo <em>Rombo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Rombo
	 * @generated
	 */
	public Adapter createRomboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Triangulo <em>Triangulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Triangulo
	 * @generated
	 */
	public Adapter createTrianguloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Paquete <em>Paquete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Paquete
	 * @generated
	 */
	public Adapter createPaqueteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Diagrama <em>Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Diagrama
	 * @generated
	 */
	public Adapter createDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.ElementoDiagrama <em>Elemento Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.ElementoDiagrama
	 * @generated
	 */
	public Adapter createElementoDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.NavegacionDiagrama <em>Navegacion Diagrama</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.NavegacionDiagrama
	 * @generated
	 */
	public Adapter createNavegacionDiagramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Borde <em>Borde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Borde
	 * @generated
	 */
	public Adapter createBordeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Conector <em>Conector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Conector
	 * @generated
	 */
	public Adapter createConectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Punto <em>Punto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Punto
	 * @generated
	 */
	public Adapter createPuntoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Herencia <em>Herencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Herencia
	 * @generated
	 */
	public Adapter createHerenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Implementacion <em>Implementacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Implementacion
	 * @generated
	 */
	public Adapter createImplementacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Dependencia <em>Dependencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Dependencia
	 * @generated
	 */
	public Adapter createDependenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Asociacion <em>Asociacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Asociacion
	 * @generated
	 */
	public Adapter createAsociacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Agregacion <em>Agregacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Agregacion
	 * @generated
	 */
	public Adapter createAgregacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Composicion <em>Composicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Composicion
	 * @generated
	 */
	public Adapter createComposicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.visualizacion.Dibujable <em>Dibujable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.visualizacion.Dibujable
	 * @generated
	 */
	public Adapter createDibujableAdapter() {
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

} //VisualizacionAdapterFactory
