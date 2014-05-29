package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.Application
import DFN.DataFlowNetwork
import DFN.EndPoint
import DFN.InPort
import DFN.NamedElement
import DFN.OutPort
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.EndPointSourceGenerator
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.helper.GeneratorHelper
import java.util.ArrayList

/**
 * 
 */
class AppSourceGenerator extends EndPointSourceGenerator {

	new(NamedElement element, String projectName) {
		super(element, projectName)
	}

	override compile() {
		if (sourceElement instanceof Application) {
			var result = compileApp(sourceElement, sourceElement.network);
			compileClass(sourceElement, sourceElement.fullPackageName, result.toString(), imps)
		}
	}

	override void generateSources() {
		var list = new ArrayList<String>();
		list.add(projectName);
		GeneratorHelper::createJava2File(sourceElement.name, list, sourceElement.fullPackageName,
			sourceElement.generatedName + ".java", true, compile)

	}

	def compileApp(Application app, DataFlowNetwork dfn) '''
		«network.compileEndPointCommunicatorCode(app.nodes, app, app.getInPorts, imps)»
	
		«FOR node : app.nodes»
			«node.declarationName(imps)» «node.instanceName» = new «node.generatedName»();
		«ENDFOR»
		«compileEndPortForApp(dfn as EndPoint, app)»	
		
		public static void main(String[] args) {
			«app.generatedName» app = new «app.generatedName»();
			app.start();
		}	
	'''

	def getInPorts(Application app) {
		var list = new ArrayList<InPort>
		for (port : app.network.ports) {
			if (port instanceof InPort) {
				if (port.channel.app == app) {
					list.add(port)
				}
			}
		}
		list
	}

	def compileEndPortForApp(EndPoint element, Application app) '''
		«FOR port : element.ports»
			«IF (port instanceof OutPort)»
				«IF (getToApp(port.out) == app)»
					«compileOutPort(port, element)»	
				«ENDIF»
			«ENDIF»
			«IF (port instanceof InPort)»
				«IF (port.channel.app == app)»
					«compileInPort(port, element)»
				«ENDIF»
			«ENDIF»		
		«ENDFOR»
	'''

}
