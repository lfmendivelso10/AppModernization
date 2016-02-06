/**
 */
package visualizacionMetricas3.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visualizacionMetricas3.Elemento;
import visualizacionMetricas3.MetricaRelacion;
import visualizacionMetricas3.VisualizacionMetricas3Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metrica Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.impl.MetricaRelacionImpl#getRelacion <em>Relacion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetricaRelacionImpl extends MetricaImpl implements MetricaRelacion {
	/**
	 * The cached value of the '{@link #getRelacion() <em>Relacion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelacion()
	 * @generated
	 * @ordered
	 */
	protected Elemento relacion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricaRelacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionMetricas3Package.Literals.METRICA_RELACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento getRelacion() {
		if (relacion != null && relacion.eIsProxy()) {
			InternalEObject oldRelacion = (InternalEObject)relacion;
			relacion = (Elemento)eResolveProxy(oldRelacion);
			if (relacion != oldRelacion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionMetricas3Package.METRICA_RELACION__RELACION, oldRelacion, relacion));
			}
		}
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elemento basicGetRelacion() {
		return relacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelacion(Elemento newRelacion) {
		Elemento oldRelacion = relacion;
		relacion = newRelacion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionMetricas3Package.METRICA_RELACION__RELACION, oldRelacion, relacion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizacionMetricas3Package.METRICA_RELACION__RELACION:
				if (resolve) return getRelacion();
				return basicGetRelacion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizacionMetricas3Package.METRICA_RELACION__RELACION:
				setRelacion((Elemento)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualizacionMetricas3Package.METRICA_RELACION__RELACION:
				setRelacion((Elemento)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualizacionMetricas3Package.METRICA_RELACION__RELACION:
				return relacion != null;
		}
		return super.eIsSet(featureID);
	}

} //MetricaRelacionImpl
