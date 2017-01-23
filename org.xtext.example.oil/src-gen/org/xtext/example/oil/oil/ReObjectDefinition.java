/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Re Object Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.ReObjectDefinition#getReobject <em>Reobject</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ReObjectDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ReObjectDefinition#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ReObjectDefinition#getDescrption <em>Descrption</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getReObjectDefinition()
 * @model
 * @generated
 */
public interface ReObjectDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Reobject</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reobject</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reobject</em>' attribute.
   * @see #setReobject(String)
   * @see org.xtext.example.oil.oil.OilPackage#getReObjectDefinition_Reobject()
   * @model
   * @generated
   */
  String getReobject();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ReObjectDefinition#getReobject <em>Reobject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reobject</em>' attribute.
   * @see #getReobject()
   * @generated
   */
  void setReobject(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.oil.oil.OilPackage#getReObjectDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ReObjectDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getReObjectDefinition_ParameterList()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getParameterList();

  /**
   * Returns the value of the '<em><b>Descrption</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descrption</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descrption</em>' attribute.
   * @see #setDescrption(String)
   * @see org.xtext.example.oil.oil.OilPackage#getReObjectDefinition_Descrption()
   * @model
   * @generated
   */
  String getDescrption();

  /**
   * Sets the value of the '{@link org.xtext.example.oil.oil.ReObjectDefinition#getDescrption <em>Descrption</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descrption</em>' attribute.
   * @see #getDescrption()
   * @generated
   */
  void setDescrption(String value);

} // ReObjectDefinition