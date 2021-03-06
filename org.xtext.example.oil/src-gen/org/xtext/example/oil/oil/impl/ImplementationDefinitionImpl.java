/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.oil.oil.ImplementationDefinition;
import org.xtext.example.oil.oil.ImplementationSpec;
import org.xtext.example.oil.oil.OilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplementationDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplementationDefinitionImpl#getImplementationSpecs <em>Implementation Specs</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.impl.ImplementationDefinitionImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationDefinitionImpl extends MinimalEObjectImpl.Container implements ImplementationDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImplementationSpecs() <em>Implementation Specs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImplementationSpecs()
   * @generated
   * @ordered
   */
  protected EList<ImplementationSpec> implementationSpecs;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationDefinitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OilPackage.eINSTANCE.getImplementationDefinition();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPLEMENTATION_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImplementationSpec> getImplementationSpecs()
  {
    if (implementationSpecs == null)
    {
      implementationSpecs = new EObjectContainmentEList<ImplementationSpec>(ImplementationSpec.class, this, OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS);
    }
    return implementationSpecs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OilPackage.IMPLEMENTATION_DEFINITION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS:
        return ((InternalEList<?>)getImplementationSpecs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OilPackage.IMPLEMENTATION_DEFINITION__NAME:
        return getName();
      case OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS:
        return getImplementationSpecs();
      case OilPackage.IMPLEMENTATION_DEFINITION__DESCRIPTION:
        return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OilPackage.IMPLEMENTATION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS:
        getImplementationSpecs().clear();
        getImplementationSpecs().addAll((Collection<? extends ImplementationSpec>)newValue);
        return;
      case OilPackage.IMPLEMENTATION_DEFINITION__DESCRIPTION:
        setDescription((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPLEMENTATION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS:
        getImplementationSpecs().clear();
        return;
      case OilPackage.IMPLEMENTATION_DEFINITION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OilPackage.IMPLEMENTATION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OilPackage.IMPLEMENTATION_DEFINITION__IMPLEMENTATION_SPECS:
        return implementationSpecs != null && !implementationSpecs.isEmpty();
      case OilPackage.IMPLEMENTATION_DEFINITION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ImplementationDefinitionImpl
