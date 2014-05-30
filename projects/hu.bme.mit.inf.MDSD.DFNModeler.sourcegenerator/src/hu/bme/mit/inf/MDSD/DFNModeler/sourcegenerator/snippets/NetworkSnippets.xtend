package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets

import DFN.DataFlowNetwork
import DFN.InPort
import DFN.IntToken
import DFN.NamedElement
import DFN.Node
import java.util.HashSet
import java.util.List

/**
 * 
 */
abstract class NetworkSnippets extends GeneratorSnippets {

	protected String mqtturl = "tcp://localhost:1883";
	protected int mqttqos = 2;

	def CharSequence compileImports()

	def CharSequence compileImplements()

	def CharSequence separator()
	

	def CharSequence compileNetworkCode(NamedElement element)

	def compileEndPointCommunicatorCode(List<Node> nodes, NamedElement element, List<InPort> ports,
		HashSet<NamedElement> imps) '''
		
			////////////////////////////////////////////////////////////////////////////////////////////////////
			//General Networking///////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
			public void start() {	
				thread = new Thread((Runnable)this);
				thread.start();	
			}
			
			public void close()
			{
				System.out.println("close");
				disconnect();
				if(thread!=null)
				{
					thread.interrupt();
				}
				«FOR node : nodes»
					«node.instanceName».close();
				«ENDFOR»
			}
		
			
			public void run() {	
				«FOR node : nodes»
					«node.instanceName».start();
				«ENDFOR»
				try{	
					while(true)
					{
						java.util.Map.Entry<String,String> entry=jobQueue.take();
						parsemessages(entry.getKey(), entry.getValue());
					}
					
				} catch (InterruptedException e) {
				}
			}
			
			public void parsemessages(String arg0, String arg1) {
				«FOR port : ports»
					«IF (isCrossInPort(port))»
						if(arg0.equals("«compileTopicName(port.channel.toPort)»"))
						{
							«IF (port.channel.token instanceof IntToken)»
								setInputOn«port.generatedName»(new «port.channel.token.declarationName(imps)»(Integer.parseInt(arg1.toString())));		
							«ELSE»
								setInputOn«port.generatedName»(«port.channel.token.declarationName(imps)».valueOf(arg1.toString()));		
							«ENDIF»
						}
					«ENDIF»
				«ENDFOR»	
				
				«IF (element instanceof Node)»
					if(arg0.equals("«element.network.generatedName»«separator»StateRequest"))
						{
							PublishState();
						}
				«ENDIF»
			}
			
			
			
			«IF (element instanceof Node)»
				public void PublishState()
				{
					sendMessage("«element.network.generatedName»«separator»«element.generatedName»",state.name());
				}
			«ENDIF»
			
		
			public «element.generatedName»() {
				connect("«element.hashCode()»");
				«FOR port : ports»
					«IF (isCrossInPort(port))»
						subscribe("«compileTopicName(port.channel.toPort)»");
					«ENDIF»	
				«ENDFOR»
				«IF (element instanceof Node)»
					subscribe("«element.network.generatedName»«separator»StateRequest");
				«ENDIF»		
			
			}
		
			
			////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
	'''

	def compileControllerCommunicatorCode(List<Node> nodes, NamedElement element, List<InPort> ports,
		HashSet<NamedElement> imps) '''
			////////////////////////////////////////////////////////////////////////////////////////////////////
			//General Networking///////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
		
			public void start() {	
				thread = new Thread((Runnable)this);
				thread.start();	
				«FOR dfn : (element as DataFlowNetwork).getOwnedDFNs()»
					«dfn.instanceName».start(); 
				«ENDFOR»	
			}
			
		
			public void close()
			{
				System.out.println("close");
				disconnect();
				if(thread!=null)
				{
					thread.interrupt();
				}
				«FOR dfn : (element as DataFlowNetwork).getOwnedDFNs()»
					«dfn.instanceName».close(); 
				«ENDFOR»	
			}	
		
			public void run() {	
				try{	
					while(true)
					{
						java.util.Map.Entry<String,String> entry=jobQueue.take();
						parsemessages(entry.getKey(), entry.getValue());
					}
					
				} catch (InterruptedException e) {
				}
			}
			
			
			public void parsemessages(String arg0, String arg1) {
				«FOR node : nodes»
					if(arg0.equals("«element.generatedName»«separator»«node.generatedName»"))
					{
						System.out.println("«element.generatedName»«separator»«node.generatedName» " + arg1);
						 «node.generatedName»state =  «node.generatedName»State.valueOf(arg1.toString());
					}
					
				«ENDFOR»	
				setChanged();
				notifyObservers();
			}
			
			public «element.generatedName»Controller() {
				connect("C«element.hashCode()»");
				«FOR node : nodes»
					subscribe("«element.generatedName»«separator»«node.generatedName»");
				«ENDFOR»	
			
			}
			////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
	'''

	def CharSequence compilePomXML()
	
	def compileTopicName(InPort port)
	{
		if  (port.endpoint instanceof Node)
		{
			return (port.endpoint as Node).network.instanceName + separator + port.endpoint.instanceName + separator + port.generatedName
		}
	}
}