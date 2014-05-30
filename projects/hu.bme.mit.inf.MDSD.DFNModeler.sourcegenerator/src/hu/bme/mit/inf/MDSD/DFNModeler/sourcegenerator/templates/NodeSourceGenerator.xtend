package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.EndPoint
import DFN.NamedElement
import DFN.Node
import DFN.OutPort
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.EndPointSourceGenerator
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.NetworkSnippets
import java.util.ArrayList

/**
 * 
 */
class NodeSourceGenerator extends EndPointSourceGenerator {

	new(NamedElement element, String projectName, NetworkSnippets protocol) {
		super(element, projectName, protocol)
	}


	override compile() {

		if (sourceElement instanceof Node) {
			var result = compileNode(sourceElement);
			compileClass(sourceElement, sourceElement.fullPackageName, result.toString(), imps)
		}
	}

	def compileNode(Node element) '''
		«network.compileEndPointCommunicatorCode(new ArrayList<Node>(), element, element.getInPorts, imps)»
		
		«FOR port : element.ports»
			«IF (port instanceof OutPort)»
				«IF (element.app == null || getTo(port.getOut()).app.equals(element.app))»
					«port.out.to.declarationName(imps)» «port.out.to.instanceName»;
					
					public void set«port.out.to.instanceName»(«port.out.to.generatedName» node)
					{
						«port.out.to.instanceName» = node;
					}
				«ENDIF»	
			«ENDIF»		
		«ENDFOR»
		
		public enum State{
			«listStates(element)»
		}
		
		
		State state = State.«element.initialState.generatedName»;
						
		«compileEndPort(element as EndPoint)»		
	'''

}
