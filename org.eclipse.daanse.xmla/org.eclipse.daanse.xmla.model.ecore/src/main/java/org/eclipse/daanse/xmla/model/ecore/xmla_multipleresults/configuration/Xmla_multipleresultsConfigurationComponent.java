/*
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.configuration;

import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.Xmla_multipleresultsPackage;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl.Xmla_multipleresultsPackageImpl;

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
@Component(name = "Xmla_multipleresultsConfigurator", service = EPackageConfigurator.class)
@EMFModel(name = Xmla_multipleresultsPackage.eNAME, nsURI = { Xmla_multipleresultsPackage.eNS_URI }, version = "1.0.0")
@ProvideEMFModel(name = Xmla_multipleresultsPackage.eNAME, nsURI = {
    Xmla_multipleresultsPackage.eNS_URI }, version = "1.0.0")
public class Xmla_multipleresultsConfigurationComponent implements EPackageConfigurator {
  private ServiceRegistration<?> packageRegistration = null;

  @Activate
  public void activate(BundleContext ctx) {
    Xmla_multipleresultsPackage p = Xmla_multipleresultsPackageImpl.init();
    if (p == null) {
      p = Xmla_multipleresultsPackageImpl.eINSTANCE;
      EPackage.Registry.INSTANCE.put(Xmla_multipleresultsPackage.eNS_URI, p);
    }
    Dictionary<String, Object> properties = new Hashtable<String, Object>();
    properties.put(EMFNamespaces.EMF_MODEL_NAME, Xmla_multipleresultsPackage.eNAME);
    properties.put(EMFNamespaces.EMF_MODEL_NSURI, Xmla_multipleresultsPackage.eNS_URI);
    properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "xmla_multipleresults");
    String[] serviceClasses = new String[] { Xmla_multipleresultsPackage.class.getName(), EPackage.class.getName() };
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
    registry.put(Xmla_multipleresultsPackage.eNS_URI, Xmla_multipleresultsPackageImpl.init());
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
    registry.remove(Xmla_multipleresultsPackage.eNS_URI);
  }

  @Deactivate
  public void deactivate() {
    EPackage.Registry.INSTANCE.remove(Xmla_multipleresultsPackage.eNS_URI);
    if (packageRegistration != null) {
      packageRegistration.unregister();
    }
  }
}
