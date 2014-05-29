package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.templates

import DFN.DataFlowNetwork
import DFN.EndPoint
import DFN.InOutPort
import DFN.InPort
import DFN.IntToken
import DFN.NamedElement
import DFN.OutPort
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates.EndPointSourceGenerator
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.helper.GeneratorHelper
import java.util.ArrayList
import java.util.Collection

/**
 * 
 */
class DFNControllerSourceGenerator extends EndPointSourceGenerator {

	new(NamedElement element, String projectName) {
		super(element, projectName)
	}

	override void generateSources() {
		var list = new ArrayList<String>();
		list.add(projectName);
		GeneratorHelper::createJava2File(projectName + "Controller", list, "controller",
			sourceElement.generatedName + "Controller.java", true, compile)

	}
	
	override compileClass(NamedElement element,String packageName, String content, Collection<NamedElement> imps) '''	
			package «packageName» ;
				
			«compileImports(element, imps)»
			«network.compileImports»
			public class «element.generatedName»Controller «network.compileImplements»
			{	
				«network.compileNetworkCode(element)»
	
	
				«content»
			}
		'''
		
	override compile() {
		if (sourceElement instanceof DataFlowNetwork) {
			var result = compileDFNController(sourceElement);
			compileClass(sourceElement,"controller", result.toString(), imps)
		}
	}

	def compileDFNController(DataFlowNetwork element) '''
	
		«network.compileControllerCommunicatorCode(element.nodes, element, element.getInPorts, imps)»
		
		
		«FOR node : element.nodes»
			public enum «node.generatedName»State{
				«listStates(node)»;
			}	
			«node.generatedName»State  «node.generatedName»state =  «node.generatedName»State.«node.initialState.generatedName»;
			public «node.generatedName»State get«node.generatedName»state()
			{
				return «node.generatedName»state;
			}
		«ENDFOR»
		
		«FOR dfn : element.getOwnedDFNs()»
			 «dfn.generatedName»Controller «dfn.instanceName»=new «dfn.generatedName»Controller(); 
			  public «dfn.generatedName»Controller get«dfn.generatedName»Controller()
			 {
			 	return «dfn.instanceName»;
			 }
		«ENDFOR»
		
		«compileEndPort(element)»
		
	'''





	override compileEndPort(EndPoint element) '''
		«FOR port : element.ports»
			«IF (port instanceof InPort)»
				«IF (inApp(element.getApp(), port.channel))»
					«compileInPort(port, element)»
				«ENDIF»
			«ENDIF»		
		«ENDFOR»
	'''

	override compileInPort(InPort port, EndPoint element) '''
		
			public void setInputOn«port.generatedName»(«port.channel.token.declarationName(imps)» token)
			{				
				«IF (port instanceof InOutPort)»
					«compileSendToken(port, element)»
				«ENDIF»	
			}
	'''

	override compileSendToken(OutPort port, EndPoint element) '''
		
		«IF (port.getOut().token instanceof IntToken)»
			sendMessage("«port.getOut().target.endpoint.instanceName»/«port.getOut().target.generatedName»","" + token.getValue());
		«ELSE»
			sendMessage("«port.getOut().target.endpoint.instanceName»/«port.getOut().target.generatedName»",token.name());
		«ENDIF»		
	'''

	override compileImports(NamedElement node, Collection<NamedElement> imps) '''
		«FOR imp : imps»

				import «imp.fullPackageName».«imp.generatedName»;

		«ENDFOR»
	'''
}
