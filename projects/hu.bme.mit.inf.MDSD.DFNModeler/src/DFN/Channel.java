/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Channel#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.Channel#getTarget <em>Target</em>}</li>
 *   <li>{@link DFN.Channel#getSource <em>Source</em>}</li>
 *   <li>{@link DFN.Channel#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(DataFlowNetwork)
	 * @see DFN.DFNPackage#getChannel_Network()
	 * @see DFN.DataFlowNetwork#getChannels
	 * @model opposite="channels" required="true" transient="false"
	 * @generated
	 */
	DataFlowNetwork getNetwork();

	/**
	 * Sets the value of the '{@link DFN.Channel#getNetwork <em>Network</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' container reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(DataFlowNetwork value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DFN.InPort#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(InPort)
	 * @see DFN.DFNPackage#getChannel_Target()
	 * @see DFN.InPort#getIn
	 * @model opposite="in" required="true"
	 * @generated
	 */
	InPort getTarget();

	/**
	 * Sets the value of the '{@link DFN.Channel#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InPort value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DFN.OutPort#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(OutPort)
	 * @see DFN.DFNPackage#getChannel_Source()
	 * @see DFN.OutPort#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	OutPort getSource();

	/**
	 * Sets the value of the '{@link DFN.Channel#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OutPort value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see DFN.DFNPackage#getChannel_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link DFN.Channel#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // Channel
