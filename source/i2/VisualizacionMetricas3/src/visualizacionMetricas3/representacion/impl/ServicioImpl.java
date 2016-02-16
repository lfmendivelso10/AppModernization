/**
 */
package visualizacionMetricas3.representacion.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import visualizacionMetricas3.Elemento;

import visualizacionMetricas3.impl.ElementoImpl;

import visualizacionMetricas3.representacion.RepresentacionPackage;
import visualizacionMetricas3.representacion.Servicio;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.representacion.impl.ServicioImpl#getElementos <em>Elementos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServicioImpl extends ElementoImpl implements Servicio {
	/**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> elementos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentacionPackage.Literals.SERVICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elemento> getElementos() {
		if (elementos == null) {
			elementos = new EObjectResolvingEList<Elemento>(Elemento.class, this, RepresentacionPackage.SERVICIO__ELEMENTOS);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepresentacionPackage.SERVICIO__ELEMENTOS:
				return getElementos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RepresentacionPackage.SERVICIO__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends Elemento>)newValue);
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
			case RepresentacionPackage.SERVICIO__ELEMENTOS:
				getElementos().clear();
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
			case RepresentacionPackage.SERVICIO__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServicioImpl
