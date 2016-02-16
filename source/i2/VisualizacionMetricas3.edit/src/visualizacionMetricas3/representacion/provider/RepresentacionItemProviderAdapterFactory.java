/**
 */
package visualizacionMetricas3.representacion.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import visualizacionMetricas3.representacion.util.RepresentacionAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepresentacionItemProviderAdapterFactory extends RepresentacionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentacionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Cluster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterItemProvider clusterItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Cluster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClusterAdapter() {
		if (clusterItemProvider == null) {
			clusterItemProvider = new ClusterItemProvider(this);
		}

		return clusterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Paquete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaqueteItemProvider paqueteItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Paquete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPaqueteAdapter() {
		if (paqueteItemProvider == null) {
			paqueteItemProvider = new PaqueteItemProvider(this);
		}

		return paqueteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Modulo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuloItemProvider moduloItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Modulo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuloAdapter() {
		if (moduloItemProvider == null) {
			moduloItemProvider = new ModuloItemProvider(this);
		}

		return moduloItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Clase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaseItemProvider claseItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Clase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaseAdapter() {
		if (claseItemProvider == null) {
			claseItemProvider = new ClaseItemProvider(this);
		}

		return claseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Archivo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchivoItemProvider archivoItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Archivo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArchivoAdapter() {
		if (archivoItemProvider == null) {
			archivoItemProvider = new ArchivoItemProvider(this);
		}

		return archivoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Servicio} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicioItemProvider servicioItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Servicio}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createServicioAdapter() {
		if (servicioItemProvider == null) {
			servicioItemProvider = new ServicioItemProvider(this);
		}

		return servicioItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Tabla} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TablaItemProvider tablaItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Tabla}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTablaAdapter() {
		if (tablaItemProvider == null) {
			tablaItemProvider = new TablaItemProvider(this);
		}

		return tablaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Form} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormItemProvider formItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormAdapter() {
		if (formItemProvider == null) {
			formItemProvider = new FormItemProvider(this);
		}

		return formItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Aplicacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AplicacionItemProvider aplicacionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Aplicacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAplicacionAdapter() {
		if (aplicacionItemProvider == null) {
			aplicacionItemProvider = new AplicacionItemProvider(this);
		}

		return aplicacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Dependencia} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciaItemProvider dependenciaItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Dependencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependenciaAdapter() {
		if (dependenciaItemProvider == null) {
			dependenciaItemProvider = new DependenciaItemProvider(this);
		}

		return dependenciaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Asociacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsociacionItemProvider asociacionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Asociacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAsociacionAdapter() {
		if (asociacionItemProvider == null) {
			asociacionItemProvider = new AsociacionItemProvider(this);
		}

		return asociacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Composicion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposicionItemProvider composicionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Composicion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComposicionAdapter() {
		if (composicionItemProvider == null) {
			composicionItemProvider = new ComposicionItemProvider(this);
		}

		return composicionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Agregacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgregacionItemProvider agregacionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Agregacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgregacionAdapter() {
		if (agregacionItemProvider == null) {
			agregacionItemProvider = new AgregacionItemProvider(this);
		}

		return agregacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Generalizacion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizacionItemProvider generalizacionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Generalizacion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeneralizacionAdapter() {
		if (generalizacionItemProvider == null) {
			generalizacionItemProvider = new GeneralizacionItemProvider(this);
		}

		return generalizacionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Metodo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetodoItemProvider metodoItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Metodo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMetodoAdapter() {
		if (metodoItemProvider == null) {
			metodoItemProvider = new MetodoItemProvider(this);
		}

		return metodoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Atributo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtributoItemProvider atributoItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Atributo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAtributoAdapter() {
		if (atributoItemProvider == null) {
			atributoItemProvider = new AtributoItemProvider(this);
		}

		return atributoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link visualizacionMetricas3.representacion.Intercepcion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntercepcionItemProvider intercepcionItemProvider;

	/**
	 * This creates an adapter for a {@link visualizacionMetricas3.representacion.Intercepcion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntercepcionAdapter() {
		if (intercepcionItemProvider == null) {
			intercepcionItemProvider = new IntercepcionItemProvider(this);
		}

		return intercepcionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (clusterItemProvider != null) clusterItemProvider.dispose();
		if (paqueteItemProvider != null) paqueteItemProvider.dispose();
		if (moduloItemProvider != null) moduloItemProvider.dispose();
		if (claseItemProvider != null) claseItemProvider.dispose();
		if (archivoItemProvider != null) archivoItemProvider.dispose();
		if (servicioItemProvider != null) servicioItemProvider.dispose();
		if (tablaItemProvider != null) tablaItemProvider.dispose();
		if (formItemProvider != null) formItemProvider.dispose();
		if (aplicacionItemProvider != null) aplicacionItemProvider.dispose();
		if (dependenciaItemProvider != null) dependenciaItemProvider.dispose();
		if (asociacionItemProvider != null) asociacionItemProvider.dispose();
		if (composicionItemProvider != null) composicionItemProvider.dispose();
		if (agregacionItemProvider != null) agregacionItemProvider.dispose();
		if (generalizacionItemProvider != null) generalizacionItemProvider.dispose();
		if (metodoItemProvider != null) metodoItemProvider.dispose();
		if (atributoItemProvider != null) atributoItemProvider.dispose();
		if (intercepcionItemProvider != null) intercepcionItemProvider.dispose();
	}

}
