package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.Application
import DFN.DataFlowNetwork
import DFN.NamedElement
import DFN.OutPort
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.SourceGenerator
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.helper.GeneratorHelper
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.NetworkSnippets
import java.util.ArrayList

/**
 * 
 */
class AppSourceGenerator extends SourceGenerator {

	new(NamedElement element, String projectName, NetworkSnippets protocol) {
		super(element, projectName, protocol)
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
			sourceElement.generatedName + ".java", true, compile, network)

	}

	def compileApp(Application app, DataFlowNetwork dfn) '''
	
		«FOR node : app.nodes»
			«node.declarationName(imps)» «node.instanceName» = new «node.generatedName»();
		«ENDFOR»
			
		public void start() {	
			«FOR node : app.nodes»
				«node.instanceName».start();
			«ENDFOR»
			«FOR element: app.nodes»
				«FOR port : element.ports»
					«IF (port instanceof OutPort)»
						«IF (element.app == null || getTo(port.getOut()).app.equals(element.app))»
							«element.instanceName».set«port.out.to.instanceName»(«port.out.to.instanceName»);
						«ENDIF»	
					«ENDIF»		
				«ENDFOR»
			«ENDFOR»
		}
		
		public void close()
		{
			System.out.println("close");
			«FOR node : app.nodes»
				«node.instanceName».close();
			«ENDFOR»
		}
	
		
		public static void main(String[] args) {
			«app.generatedName» app = new «app.generatedName»();
			app.start();
		}	
	'''



}
