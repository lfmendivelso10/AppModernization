/**
 */
package visualizacionMetricas3.visualizacion.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visualizacionMetricas3.visualizacion.Borde;
import visualizacionMetricas3.visualizacion.Clase;
import visualizacionMetricas3.visualizacion.Conector;
import visualizacionMetricas3.visualizacion.Contenedor;
import visualizacionMetricas3.visualizacion.ElementoDiagrama;
import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getDiagrama <em>Diagrama</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getBorde <em>Borde</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getConectores <em>Conectores</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ClaseImpl#getElementos <em>Elementos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaseImpl extends EObjectImpl implements Clase {
	/**
	 * The cached value of the '{@link #getDiagrama() <em>Diagrama</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagrama()
	 * @generated
	 * @ordered
	 */
	protected Contenedor diagrama;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected Label label;

	/**
	 * The cached value of the '{@link #getBorde() <em>Borde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorde()
	 * @generated
	 * @ordered
	 */
	protected Borde borde;

	/**
	 * The cached value of the '{@link #getConectores() <em>Conectores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConectores()
	 * @generated
	 * @ordered
	 */
	protected EList<Conector> conectores;

	/**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementoDiagrama> elementos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionPackage.Literals.CLASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenedor getDiagrama() {
		if (diagrama != null && diagrama.eIsProxy()) {
			InternalEObject oldDiagrama = (InternalEObject)diagrama;
			diagrama = (Contenedor)eResolveProxy(oldDiagrama);
			if (diagrama != oldDiagrama) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.CLASE__DIAGRAMA, oldDiagrama, diagrama));
			}
		}
		return diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contenedor basicGetDiagrama() {
		return diagrama;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagrama(Contenedor newDiagrama) {
		Contenedor oldDiagrama = diagrama;
		diagrama = newDiagrama;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__DIAGRAMA, oldDiagrama, diagrama));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		Label oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.CLASE__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.CLASE__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Borde getBorde() {
		return borde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorde(Borde newBorde, NotificationChain msgs) {
		Borde oldBorde = borde;
		borde = newBorde;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__BORDE, oldBorde, newBorde);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorde(Borde newBorde) {
		if (newBorde != borde) {
			NotificationChain msgs = null;
			if (borde != null)
				msgs = ((InternalEObject)borde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.CLASE__BORDE, null, msgs);
			if (newBorde != null)
				msgs = ((InternalEObject)newBorde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.CLASE__BORDE, null, msgs);
			msgs = basicSetBorde(newBorde, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CLASE__BORDE, newBorde, newBorde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conector> getConectores() {
		if (conectores == null) {
			conectores = new EObjectContainmentEList<Conector>(Conector.class, this, VisualizacionPackage.CLASE__CONECTORES);
		}
		return conectores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementoDiagrama> getElementos() {
		if (elementos == null) {
			elementos = new EObjectContainmentEList<ElementoDiagrama>(ElementoDiagrama.class, this, VisualizacionPackage.CLASE__ELEMENTOS);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizacionPackage.CLASE__LABEL:
				return basicSetLabel(null, msgs);
			case VisualizacionPackage.CLASE__BORDE:
				return basicSetBorde(null, msgs);
			case VisualizacionPackage.CLASE__CONECTORES:
				return ((InternalEList<?>)getConectores()).basicRemove(otherEnd, msgs);
			case VisualizacionPackage.CLASE__ELEMENTOS:
				return ((InternalEList<?>)getElementos()).basicRemove(otherEnd, msgs);
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
			case VisualizacionPackage.CLASE__DIAGRAMA:
				if (resolve) return getDiagrama();
				return basicGetDiagrama();
			case VisualizacionPackage.CLASE__NAME:
				return getName();
			case VisualizacionPackage.CLASE__LABEL:
				return getLabel();
			case VisualizacionPackage.CLASE__BORDE:
				return getBorde();
			case VisualizacionPackage.CLASE__CONECTORES:
				return getConectores();
			case VisualizacionPackage.CLASE__ELEMENTOS:
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
			case VisualizacionPackage.CLASE__DIAGRAMA:
				setDiagrama((Contenedor)newValue);
				return;
			case VisualizacionPackage.CLASE__NAME:
				setName((String)newValue);
				return;
			case VisualizacionPackage.CLASE__LABEL:
				setLabel((Label)newValue);
				return;
			case VisualizacionPackage.CLASE__BORDE:
				setBorde((Borde)newValue);
				return;
			case VisualizacionPackage.CLASE__CONECTORES:
				getConectores().clear();
				getConectores().addAll((Collection<? extends Conector>)newValue);
				return;
			case VisualizacionPackage.CLASE__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends ElementoDiagrama>)newValue);
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
			case VisualizacionPackage.CLASE__DIAGRAMA:
				setDiagrama((Contenedor)null);
				return;
			case VisualizacionPackage.CLASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizacionPackage.CLASE__LABEL:
				setLabel((Label)null);
				return;
			case VisualizacionPackage.CLASE__BORDE:
				setBorde((Borde)null);
				return;
			case VisualizacionPackage.CLASE__CONECTORES:
				getConectores().clear();
				return;
			case VisualizacionPackage.CLASE__ELEMENTOS:
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
			case VisualizacionPackage.CLASE__DIAGRAMA:
				return diagrama != null;
			case VisualizacionPackage.CLASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizacionPackage.CLASE__LABEL:
				return label != null;
			case VisualizacionPackage.CLASE__BORDE:
				return borde != null;
			case VisualizacionPackage.CLASE__CONECTORES:
				return conectores != null && !conectores.isEmpty();
			case VisualizacionPackage.CLASE__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClaseImpl
