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
import visualizacionMetricas3.visualizacion.Conector;
import visualizacionMetricas3.visualizacion.Contenedor;
import visualizacionMetricas3.visualizacion.Diagrama;
import visualizacionMetricas3.visualizacion.ElementoDiagrama;
import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getDiagrama <em>Diagrama</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getBorde <em>Borde</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getConectores <em>Conectores</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#getElementos <em>Elementos</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.DiagramaImpl#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramaImpl extends EObjectImpl implements Diagrama {
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
	 * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean isRoot = IS_ROOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionPackage.Literals.DIAGRAMA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.DIAGRAMA__DIAGRAMA, oldDiagrama, diagrama));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__DIAGRAMA, oldDiagrama, diagrama));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.DIAGRAMA__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.DIAGRAMA__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__BORDE, oldBorde, newBorde);
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
				msgs = ((InternalEObject)borde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.DIAGRAMA__BORDE, null, msgs);
			if (newBorde != null)
				msgs = ((InternalEObject)newBorde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.DIAGRAMA__BORDE, null, msgs);
			msgs = basicSetBorde(newBorde, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__BORDE, newBorde, newBorde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conector> getConectores() {
		if (conectores == null) {
			conectores = new EObjectContainmentEList<Conector>(Conector.class, this, VisualizacionPackage.DIAGRAMA__CONECTORES);
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
			elementos = new EObjectContainmentEList<ElementoDiagrama>(ElementoDiagrama.class, this, VisualizacionPackage.DIAGRAMA__ELEMENTOS);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRoot() {
		return isRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRoot(boolean newIsRoot) {
		boolean oldIsRoot = isRoot;
		isRoot = newIsRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.DIAGRAMA__IS_ROOT, oldIsRoot, isRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizacionPackage.DIAGRAMA__LABEL:
				return basicSetLabel(null, msgs);
			case VisualizacionPackage.DIAGRAMA__BORDE:
				return basicSetBorde(null, msgs);
			case VisualizacionPackage.DIAGRAMA__CONECTORES:
				return ((InternalEList<?>)getConectores()).basicRemove(otherEnd, msgs);
			case VisualizacionPackage.DIAGRAMA__ELEMENTOS:
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
			case VisualizacionPackage.DIAGRAMA__DIAGRAMA:
				if (resolve) return getDiagrama();
				return basicGetDiagrama();
			case VisualizacionPackage.DIAGRAMA__NAME:
				return getName();
			case VisualizacionPackage.DIAGRAMA__LABEL:
				return getLabel();
			case VisualizacionPackage.DIAGRAMA__BORDE:
				return getBorde();
			case VisualizacionPackage.DIAGRAMA__CONECTORES:
				return getConectores();
			case VisualizacionPackage.DIAGRAMA__ELEMENTOS:
				return getElementos();
			case VisualizacionPackage.DIAGRAMA__IS_ROOT:
				return isIsRoot();
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
			case VisualizacionPackage.DIAGRAMA__DIAGRAMA:
				setDiagrama((Contenedor)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__NAME:
				setName((String)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__LABEL:
				setLabel((Label)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__BORDE:
				setBorde((Borde)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__CONECTORES:
				getConectores().clear();
				getConectores().addAll((Collection<? extends Conector>)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__ELEMENTOS:
				getElementos().clear();
				getElementos().addAll((Collection<? extends ElementoDiagrama>)newValue);
				return;
			case VisualizacionPackage.DIAGRAMA__IS_ROOT:
				setIsRoot((Boolean)newValue);
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
			case VisualizacionPackage.DIAGRAMA__DIAGRAMA:
				setDiagrama((Contenedor)null);
				return;
			case VisualizacionPackage.DIAGRAMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizacionPackage.DIAGRAMA__LABEL:
				setLabel((Label)null);
				return;
			case VisualizacionPackage.DIAGRAMA__BORDE:
				setBorde((Borde)null);
				return;
			case VisualizacionPackage.DIAGRAMA__CONECTORES:
				getConectores().clear();
				return;
			case VisualizacionPackage.DIAGRAMA__ELEMENTOS:
				getElementos().clear();
				return;
			case VisualizacionPackage.DIAGRAMA__IS_ROOT:
				setIsRoot(IS_ROOT_EDEFAULT);
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
			case VisualizacionPackage.DIAGRAMA__DIAGRAMA:
				return diagrama != null;
			case VisualizacionPackage.DIAGRAMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizacionPackage.DIAGRAMA__LABEL:
				return label != null;
			case VisualizacionPackage.DIAGRAMA__BORDE:
				return borde != null;
			case VisualizacionPackage.DIAGRAMA__CONECTORES:
				return conectores != null && !conectores.isEmpty();
			case VisualizacionPackage.DIAGRAMA__ELEMENTOS:
				return elementos != null && !elementos.isEmpty();
			case VisualizacionPackage.DIAGRAMA__IS_ROOT:
				return isRoot != IS_ROOT_EDEFAULT;
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
		result.append(", isRoot: ");
		result.append(isRoot);
		result.append(')');
		return result.toString();
	}

} //DiagramaImpl
