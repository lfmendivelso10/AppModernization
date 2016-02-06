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
import visualizacionMetricas3.visualizacion.Color;
import visualizacionMetricas3.visualizacion.Conector;
import visualizacionMetricas3.visualizacion.Contenedor;
import visualizacionMetricas3.visualizacion.FiguraGeometrica;
import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Figura Geometrica</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getDiagrama <em>Diagrama</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getBorde <em>Borde</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getConectores <em>Conectores</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getColor <em>Color</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getLargo <em>Largo</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.FiguraGeometricaImpl#getAlto <em>Alto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FiguraGeometricaImpl extends EObjectImpl implements FiguraGeometrica {
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
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.GRAY;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected static final int LARGO_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getLargo() <em>Largo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargo()
	 * @generated
	 * @ordered
	 */
	protected int largo = LARGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlto() <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlto()
	 * @generated
	 * @ordered
	 */
	protected static final int ALTO_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getAlto() <em>Alto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlto()
	 * @generated
	 * @ordered
	 */
	protected int alto = ALTO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiguraGeometricaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionPackage.Literals.FIGURA_GEOMETRICA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA, oldDiagrama, diagrama));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA, oldDiagrama, diagrama));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__LABEL, oldLabel, newLabel);
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
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.FIGURA_GEOMETRICA__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.FIGURA_GEOMETRICA__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__LABEL, newLabel, newLabel));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__BORDE, oldBorde, newBorde);
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
				msgs = ((InternalEObject)borde).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.FIGURA_GEOMETRICA__BORDE, null, msgs);
			if (newBorde != null)
				msgs = ((InternalEObject)newBorde).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizacionPackage.FIGURA_GEOMETRICA__BORDE, null, msgs);
			msgs = basicSetBorde(newBorde, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__BORDE, newBorde, newBorde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conector> getConectores() {
		if (conectores == null) {
			conectores = new EObjectContainmentEList<Conector>(Conector.class, this, VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES);
		}
		return conectores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLargo() {
		return largo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargo(int newLargo) {
		int oldLargo = largo;
		largo = newLargo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__LARGO, oldLargo, largo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlto(int newAlto) {
		int oldAlto = alto;
		alto = newAlto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.FIGURA_GEOMETRICA__ALTO, oldAlto, alto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizacionPackage.FIGURA_GEOMETRICA__LABEL:
				return basicSetLabel(null, msgs);
			case VisualizacionPackage.FIGURA_GEOMETRICA__BORDE:
				return basicSetBorde(null, msgs);
			case VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES:
				return ((InternalEList<?>)getConectores()).basicRemove(otherEnd, msgs);
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
			case VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA:
				if (resolve) return getDiagrama();
				return basicGetDiagrama();
			case VisualizacionPackage.FIGURA_GEOMETRICA__NAME:
				return getName();
			case VisualizacionPackage.FIGURA_GEOMETRICA__LABEL:
				return getLabel();
			case VisualizacionPackage.FIGURA_GEOMETRICA__BORDE:
				return getBorde();
			case VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES:
				return getConectores();
			case VisualizacionPackage.FIGURA_GEOMETRICA__COLOR:
				return getColor();
			case VisualizacionPackage.FIGURA_GEOMETRICA__LARGO:
				return getLargo();
			case VisualizacionPackage.FIGURA_GEOMETRICA__ALTO:
				return getAlto();
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
			case VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA:
				setDiagrama((Contenedor)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__NAME:
				setName((String)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__LABEL:
				setLabel((Label)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__BORDE:
				setBorde((Borde)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES:
				getConectores().clear();
				getConectores().addAll((Collection<? extends Conector>)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__COLOR:
				setColor((Color)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__LARGO:
				setLargo((Integer)newValue);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__ALTO:
				setAlto((Integer)newValue);
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
			case VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA:
				setDiagrama((Contenedor)null);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__LABEL:
				setLabel((Label)null);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__BORDE:
				setBorde((Borde)null);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES:
				getConectores().clear();
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__LARGO:
				setLargo(LARGO_EDEFAULT);
				return;
			case VisualizacionPackage.FIGURA_GEOMETRICA__ALTO:
				setAlto(ALTO_EDEFAULT);
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
			case VisualizacionPackage.FIGURA_GEOMETRICA__DIAGRAMA:
				return diagrama != null;
			case VisualizacionPackage.FIGURA_GEOMETRICA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizacionPackage.FIGURA_GEOMETRICA__LABEL:
				return label != null;
			case VisualizacionPackage.FIGURA_GEOMETRICA__BORDE:
				return borde != null;
			case VisualizacionPackage.FIGURA_GEOMETRICA__CONECTORES:
				return conectores != null && !conectores.isEmpty();
			case VisualizacionPackage.FIGURA_GEOMETRICA__COLOR:
				return color != COLOR_EDEFAULT;
			case VisualizacionPackage.FIGURA_GEOMETRICA__LARGO:
				return largo != LARGO_EDEFAULT;
			case VisualizacionPackage.FIGURA_GEOMETRICA__ALTO:
				return alto != ALTO_EDEFAULT;
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
		result.append(", color: ");
		result.append(color);
		result.append(", largo: ");
		result.append(largo);
		result.append(", alto: ");
		result.append(alto);
		result.append(')');
		return result.toString();
	}

} //FiguraGeometricaImpl
