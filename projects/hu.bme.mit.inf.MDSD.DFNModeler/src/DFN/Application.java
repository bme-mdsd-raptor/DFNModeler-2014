/**
 */
package DFN;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DFN.Application#getNetwork <em>Network</em>}</li>
 *   <li>{@link DFN.Application#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see DFN.DFNPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link DFN.DataFlowNetwork#getApps <em>Apps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' container reference.
	 * @see #setNetwork(DataFlowNetwork)
	 * @see DFN.DFNPackage#getApplication_Network()
	 * @see DFN.DataFlowNetwork#getApps
	 * @model opposite="apps" required="true" transient="false"
	 * @generated
	 */
	DataFlowNetwork getNetwork();

	/**
	 * Sets the value of the '{@link DFN.Application#getNetwork <em>Network</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link DFN.Node#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see DFN.DFNPackage#getApplication_Nodes()
	 * @see DFN.Node#getApp
	 * @model opposite="app"
	 * @generated
	 */
	EList<Node> getNodes();

} // Application
