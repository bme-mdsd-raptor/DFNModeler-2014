/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.DataFlowNetwork#getNodes <em>Nodes</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getChannels <em>Channels</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getTokens <em>Tokens</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getOwnedDFNs <em>Owned DF Ns</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getApps <em>Apps</em>}</li>
 *   <li>{@link DFN.DataFlowNetwork#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getDataFlowNetwork()
 * @model
 * @generated
 */
public interface DataFlowNetwork extends EndPoint {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Node}.
	 * It is bidirectional and its opposite is '{@link DFN.Node#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see DFN.DFNPackage#getDataFlowNetwork_Nodes()
	 * @see DFN.Node#getNetwork
	 * @model opposite="network" containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Channel}.
	 * It is bidirectional and its opposite is '{@link DFN.Channel#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see DFN.DFNPackage#getDataFlowNetwork_Channels()
	 * @see DFN.Channel#getNetwork
	 * @model opposite="network" containment="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Token}.
	 * It is bidirectional and its opposite is '{@link DFN.Token#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see DFN.DFNPackage#getDataFlowNetwork_Tokens()
	 * @see DFN.Token#getNetwork
	 * @model opposite="network" containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Owned DF Ns</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.DataFlowNetwork}.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned DF Ns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned DF Ns</em>' containment reference list.
	 * @see DFN.DFNPackage#getDataFlowNetwork_OwnedDFNs()
	 * @see DFN.DataFlowNetwork#getNetwork
	 * @model opposite="network" containment="true"
	 * @generated
	 */
	EList<DataFlowNetwork> getOwnedDFNs();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getOwnedDFNs <em>Owned DF Ns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(DataFlowNetwork)
	 * @see DFN.DFNPackage#getDataFlowNetwork_Network()
	 * @see DFN.DataFlowNetwork#getOwnedDFNs
	 * @model opposite="ownedDFNs" transient="false"
	 * @generated
	 */
	DataFlowNetwork getNetwork();

	/**
	 * Sets the value of the '{@link DFN.DataFlowNetwork#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(DataFlowNetwork value);

	/**
	 * Returns the value of the '<em><b>Apps</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Application}.
	 * It is bidirectional and its opposite is '{@link DFN.Application#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' containment reference list.
	 * @see DFN.DFNPackage#getDataFlowNetwork_Apps()
	 * @see DFN.Application#getNetwork
	 * @model opposite="network" containment="true" required="true"
	 * @generated
	 */
	EList<Application> getApps();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link DFN.CommProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see DFN.CommProtocol
	 * @see #setProtocol(CommProtocol)
	 * @see DFN.DFNPackage#getDataFlowNetwork_Protocol()
	 * @model
	 * @generated
	 */
	CommProtocol getProtocol();

	/**
	 * Sets the value of the '{@link DFN.DataFlowNetwork#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see DFN.CommProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommProtocol value);

} // DataFlowNetwork
