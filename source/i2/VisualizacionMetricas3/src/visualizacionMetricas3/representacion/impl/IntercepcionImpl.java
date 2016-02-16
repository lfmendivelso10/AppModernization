/**
 */
package visualizacionMetricas3.representacion.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import visualizacionMetricas3.Arco;
import visualizacionMetricas3.Elemento;

import visualizacionMetricas3.impl.ElementoImpl;

import visualizacionMetricas3.representacion.Intercepcion;
import visualizacionMetricas3.representacion.RepresentacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercepcion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.representacion.impl.IntercepcionImpl#getElementos <em>Elementos</em>}</li>
 *   <li>{@link visualizacionMetricas3.representacion.impl.IntercepcionImpl#getArco <em>Arco</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntercepcionImpl extends ElementoImpl implements Intercepcion {
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
	 * The cached value of the '{@link #getArco() <em>Arco</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArco()
	 * @generated
	 * @ordered
	 */
	protected Arco arco;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercepcionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RepresentacionPackage.Literals.INTERCEPCION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Elemento> getElementos() {
		if (elementos == null) {
			elementos = new EObjectResolvingEList<Elemento>(Elemento.class, this, RepresentacionPackage.INTERCEPCION__ELEMENTOS);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arco getArco() {
		if (arco != null && arco.eIsProxy()) {
			InternalEObject oldArco = (InternalEObject)arco;
			arco = (Arco)eResolveProxy(oldArco);
			if (arco != oldArco) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RepresentacionPackage.INTERCEPCION__ARCO, oldArco, arco));
			}
		}
		return arco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arco basicGetArco() {
		return arco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArco(Arco newArco) {
		Arco oldArco = arco;
		arco = newArco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RepresentacionPackage.INTERCEPCION__ARCO, oldArco, arco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RepresentacionPackage.INTERCEPCION__ELEMENTOS:
				return getElementos();
			case RepresentacionPackage.INTERCEPCION__ARCO:
				if (resolve) return getArco();
				return basicGetArco();
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
			case RepresentacionPackage.INTERCEPCION__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends Elemento>)newValue);
				return;
			case RepresentacionPackage.INTERCEPCION__ARCO:
				setArco((Arco)newValue);
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
			case RepresentacionPackage.INTERCEPCION__ELEMENTOS:
				getElementos().clear();
				return;
			case RepresentacionPackage.INTERCEPCION__ARCO:
				setArco((Arco)null);
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
			case RepresentacionPackage.INTERCEPCION__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
			case RepresentacionPackage.INTERCEPCION__ARCO:
				return arco != null;
		}
		return super.eIsSet(featureID);
	}

} //IntercepcionImpl
