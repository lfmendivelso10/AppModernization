/**
 */
package subkdm.kdmObjects.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subkdm.kdmObjects.KdmObjectsPackage;
import subkdm.kdmObjects.ParameterUnit;
import subkdm.kdmObjects.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.impl.SignatureImpl#getParameterUnit <em>Parameter Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignatureImpl extends DataTypeImpl implements Signature {
	/**
	 * The cached value of the '{@link #getParameterUnit() <em>Parameter Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterUnit> parameterUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmObjectsPackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterUnit> getParameterUnit() {
		if (parameterUnit == null) {
			parameterUnit = new EObjectContainmentEList<ParameterUnit>(ParameterUnit.class, this, KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT);
		}
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT:
				return ((InternalEList<?>)getParameterUnit()).basicRemove(otherEnd, msgs);
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
			case KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT:
				return getParameterUnit();
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
			case KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT:
				getParameterUnit().clear();
				getParameterUnit().addAll((Collection<? extends ParameterUnit>)newValue);
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
			case KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT:
				getParameterUnit().clear();
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
			case KdmObjectsPackage.SIGNATURE__PARAMETER_UNIT:
				return parameterUnit != null && !parameterUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
