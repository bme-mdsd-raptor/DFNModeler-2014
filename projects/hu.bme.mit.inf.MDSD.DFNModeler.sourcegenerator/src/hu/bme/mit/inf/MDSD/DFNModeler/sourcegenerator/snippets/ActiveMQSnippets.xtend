package hu.bme.mit.inf.MDSD.DFNModeler.sourcegenerator.snippets

import DFN.NamedElement

/**
 * 
 */
class ActiveMQSnippets extends NetworkSnippets {

	protected String url = "tcp://localhost:61616";

	override compileImports() '''
		import javax.jms.Connection;
		import javax.jms.DeliveryMode;
		import javax.jms.Destination;
		import javax.jms.Message;
		import javax.jms.MessageConsumer;
		import javax.jms.MessageProducer;
		import javax.jms.Session;
		import javax.jms.TextMessage;
		import org.apache.activemq.ActiveMQConnectionFactory;
		import java.lang.AutoCloseable;
		import java.util.AbstractMap;
		import java.util.concurrent.ArrayBlockingQueue;
		import java.util.ArrayList;
		import java.util.concurrent.BlockingQueue;
		import java.util.Observable; 
	'''

	override compileImplements() {
		return " extends Observable implements AutoCloseable, Runnable"
	}

	override separator() {
		return ".";
	}

	override compileNetworkCode(NamedElement element) '''
					
		////////////////////////////////////////////////////////////////////////////////////////////////////
		//Specific Networking///////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////
			
		Thread thread;		
		ArrayList<Consumer> subscribers= new ArrayList<Consumer>();
		
		BlockingQueue<java.util.Map.Entry<String,String>> jobQueue = new ArrayBlockingQueue<java.util.Map.Entry<String,String>>(1024);
		
		public void sendMessage(String topic, String messageString)
		{
			
			try {

				ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("«url»");

				Connection connection = connectionFactory.createConnection();
				connection.start();

				Session session = connection.createSession(false,
						Session.AUTO_ACKNOWLEDGE);
						
				Destination destination = session.createTopic(topic);
			
			
				MessageProducer producer = session.createProducer(destination);
				producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			
				TextMessage message = session.createTextMessage(messageString);
			

				System.out.println("Sent message: " + topic
							+ " : " + message.getText());
				producer.send(message);


				session.close();
				connection.close();
			} catch (Exception e) {
				System.out.println("Caught: " + e);
				e.printStackTrace();
			}
			
		}
			
		public void disconnect()
		{
			for (Consumer t: subscribers)
			{
				t.requestStop();
			}
		}
			
		public void connect(String clientname) {
		
		}
		
		public void subscribe(String topic)
		{
			try
			{
				Consumer thread = new Consumer(topic);
				subscribers.add(thread);
				thread.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public class Consumer extends Thread{

			String topic;
			private volatile boolean stop = false;

			public Consumer(String topic) {
				super();
				this.topic=topic;
			}
					
			public void run() {
				try {
					ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("«url»");
						
					Connection connection = connectionFactory.createConnection();
					connection.start();
					
					Session session = connection.createSession(false,
							Session.AUTO_ACKNOWLEDGE);
							
					Destination destination = session.createTopic(topic);
						
					MessageConsumer consumer = session.createConsumer(destination);
					System.out.println("New consumer on " + topic );

					while(!stop)
					{
						Message message = consumer.receive(1000);
						
						if(message!=null && message instanceof TextMessage)
						{
							System.out.println("message received");
							jobQueue.put(new AbstractMap.SimpleEntry<String,String>(topic, ((TextMessage)message).getText()));
						}
					}
					System.out.println("Consumer exiting!");
					session.close();
					connection.close();
					
				} catch (Exception e) {
					System.out.println("Caught: " + e);
					e.printStackTrace();
				}
			}
			
			public void requestStop()
			{
				stop=true;
			}
		}
	'''

	override compilePomXML() '''	
		<dependencies>
			<dependency>
				<groupId>org.apache.activemq</groupId>
				<artifactId>activemq-all</artifactId>
				<version>5.9.1</version>
			</dependency>
		</dependencies>
	'''

}
