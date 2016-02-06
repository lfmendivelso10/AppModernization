/**
 */
package subkdm.SimplifiedDecisionMetrics.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import subkdm.SimplifiedDecisionMetrics.Measurement;
import subkdm.SimplifiedDecisionMetrics.Observation;
import subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl#getWhenObserved <em>When Observed</em>}</li>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.impl.ObservationImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObservationImpl extends MinimalEObjectImpl.Container implements Observation {
	/**
	 * The default value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_OBSERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhenObserved() <em>When Observed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenObserved()
	 * @generated
	 * @ordered
	 */
	protected Date whenObserved = WHEN_OBSERVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplifiedDecisionMetricsPackage.Literals.OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhenObserved() {
		return whenObserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenObserved(Date newWhenObserved) {
		Date oldWhenObserved = whenObserved;
		whenObserved = newWhenObserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplifiedDecisionMetricsPackage.OBSERVATION__WHEN_OBSERVED, oldWhenObserved, whenObserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectContainmentEList<Measurement>(Measurement.class, this, SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS);
		}
		return measurements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
			case SimplifiedDecisionMetricsPackage.OBSERVATION__WHEN_OBSERVED:
				return getWhenObserved();
			case SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS:
				return getMeasurements();
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
			case SimplifiedDecisionMetricsPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved((Date)newValue);
				return;
			case SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
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
			case SimplifiedDecisionMetricsPackage.OBSERVATION__WHEN_OBSERVED:
				setWhenObserved(WHEN_OBSERVED_EDEFAULT);
				return;
			case SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS:
				getMeasurements().clear();
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
			case SimplifiedDecisionMetricsPackage.OBSERVATION__WHEN_OBSERVED:
				return WHEN_OBSERVED_EDEFAULT == null ? whenObserved != null : !WHEN_OBSERVED_EDEFAULT.equals(whenObserved);
			case SimplifiedDecisionMetricsPackage.OBSERVATION__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (whenObserved: ");
		result.append(whenObserved);
		result.append(')');
		return result.toString();
	}

} //ObservationImpl
