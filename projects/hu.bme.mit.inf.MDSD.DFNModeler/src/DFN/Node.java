/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Node#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.Node#getStates <em>States</em>}</li>
 *   <li>{@link DFN.Node#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link DFN.Node#getTokens <em>Tokens</em>}</li>
 *   <li>{@link DFN.Node#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link DFN.Node#getMappings <em>Mappings</em>}</li>
 *   <li>{@link DFN.Node#getApp <em>App</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EndPoint {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(DataFlowNetwork)
	 * @see DFN.DFNPackage#getNode_Network()
	 * @see DFN.DataFlowNetwork#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	DataFlowNetwork getNetwork();

	/**
	 * Sets the value of the '{@link DFN.Node#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(DataFlowNetwork value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.State}.
	 * It is bidirectional and its opposite is '{@link DFN.State#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see DFN.DFNPackage#getNode_States()
	 * @see DFN.State#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see DFN.DFNPackage#getNode_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link DFN.Node#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link DFN.Token}.
	 * It is bidirectional and its opposite is '{@link DFN.Token#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see DFN.DFNPackage#getNode_Tokens()
	 * @see DFN.Token#getNodes
	 * @model opposite="nodes"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Transition}.
	 * It is bidirectional and its opposite is '{@link DFN.Transition#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see DFN.DFNPackage#getNode_Transitions()
	 * @see DFN.Transition#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Mapping}.
	 * It is bidirectional and its opposite is '{@link DFN.Mapping#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see DFN.DFNPackage#getNode_Mappings()
	 * @see DFN.Mapping#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

	/**
	 * Returns the value of the '<em><b>App</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DFN.Application#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App</em>' reference.
	 * @see #setApp(Application)
	 * @see DFN.DFNPackage#getNode_App()
	 * @see DFN.Application#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	Application getApp();

	/**
	 * Sets the value of the '{@link DFN.Node#getApp <em>App</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App</em>' reference.
	 * @see #getApp()
	 * @generated
	 */
	void setApp(Application value);

} // Node
