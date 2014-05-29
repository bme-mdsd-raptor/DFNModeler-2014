/**
 */
package DFN;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Transition#getNode <em>Node</em>}</li>
 *   <li>{@link DFN.Transition#getPriority <em>Priority</em>}</li>
 *   <li>{@link DFN.Transition#getIn <em>In</em>}</li>
 *   <li>{@link DFN.Transition#getOut <em>Out</em>}</li>
 *   <li>{@link DFN.Transition#getSourcestate <em>Sourcestate</em>}</li>
 *   <li>{@link DFN.Transition#getTargetstate <em>Targetstate</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getTransition()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Transition extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.Node#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see DFN.DFNPackage#getTransition_Node()
	 * @see DFN.Node#getTransitions
	 * @model opposite="transitions" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link DFN.Transition#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see DFN.DFNPackage#getTransition_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link DFN.Transition#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link DFN.InMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see DFN.DFNPackage#getTransition_In()
	 * @model required="true"
	 * @generated
	 */
	EList<InMapping> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link DFN.OutMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see DFN.DFNPackage#getTransition_Out()
	 * @model
	 * @generated
	 */
	EList<OutMapping> getOut();

	/**
	 * Returns the value of the '<em><b>Sourcestate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcestate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcestate</em>' reference.
	 * @see #setSourcestate(State)
	 * @see DFN.DFNPackage#getTransition_Sourcestate()
	 * @model required="true"
	 * @generated
	 */
	State getSourcestate();

	/**
	 * Sets the value of the '{@link DFN.Transition#getSourcestate <em>Sourcestate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcestate</em>' reference.
	 * @see #getSourcestate()
	 * @generated
	 */
	void setSourcestate(State value);

	/**
	 * Returns the value of the '<em><b>Targetstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targetstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targetstate</em>' reference.
	 * @see #setTargetstate(State)
	 * @see DFN.DFNPackage#getTransition_Targetstate()
	 * @model
	 * @generated
	 */
	State getTargetstate();

	/**
	 * Sets the value of the '{@link DFN.Transition#getTargetstate <em>Targetstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targetstate</em>' reference.
	 * @see #getTargetstate()
	 * @generated
	 */
	void setTargetstate(State value);

} // Transition
