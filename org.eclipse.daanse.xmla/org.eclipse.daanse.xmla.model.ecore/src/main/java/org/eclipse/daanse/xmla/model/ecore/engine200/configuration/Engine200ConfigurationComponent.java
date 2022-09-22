/*
 */
package org.eclipse.daanse.xmla.model.ecore.engine200.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.daanse.xmla.model.ecore.engine200.Engine200Package;

import org.eclipse.daanse.xmla.model.ecore.engine200.impl.Engine200PackageImpl;

import org.eclipse.emf.ecore.EPackage;

import org.gecko.emf.osgi.EMFNamespaces;
import org.gecko.emf.osgi.EPackageConfigurator;

import org.gecko.emf.osgi.annotation.EMFModel;

import org.gecko.emf.osgi.annotation.provide.ProvideEMFModel;

import org.gecko.emf.osgi.annotation.require.RequireEMF;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
@Component(name="Engine200Configurator", service= EPackageConfigurator.class)
@EMFModel(name=Engine200Package.eNAME, nsURI={Engine200Package.eNS_URI}, version="1.0.0")
@ProvideEMFModel(name = Engine200Package.eNAME, nsURI = { Engine200Package.eNS_URI }, version = "1.0.0")
public class Engine200ConfigurationComponent implements EPackageConfigurator {
	private ServiceRegistration<?> packageRegistration = null;
	
	@Activate
	public void activate(BundleContext ctx) {
		Engine200Package p = Engine200PackageImpl.init();
		if(p == null){
			p= Engine200PackageImpl.eINSTANCE;
			EPackage.Registry.INSTANCE.put(Engine200Package.eNS_URI,p);
		}
		Dictionary<String, Object> properties = new Hashtable<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, Engine200Package.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, Engine200Package.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "engine200");
		String[] serviceClasses = new String[] {Engine200Package.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, p, properties);
	}

	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(Engine200Package.eNS_URI, Engine200PackageImpl.init());
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(Engine200Package.eNS_URI);
	}
	
	@Deactivate
	public void deactivate() {
		EPackage.Registry.INSTANCE.remove(Engine200Package.eNS_URI);
		if(packageRegistration != null){
			packageRegistration.unregister();
		}
	}
}