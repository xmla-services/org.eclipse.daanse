/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Restriction List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.RestrictionList#getAny
 * <em>Any</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestrictionList()
 * @model extendedMetaData="name='RestrictionList_._type' kind='elementOnly'"
 * @generated
 */
public interface RestrictionList extends EObject {
  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute list. The list
   * contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Any</em>' attribute list.
   * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getRestrictionList_Any()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry"
   *        many="true" extendedMetaData="kind='elementWildcard' wildcards='##any'
   *        name=':0' processing='strict'"
   * @generated
   */
  FeatureMap getAny();

} // RestrictionList
