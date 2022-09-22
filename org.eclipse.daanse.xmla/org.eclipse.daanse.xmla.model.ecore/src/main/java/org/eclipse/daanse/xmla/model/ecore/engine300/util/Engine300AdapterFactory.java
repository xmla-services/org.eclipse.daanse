/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.util;

import org.eclipse.daanse.xmla.model.ecore.engine300.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package
 * @generated
 */
public class Engine300AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Engine300Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Engine300Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Engine300Switch<Adapter> modelSwitch =
		new Engine300Switch<Adapter>() {
			@Override
			public Adapter caseCalculationPropertiesVisualizationProperties(CalculationPropertiesVisualizationProperties object) {
				return createCalculationPropertiesVisualizationPropertiesAdapter();
			}
			@Override
			public Adapter caseDimensionAttributeVisualizationProperties(DimensionAttributeVisualizationProperties object) {
				return createDimensionAttributeVisualizationPropertiesAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseHierarchyVisualizationProperties(HierarchyVisualizationProperties object) {
				return createHierarchyVisualizationPropertiesAdapter();
			}
			@Override
			public Adapter caseRelationshipEndVisualizationProperties(RelationshipEndVisualizationProperties object) {
				return createRelationshipEndVisualizationPropertiesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties <em>Calculation Properties Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties
	 * @generated
	 */
	public Adapter createCalculationPropertiesVisualizationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties <em>Dimension Attribute Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties
	 * @generated
	 */
	public Adapter createDimensionAttributeVisualizationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties <em>Hierarchy Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties
	 * @generated
	 */
	public Adapter createHierarchyVisualizationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties <em>Relationship End Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties
	 * @generated
	 */
	public Adapter createRelationshipEndVisualizationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Engine300AdapterFactory