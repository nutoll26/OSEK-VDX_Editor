/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impl Ref Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.ImplRefDef#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplRefDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplRefDef#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplRefDef#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getImplRefDef()
 * @model
 * @generated
 */
public interface ImplRefDef extends ImplementationDef
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.oil.oil.ObjectRefTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.oil.oil.ObjectRefTypeEnum
   * @see #setType(ObjectRefTypeEnum)
   * @see org.xtext.example.oil.oil.OilPackage#getImplRefDef_Type()
   * @model
   * @generated
   */
  ObjectRefTypeEnum getType();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplRefDef#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.oil.oil.ObjectRefTypeEnum
   * @see #getType()
   * @generated
   */
  void setType(ObjectRefTypeEnum value);

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
   * @see org.xtext.example.oil.oil.OilPackage#getImplRefDef_Name()
   * @model containment="true"
   * @generated
   */
  AttributeName getName();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplRefDef#getName <em>Name</em>}' containment reference.
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
   * @see org.xtext.example.oil.oil.OilPackage#getImplRefDef_Multiple()
   * @model
   * @generated
   */
  boolean isMultiple();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplRefDef#isMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see #isMultiple()
   * @generated
   */
  void setMultiple(boolean value);

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
   * @see org.xtext.example.oil.oil.OilPackage#getImplRefDef_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ImplRefDef#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // ImplRefDef
