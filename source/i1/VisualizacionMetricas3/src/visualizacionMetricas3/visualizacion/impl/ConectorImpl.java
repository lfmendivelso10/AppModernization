/**
 */
package visualizacionMetricas3.visualizacion.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import visualizacionMetricas3.visualizacion.Color;
import visualizacionMetricas3.visualizacion.Conector;
import visualizacionMetricas3.visualizacion.Contenedor;
import visualizacionMetricas3.visualizacion.Dibujable;
import visualizacionMetricas3.visualizacion.ElementoDiagrama;
import visualizacionMetricas3.visualizacion.EstiloLinea;
import visualizacionMetricas3.visualizacion.TipoEnrutamiento;
import visualizacionMetricas3.visualizacion.TipoFlecha;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getDiagrama <em>Diagrama</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getGrosor <em>Grosor</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getEstilo <em>Estilo</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getEnrutamiento <em>Enrutamiento</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getFlecha_source <em>Flecha source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getFlecha_target <em>Flecha target</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getNameSource <em>Name Source</em>}</li>
 *   <li>{@link visualizacionMetricas3.visualizacion.impl.ConectorImpl#getNameTarget <em>Name Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConectorImpl extends EObjectImpl implements Conector {
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
	 * The default value of the '{@link #getGrosor() <em>Grosor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrosor()
	 * @generated
	 * @ordered
	 */
	protected static final int GROSOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrosor() <em>Grosor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrosor()
	 * @generated
	 * @ordered
	 */
	protected int grosor = GROSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.BLACK;

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
	 * The default value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected static final EstiloLinea ESTILO_EDEFAULT = EstiloLinea.SOLIDA;

	/**
	 * The cached value of the '{@link #getEstilo() <em>Estilo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstilo()
	 * @generated
	 * @ordered
	 */
	protected EstiloLinea estilo = ESTILO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrutamiento() <em>Enrutamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrutamiento()
	 * @generated
	 * @ordered
	 */
	protected static final TipoEnrutamiento ENRUTAMIENTO_EDEFAULT = TipoEnrutamiento.DIRECTO;

	/**
	 * The cached value of the '{@link #getEnrutamiento() <em>Enrutamiento</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrutamiento()
	 * @generated
	 * @ordered
	 */
	protected TipoEnrutamiento enrutamiento = ENRUTAMIENTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlecha_source() <em>Flecha source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlecha_source()
	 * @generated
	 * @ordered
	 */
	protected static final TipoFlecha FLECHA_SOURCE_EDEFAULT = TipoFlecha.NO_TIENE;

	/**
	 * The cached value of the '{@link #getFlecha_source() <em>Flecha source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlecha_source()
	 * @generated
	 * @ordered
	 */
	protected TipoFlecha flecha_source = FLECHA_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlecha_target() <em>Flecha target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlecha_target()
	 * @generated
	 * @ordered
	 */
	protected static final TipoFlecha FLECHA_TARGET_EDEFAULT = TipoFlecha.SENCILLA;

	/**
	 * The cached value of the '{@link #getFlecha_target() <em>Flecha target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlecha_target()
	 * @generated
	 * @ordered
	 */
	protected TipoFlecha flecha_target = FLECHA_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ElementoDiagrama source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ElementoDiagrama target;

	/**
	 * The default value of the '{@link #getNameSource() <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSource()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSource() <em>Name Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSource()
	 * @generated
	 * @ordered
	 */
	protected String nameSource = NAME_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameTarget() <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTarget() <em>Name Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTarget()
	 * @generated
	 * @ordered
	 */
	protected String nameTarget = NAME_TARGET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizacionPackage.Literals.CONECTOR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.CONECTOR__DIAGRAMA, oldDiagrama, diagrama));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__DIAGRAMA, oldDiagrama, diagrama));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrosor() {
		return grosor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrosor(int newGrosor) {
		int oldGrosor = grosor;
		grosor = newGrosor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__GROSOR, oldGrosor, grosor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EstiloLinea getEstilo() {
		return estilo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstilo(EstiloLinea newEstilo) {
		EstiloLinea oldEstilo = estilo;
		estilo = newEstilo == null ? ESTILO_EDEFAULT : newEstilo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__ESTILO, oldEstilo, estilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoEnrutamiento getEnrutamiento() {
		return enrutamiento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrutamiento(TipoEnrutamiento newEnrutamiento) {
		TipoEnrutamiento oldEnrutamiento = enrutamiento;
		enrutamiento = newEnrutamiento == null ? ENRUTAMIENTO_EDEFAULT : newEnrutamiento;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__ENRUTAMIENTO, oldEnrutamiento, enrutamiento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFlecha getFlecha_source() {
		return flecha_source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlecha_source(TipoFlecha newFlecha_source) {
		TipoFlecha oldFlecha_source = flecha_source;
		flecha_source = newFlecha_source == null ? FLECHA_SOURCE_EDEFAULT : newFlecha_source;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__FLECHA_SOURCE, oldFlecha_source, flecha_source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoFlecha getFlecha_target() {
		return flecha_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlecha_target(TipoFlecha newFlecha_target) {
		TipoFlecha oldFlecha_target = flecha_target;
		flecha_target = newFlecha_target == null ? FLECHA_TARGET_EDEFAULT : newFlecha_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__FLECHA_TARGET, oldFlecha_target, flecha_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoDiagrama getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ElementoDiagrama)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.CONECTOR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoDiagrama basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ElementoDiagrama newSource) {
		ElementoDiagrama oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoDiagrama getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ElementoDiagrama)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizacionPackage.CONECTOR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoDiagrama basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ElementoDiagrama newTarget) {
		ElementoDiagrama oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSource() {
		return nameSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSource(String newNameSource) {
		String oldNameSource = nameSource;
		nameSource = newNameSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__NAME_SOURCE, oldNameSource, nameSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTarget() {
		return nameTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTarget(String newNameTarget) {
		String oldNameTarget = nameTarget;
		nameTarget = newNameTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizacionPackage.CONECTOR__NAME_TARGET, oldNameTarget, nameTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizacionPackage.CONECTOR__DIAGRAMA:
				if (resolve) return getDiagrama();
				return basicGetDiagrama();
			case VisualizacionPackage.CONECTOR__GROSOR:
				return getGrosor();
			case VisualizacionPackage.CONECTOR__COLOR:
				return getColor();
			case VisualizacionPackage.CONECTOR__NAME:
				return getName();
			case VisualizacionPackage.CONECTOR__ESTILO:
				return getEstilo();
			case VisualizacionPackage.CONECTOR__ENRUTAMIENTO:
				return getEnrutamiento();
			case VisualizacionPackage.CONECTOR__FLECHA_SOURCE:
				return getFlecha_source();
			case VisualizacionPackage.CONECTOR__FLECHA_TARGET:
				return getFlecha_target();
			case VisualizacionPackage.CONECTOR__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case VisualizacionPackage.CONECTOR__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case VisualizacionPackage.CONECTOR__NAME_SOURCE:
				return getNameSource();
			case VisualizacionPackage.CONECTOR__NAME_TARGET:
				return getNameTarget();
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
			case VisualizacionPackage.CONECTOR__DIAGRAMA:
				setDiagrama((Contenedor)newValue);
				return;
			case VisualizacionPackage.CONECTOR__GROSOR:
				setGrosor((Integer)newValue);
				return;
			case VisualizacionPackage.CONECTOR__COLOR:
				setColor((Color)newValue);
				return;
			case VisualizacionPackage.CONECTOR__NAME:
				setName((String)newValue);
				return;
			case VisualizacionPackage.CONECTOR__ESTILO:
				setEstilo((EstiloLinea)newValue);
				return;
			case VisualizacionPackage.CONECTOR__ENRUTAMIENTO:
				setEnrutamiento((TipoEnrutamiento)newValue);
				return;
			case VisualizacionPackage.CONECTOR__FLECHA_SOURCE:
				setFlecha_source((TipoFlecha)newValue);
				return;
			case VisualizacionPackage.CONECTOR__FLECHA_TARGET:
				setFlecha_target((TipoFlecha)newValue);
				return;
			case VisualizacionPackage.CONECTOR__SOURCE:
				setSource((ElementoDiagrama)newValue);
				return;
			case VisualizacionPackage.CONECTOR__TARGET:
				setTarget((ElementoDiagrama)newValue);
				return;
			case VisualizacionPackage.CONECTOR__NAME_SOURCE:
				setNameSource((String)newValue);
				return;
			case VisualizacionPackage.CONECTOR__NAME_TARGET:
				setNameTarget((String)newValue);
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
			case VisualizacionPackage.CONECTOR__DIAGRAMA:
				setDiagrama((Contenedor)null);
				return;
			case VisualizacionPackage.CONECTOR__GROSOR:
				setGrosor(GROSOR_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__ESTILO:
				setEstilo(ESTILO_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__ENRUTAMIENTO:
				setEnrutamiento(ENRUTAMIENTO_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__FLECHA_SOURCE:
				setFlecha_source(FLECHA_SOURCE_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__FLECHA_TARGET:
				setFlecha_target(FLECHA_TARGET_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__SOURCE:
				setSource((ElementoDiagrama)null);
				return;
			case VisualizacionPackage.CONECTOR__TARGET:
				setTarget((ElementoDiagrama)null);
				return;
			case VisualizacionPackage.CONECTOR__NAME_SOURCE:
				setNameSource(NAME_SOURCE_EDEFAULT);
				return;
			case VisualizacionPackage.CONECTOR__NAME_TARGET:
				setNameTarget(NAME_TARGET_EDEFAULT);
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
			case VisualizacionPackage.CONECTOR__DIAGRAMA:
				return diagrama != null;
			case VisualizacionPackage.CONECTOR__GROSOR:
				return grosor != GROSOR_EDEFAULT;
			case VisualizacionPackage.CONECTOR__COLOR:
				return color != COLOR_EDEFAULT;
			case VisualizacionPackage.CONECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizacionPackage.CONECTOR__ESTILO:
				return estilo != ESTILO_EDEFAULT;
			case VisualizacionPackage.CONECTOR__ENRUTAMIENTO:
				return enrutamiento != ENRUTAMIENTO_EDEFAULT;
			case VisualizacionPackage.CONECTOR__FLECHA_SOURCE:
				return flecha_source != FLECHA_SOURCE_EDEFAULT;
			case VisualizacionPackage.CONECTOR__FLECHA_TARGET:
				return flecha_target != FLECHA_TARGET_EDEFAULT;
			case VisualizacionPackage.CONECTOR__SOURCE:
				return source != null;
			case VisualizacionPackage.CONECTOR__TARGET:
				return target != null;
			case VisualizacionPackage.CONECTOR__NAME_SOURCE:
				return NAME_SOURCE_EDEFAULT == null ? nameSource != null : !NAME_SOURCE_EDEFAULT.equals(nameSource);
			case VisualizacionPackage.CONECTOR__NAME_TARGET:
				return NAME_TARGET_EDEFAULT == null ? nameTarget != null : !NAME_TARGET_EDEFAULT.equals(nameTarget);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Dibujable.class) {
			switch (derivedFeatureID) {
				case VisualizacionPackage.CONECTOR__GROSOR: return VisualizacionPackage.DIBUJABLE__GROSOR;
				case VisualizacionPackage.CONECTOR__COLOR: return VisualizacionPackage.DIBUJABLE__COLOR;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Dibujable.class) {
			switch (baseFeatureID) {
				case VisualizacionPackage.DIBUJABLE__GROSOR: return VisualizacionPackage.CONECTOR__GROSOR;
				case VisualizacionPackage.DIBUJABLE__COLOR: return VisualizacionPackage.CONECTOR__COLOR;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (grosor: ");
		result.append(grosor);
		result.append(", color: ");
		result.append(color);
		result.append(", name: ");
		result.append(name);
		result.append(", estilo: ");
		result.append(estilo);
		result.append(", enrutamiento: ");
		result.append(enrutamiento);
		result.append(", flecha_source: ");
		result.append(flecha_source);
		result.append(", flecha_target: ");
		result.append(flecha_target);
		result.append(", nameSource: ");
		result.append(nameSource);
		result.append(", nameTarget: ");
		result.append(nameTarget);
		result.append(')');
		return result.toString();
	}

} //ConectorImpl
