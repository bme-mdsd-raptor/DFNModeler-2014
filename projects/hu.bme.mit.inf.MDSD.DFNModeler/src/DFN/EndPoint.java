/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.EndPoint#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getEndPoint()
 * @model abstract="true"
 * @generated
 */
public interface EndPoint extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link DFN.Port}.
	 * It is bidirectional and its opposite is '{@link DFN.Port#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see DFN.DFNPackage#getEndPoint_Ports()
	 * @see DFN.Port#getEndpoint
	 * @model opposite="endpoint" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // EndPoint
