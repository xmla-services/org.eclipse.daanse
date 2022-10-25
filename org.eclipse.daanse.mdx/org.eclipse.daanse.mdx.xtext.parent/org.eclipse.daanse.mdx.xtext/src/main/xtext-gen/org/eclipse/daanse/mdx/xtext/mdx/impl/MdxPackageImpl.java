/**
 * generated by Xtext 2.28.0
 */
package org.eclipse.daanse.mdx.xtext.mdx.impl;

import org.eclipse.daanse.mdx.xtext.mdx.MdxFactory;
import org.eclipse.daanse.mdx.xtext.mdx.MdxPackage;
import org.eclipse.daanse.mdx.xtext.mdx.MdxStatement;
import org.eclipse.daanse.mdx.xtext.mdx.SelectStatement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class MdxPackageImpl extends EPackageImpl implements MdxPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mdxStatementEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass selectStatementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
   * package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method
   * {@link #init init()}, which also performs initialization of the package, or
   * returns the registered package, if one already exists. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.daanse.mdx.xtext.mdx.MdxPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MdxPackageImpl() {
    super(eNS_URI, MdxFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and
   * for any others upon which it depends.
   *
   * <p>
   * This method is used to initialize {@link MdxPackage#eINSTANCE} when that
   * field is accessed. Clients should not invoke it directly. Instead, they
   * should simply access that field to obtain the package. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MdxPackage init() {
    if (isInited)
      return (MdxPackage) EPackage.Registry.INSTANCE.getEPackage(MdxPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMdxPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MdxPackageImpl theMdxPackage = registeredMdxPackage instanceof MdxPackageImpl
        ? (MdxPackageImpl) registeredMdxPackage
        : new MdxPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMdxPackage.createPackageContents();

    // Initialize created meta-data
    theMdxPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMdxPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MdxPackage.eNS_URI, theMdxPackage);
    return theMdxPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EClass getMdxStatement() {
    return mdxStatementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EReference getMdxStatement_Statement() {
    return (EReference) mdxStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public EClass getSelectStatement() {
    return selectStatementEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public MdxFactory getMdxFactory() {
    return (MdxFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package. This method is guarded to
   * have no affect on any invocation but its first. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  public void createPackageContents() {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    mdxStatementEClass = createEClass(MDX_STATEMENT);
    createEReference(mdxStatementEClass, MDX_STATEMENT__STATEMENT);

    selectStatementEClass = createEClass(SELECT_STATEMENT);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model. This method is
   * guarded to have no affect on any invocation but its first. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(mdxStatementEClass, MdxStatement.class, "MdxStatement", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMdxStatement_Statement(), this.getSelectStatement(), null, "statement", null, 0, 1,
        MdxStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectStatementEClass, SelectStatement.class, "SelectStatement", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} // MdxPackageImpl
