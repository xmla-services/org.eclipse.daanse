/*
 */
package org.eclipse.daanse.xmla.model.ecore.engine100_100.util;

import java.util.Map;

import org.eclipse.daanse.xmla.model.ecore.engine100_100.Engine100_100Package;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
@Component( name = Engine100_100Package.eNAME + "XMLProcessor", service = Engine100_100XMLProcessor.class, scope = ServiceScope.SINGLETON)
public class Engine100_100XMLProcessor extends XMLProcessor {

	@Reference
	private Engine100_100ResourceFactoryImpl resourceFactory; 


	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Activate
	public Engine100_100XMLProcessor(
		@Reference(name = "EPackageRegistry", target = "(component.name=DefaultEPackageRegistry)") EPackage.Registry registry
		) {
		super(registry);
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Engine100_100ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, resourceFactory);
			registrations.put(STAR_EXTENSION, resourceFactory);
		}
		return registrations;
	}

} //Engine100_100XMLProcessor