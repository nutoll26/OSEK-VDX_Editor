/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impl Attr Enum Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef()
 * @model
 * @generated
 */
public interface ImplAttrEnumDef extends ImplAttrDef
{
  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' containment reference.
   * @see #setEnumeration(Enumeration)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Enumeration()
   * @model containment="true"
   * @generated
   */
  Enumeration getEnumeration();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getEnumeration <em>Enumeration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' containment reference.
   * @see #getEnumeration()
   * @generated
   */
  void setEnumeration(Enumeration value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(AttributeName)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Name()
   * @model containment="true"
   * @generated
   */
  AttributeName getName();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(AttributeName value);

  /**
   * Returns the value of the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple</em>' attribute.
   * @see #setMultiple(boolean)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Multiple()
   * @model
   * @generated
   */
  boolean isMultiple();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#isMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see #isMultiple()
   * @generated
   */
  void setMultiple(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.oil.oil.DefaultEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see org.xtext.example.oil.oil.DefaultEnum
   * @see #setDefault(DefaultEnum)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Default()
   * @model
   * @generated
   */
  DefaultEnum getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see org.xtext.example.oil.oil.DefaultEnum
   * @see #getDefault()
   * @generated
   */
  void setDefault(DefaultEnum value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.xtext.example.oil.oil.OilPackage#getImplAttrEnumDef_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplAttrEnumDef#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // ImplAttrEnumDef
