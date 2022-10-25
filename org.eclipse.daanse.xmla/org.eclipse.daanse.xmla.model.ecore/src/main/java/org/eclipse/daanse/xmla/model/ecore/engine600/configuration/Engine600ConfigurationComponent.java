/*
 */
package org.eclipse.daanse.xmla.model.ecore.engine600.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.daanse.xmla.model.ecore.engine600.Engine600Package;

import org.eclipse.daanse.xmla.model.ecore.engine600.impl.Engine600PackageImpl;

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
 * <!-- begin-user-doc --> The <b>EPackageConfiguration</b> and
 * <b>ResourceFactoryConfigurator</b> for the model. The package will be
 * registered into a OSGi base model registry. <!-- end-user-doc -->
 * 
 * @see EPackageConfigurator
 * @see ResourceFactoryConfigurator
 * @generated
 */
@Component(name = "Engine600Configurator", service = EPackageConfigurator.class)
@EMFModel(name = Engine600Package.eNAME, nsURI = { Engine600Package.eNS_URI }, version = "1.0.0")
@ProvideEMFModel(name = Engine600Package.eNAME, nsURI = { Engine600Package.eNS_URI }, version = "1.0.0")
public class Engine600ConfigurationComponent implements EPackageConfigurator {
  private ServiceRegistration<?> packageRegistration = null;

  @Activate
  public void activate(BundleContext ctx) {
    Engine600Package p = Engine600PackageImpl.init();
    if (p == null) {
      p = Engine600PackageImpl.eINSTANCE;
      EPackage.Registry.INSTANCE.put(Engine600Package.eNS_URI, p);
    }
    Dictionary<String, Object> properties = new Hashtable<String, Object>();
    properties.put(EMFNamespaces.EMF_MODEL_NAME, Engine600Package.eNAME);
    properties.put(EMFNamespaces.EMF_MODEL_NSURI, Engine600Package.eNS_URI);
    properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "engine600");
    String[] serviceClasses = new String[] { Engine600Package.class.getName(), EPackage.class.getName() };
    packageRegistration = ctx.registerService(serviceClasses, p, properties);
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse
   * .emf.ecore.EPackage.Registry)
   * 
   * @generated
   */
  @Override
  public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
    registry.put(Engine600Package.eNS_URI, Engine600PackageImpl.init());
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.
   * eclipse.emf.ecore.EPackage.Registry)
   * 
   * @generated
   */
  @Override
  public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
    registry.remove(Engine600Package.eNS_URI);
  }

  @Deactivate
  public void deactivate() {
    EPackage.Registry.INSTANCE.remove(Engine600Package.eNS_URI);
    if (packageRegistration != null) {
      packageRegistration.unregister();
    }
  }
}
