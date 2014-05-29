package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.EndPoint
import DFN.InPort
import DFN.NamedElement
import DFN.Node
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.EndPointSourceGenerator
import java.util.ArrayList

/**
 * 
 */
class NodeSourceGenerator extends EndPointSourceGenerator {

	new(NamedElement element, String projectName) {
		super(element, projectName)
	}

	override compile() {

		if (sourceElement instanceof Node) {
			var result = compileNode(sourceElement);
			compileClass(sourceElement, sourceElement.fullPackageName, result.toString(), imps)
		}
	}

	def compileNode(Node element) '''
		«network.compileEndPointCommunicatorCode(new ArrayList<Node>(), element, element.getInPorts, imps)»
		
		
		
		public enum State{
			«listStates(element)»
		}
		
		
		State state = State.«element.initialState.generatedName»;
						
		«compileEndPort(element as EndPoint)»		
	'''

}
