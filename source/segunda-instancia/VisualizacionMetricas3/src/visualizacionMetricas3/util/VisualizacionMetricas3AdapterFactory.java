/**
 */
package visualizacionMetricas3.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import visualizacionMetricas3.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.VisualizacionMetricas3Package
 * @generated
 */
public class VisualizacionMetricas3AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VisualizacionMetricas3Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizacionMetricas3AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = VisualizacionMetricas3Package.eINSTANCE;
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
	protected VisualizacionMetricas3Switch<Adapter> modelSwitch =
		new VisualizacionMetricas3Switch<Adapter>() {
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseNodo(Nodo object) {
				return createNodoAdapter();
			}
			@Override
			public Adapter caseHoja(Hoja object) {
				return createHojaAdapter();
			}
			@Override
			public Adapter caseMedible(Medible object) {
				return createMedibleAdapter();
			}
			@Override
			public Adapter caseArco(Arco object) {
				return createArcoAdapter();
			}
			@Override
			public Adapter caseMetrica(Metrica object) {
				return createMetricaAdapter();
			}
			@Override
			public Adapter caseTipoRelacion(TipoRelacion object) {
				return createTipoRelacionAdapter();
			}
			@Override
			public Adapter caseVinculo(Vinculo object) {
				return createVinculoAdapter();
			}
			@Override
			public Adapter caseMetricaRelacion(MetricaRelacion object) {
				return createMetricaRelacionAdapter();
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
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Arco <em>Arco</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Arco
	 * @generated
	 */
	public Adapter createArcoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.Metrica <em>Metrica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.Metrica
	 * @generated
	 */
	public Adapter createMetricaAdapter() {
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
	 * Creates a new adapter for an object of class '{@link visualizacionMetricas3.MetricaRelacion <em>Metrica Relacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see visualizacionMetricas3.MetricaRelacion
	 * @generated
	 */
	public Adapter createMetricaRelacionAdapter() {
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

} //VisualizacionMetricas3AdapterFactory
