/**
 */
package DFN;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Mapping#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getMapping()
 * @model abstract="true"
 * @generated
 */
public interface Mapping extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.Node#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' container reference.
	 * @see #setNode(Node)
	 * @see DFN.DFNPackage#getMapping_Node()
	 * @see DFN.Node#getMappings
	 * @model opposite="mappings" transient="false"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link DFN.Mapping#getNode <em>Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' container reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // Mapping
