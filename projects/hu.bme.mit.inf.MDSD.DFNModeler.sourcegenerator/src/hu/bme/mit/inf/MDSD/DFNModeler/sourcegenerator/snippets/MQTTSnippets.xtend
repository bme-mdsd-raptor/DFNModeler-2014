package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets

import DFN.NamedElement

/**
 * 
 */
class MQTTSnippets extends NetworkSnippets {

	protected String mqtturl = "tcp://localhost:1883";
	protected int mqttqos = 2;

	override compileImports() '''
		import org.eclipse.paho.client.mqttv3.*;
		import java.lang.AutoCloseable;
		import java.util.AbstractMap;
		import java.util.concurrent.ArrayBlockingQueue;
		import java.util.concurrent.BlockingQueue;
		import java.util.Observable; 
	'''

	override compileImplements() {
		return " extends Observable implements MqttCallback, AutoCloseable, Runnable"
	}

	override separator() {
		return "/";
	}
	override compileNetworkCode(NamedElement element) '''
				
			////////////////////////////////////////////////////////////////////////////////////////////////////
			//Specific Networking///////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////
		
			MqttClient client;
			Thread thread;
			@Override
			public void connectionLost(Throwable arg0) {	
			}
		
			@Override
			public void deliveryComplete(IMqttDeliveryToken arg0) {
			}
			BlockingQueue<java.util.Map.Entry<String,String>> jobQueue = new ArrayBlockingQueue<java.util.Map.Entry<String,String>>(1024);
		
			@Override
			public void messageArrived(String arg0, MqttMessage arg1) throws Exception {
				jobQueue.put(new AbstractMap.SimpleEntry<String,String>(arg0,arg1.toString()));
			}
			
			public void sendMessage(String topic, String messageString)
			{
				try {
					MqttMessage message = new MqttMessage();
					message.setPayload(messageString.getBytes());
					client.publish(topic, message);
				} catch (MqttException e) {
					e.printStackTrace();
				}
			}
			
			public void disconnect()
			{
				try {
					client.disconnect();
				} catch (MqttException e) {
					e.printStackTrace();
				}
				
				
			}
			
			
			public void connect(String clientname) {
				try {
					client = new MqttClient("«mqtturl»", clientname);
					client.setCallback(this);
					client.connect();
				} catch (MqttException e) {
					e.printStackTrace();
				}
			}
		
			public void subscribe(String topic)
			{
				try
				{
					client.subscribe(topic,«mqttqos»);
				} catch (MqttException e) {
					e.printStackTrace();
				}
			}
						
	'''
	
	override compilePomXML() '''	
		<repositories>
			<repository>
				<id>paho-mqtt-client</id>
				<name>Paho MQTT Client</name>
				<url>https://repo.eclipse.org/content/repositories/paho-releases/</url>
			</repository>
		</repositories>
		<dependencies>
			<dependency>
				<groupId>org.eclipse.paho</groupId>
				<artifactId>mqtt-client</artifactId>
				<packaging>jar</packaging>
				<version>0.4.0</version>
			</dependency>
		</dependencies>
	'''
	

	
}
	