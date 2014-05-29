/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.OutPort#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getOutPort()
 * @model
 * @generated
 */
public interface OutPort extends Port {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DFN.Channel#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Channel)
	 * @see DFN.DFNPackage#getOutPort_Out()
	 * @see DFN.Channel#getSource
	 * @model opposite="source" required="true"
	 * @generated
	 */
	Channel getOut();

	/**
	 * Sets the value of the '{@link DFN.OutPort#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Channel value);

} // OutPort
