/**
 */
package visualizacionMetricas3.representacion.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visualizacionMetricas3.Elemento;

import visualizacionMetricas3.impl.ElementoImpl;

import visualizacionMetricas3.representacion.Paquete;
import visualizacionMetricas3.representacion.RepresentacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paquete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.representacion.impl.PaqueteImpl#getHijos <em>Hijos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PaqueteImpl extends ElementoImpl implements Paquete {
	/**
	 * The cached value of the '{@link #getHijos() <em>Hijos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHijos()
	 * @generated
	 * @ordered
	 */
	protected EList<Elemento> hijos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentacionPackage.Literals.PAQUETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elemento> getHijos() {
		if (hijos == null) {
			hijos = new EObjectContainmentEList<Elemento>(Elemento.class, this, RepresentacionPackage.PAQUETE__HIJOS);
		}
		return hijos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RepresentacionPackage.PAQUETE__HIJOS:
				return ((InternalEList<?>)getHijos()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepresentacionPackage.PAQUETE__HIJOS:
				return getHijos();
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
			case RepresentacionPackage.PAQUETE__HIJOS:
				getHijos().clear();
				getHijos().addAll((Collection<? extends Elemento>)newValue);
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
			case RepresentacionPackage.PAQUETE__HIJOS:
				getHijos().clear();
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
			case RepresentacionPackage.PAQUETE__HIJOS:
				return hijos != null && !hijos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaqueteImpl
