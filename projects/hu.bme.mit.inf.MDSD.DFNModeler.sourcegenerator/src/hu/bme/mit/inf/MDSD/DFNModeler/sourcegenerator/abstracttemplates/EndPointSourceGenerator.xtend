package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.abstracttemplates

import DFN.EndPoint
import DFN.InOutPort
import DFN.InPort
import DFN.IntToken
import DFN.NamedElement
import DFN.Node
import DFN.OutPort
import DFN.Port
import DFN.RelationalSymbols
import DFN.StringToken
import DFN.Transition
import api.CodegenAPI
import hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets.NetworkSnippets
import java.util.Collection
import java.util.HashSet
import java.util.Set

/**
 * 
 */
abstract class EndPointSourceGenerator extends SourceGenerator {

	new(NamedElement element, String projectName, NetworkSnippets protocol) {
		super(element, projectName, protocol)
	}

	override compileClass(NamedElement element,String packageName, String content, Collection<NamedElement> imps) '''	
		package «packageName» ;
			
		«compileImports(element, imps)»
		«network.compileImports»
		public class «element.generatedName» «network.compileImplements»
		{	
			«network.compileNetworkCode(element)»
			
			«content»
		}
	'''

	def compileEndPort(EndPoint element) '''

		«FOR port : element.ports»
			«IF (port instanceof OutPort)»
				«IF (inApp(element.getApp(), port.getOut()))»
					«compileOutPort(port, element)»	
				«ENDIF»
			«ENDIF»
			«IF (port instanceof InPort)»
				«IF (inApp(element.getApp(), port.channel))»
					«compileInPort(port, element)»
				«ENDIF»
			«ENDIF»		
		«ENDFOR»
	'''

	def compileInPort(InPort port, EndPoint element) '''
		«port.channel.token.generatedName» «port.channel.target.instanceName» = null;
		public void setInputOn«port.generatedName»(«port.channel.token.declarationName(imps)» token)
		{			
			«port.channel.target.instanceName» = token;
			«IF (element instanceof Node)»
				«compileTransitions(element, port)»
			«ENDIF»	
			«IF (port instanceof InOutPort)»
				«compileSendToken(port, element)»
			«ENDIF»	
		}
	'''

	def compileOutPort(OutPort port, EndPoint element) '''
		public void setOutputOn«port.getOut().generatedName»(«port.getOut().token.declarationName(imps)» token)
		{		
			«compileSendToken(port, element)»	
		}
	'''

	def compileSendToken(OutPort port, EndPoint element) '''
		«IF (element.app == null || getTo(port.getOut()).app.equals(element.app))»		
			«port.getOut().to.instanceName».setInputOn«port.getOut().target.generatedName»(token);
		«ELSE»	
			«IF (port.getOut().token instanceof IntToken)»
				sendMessage("«network.compileTopicName(port.getOut().toPort)»","" + token.getValue());
			«ELSE»
				sendMessage("«network.compileTopicName(port.getOut().toPort)»",token.name());
			«ENDIF»		
		«ENDIF»	
	'''

	def compileTransitions(Node node, InPort port) '''
		«FOR transition : CodegenAPI.getTransitionsByInPort(port.eResource, port)»
			«compileTransitionCaller(transition)»						
		«ENDFOR»
	'''

	def compileTransitionCaller(Transition transition) '''	
		//transition
			
		if («compileTransitionCondition(transition)»)
			{
				System.out.println("«transition.node.fullPackageName»: «transition.node.generatedName»");	
				System.out.println("«transition.sourcestate.generatedName» -> «transition.targetstate.generatedName»");
		
		
				
				state = State.«transition.targetstate.generatedName»;
				PublishState();
				«compileOutMappings(transition)»
				
				return;
				
			}
			
	'''

	def compileTransitionCondition(Transition transition) {
		var res = "state == State." + transition.sourcestate.generatedName;
		for (inmapping : CodegenAPI.getInPortStringEquationByTransition(transition.eResource, transition)) {
			res = res + " && " + '''«inmapping.port.instanceName»!=null && «inmapping.literal.literalName» == «inmapping.
				port.instanceName»'''
		}
		for (inmapping : CodegenAPI.getInPortIntEquationByTransition(transition.eResource, transition)) {
			res = res + " && " +
				'''«inmapping.port.instanceName»!=null && «inmapping.value» == «inmapping.port.instanceName».getValue()'''
		}
		for (inmapping : CodegenAPI.getInequalityByTransition(transition.eResource, transition)) {
			res = res + " && " + '''«inmapping.port.instanceName»!=null && «inmapping.value» «compileRelationalSymbol(
				inmapping.kind)» «inmapping.port.instanceName».getValue()'''
		}
		return res;
	}

	def compileOutMappings(Transition transition) {
		var res = ""
		for (outmapping : CodegenAPI.getOutPortStringEquationByTransition(transition.eResource, transition)) {
			res = res + "\n" + "setOutputOn" + (outmapping.port as OutPort).getOut().generatedName + "(" +
				outmapping.literal.literalName + ");"
		}
		for (outmapping : CodegenAPI.getOutPortIntEquationByTransition(transition.eResource, transition)) {
			res = res + "\n" + "setOutputOn" + (outmapping.port as OutPort).getOut().generatedName + "( new " +
				(outmapping.port as OutPort).out.token.declarationName(imps) + "(" + outmapping.value + "));"
		}

		return res
	}

	def compileRelationalSymbol(RelationalSymbols symbol) {
		switch symbol {
			case RelationalSymbols.MORE_THAN: return "<"
			case RelationalSymbols.MORE_OR_EQUALS: return "<="
			case RelationalSymbols.LESSER_THAN: return ">"
			case RelationalSymbols.LESSER_OR_EQUALS: return ">="
		}
		return "==";
	}

	def listLiterals(StringToken token) {
		var result = ""
		var first = true;
		for (literal : (token).literals) {
			if (first != true) {
				result = result + ", "
			} else {
				first = false
			}

			result = result + literal.value.sanitize
		}
		result
	}

	def listStates(Node node) {
		var result = ""
		var first = true;
		for (state : node.states) {
			if (first != true) {
				result = result + ", "
			} else {
				first = false
			}

			result = result + state.generatedName
		}
		result
	}

	def Set<NamedElement> listEndPointImports(EndPoint element) {
		var imps = new HashSet()
		imps.add(element)
		for (Port port : element.ports) {
			if (port instanceof InPort) {
				imps.add(port.in.token)
			}
			if (port instanceof OutPort) {
				imps.add(port.out.token)
			}
		}

		return imps
	}


}
