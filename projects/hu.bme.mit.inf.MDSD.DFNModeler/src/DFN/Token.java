/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Token#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.Token#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getToken()
 * @model abstract="true"
 * @generated
 */
public interface Token extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(DataFlowNetwork)
	 * @see DFN.DFNPackage#getToken_Network()
	 * @see DFN.DataFlowNetwork#getTokens
	 * @model opposite="tokens" transient="false"
	 * @generated
	 */
	DataFlowNetwork getNetwork();

	/**
	 * Sets the value of the '{@link DFN.Token#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(DataFlowNetwork value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link DFN.Node}.
	 * It is bidirectional and its opposite is '{@link DFN.Node#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see DFN.DFNPackage#getToken_Nodes()
	 * @see DFN.Node#getTokens
	 * @model opposite="tokens"
	 * @generated
	 */
	EList<Node> getNodes();

} // Token
