/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

import subkdm.kdmObjects.AbstractCodeElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimensional To Object Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.DimensionalToObjectMeasurementImpl#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionalToObjectMeasurementImpl extends DimensionalMeasurementImpl implements DimensionalToObjectMeasurement {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected AbstractCodeElement object;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionalToObjectMeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedDecisionMetricsPackage.Literals.DIMENSIONAL_TO_OBJECT_MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeElement getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (AbstractCodeElement)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeElement basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(AbstractCodeElement newObject) {
		AbstractCodeElement oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
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
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT:
				setObject((AbstractCodeElement)newValue);
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
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT:
				setObject((AbstractCodeElement)null);
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
			case SimplifiedDecisionMetricsPackage.DIMENSIONAL_TO_OBJECT_MEASUREMENT__OBJECT:
				return object != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionalToObjectMeasurementImpl
