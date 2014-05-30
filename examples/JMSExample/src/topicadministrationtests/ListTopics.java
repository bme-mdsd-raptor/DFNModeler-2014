package topicadministrationtests;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Vector;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Topic;

import org.exolab.jms.administration.AdminConnectionFactory;
import org.exolab.jms.administration.JmsAdminServerIfc;

public class ListTopics {
	public static void main(String[] args) {
		
		//Login as the OPENJMS provider's admin
		String url = "tcp://localhost:3035/";
		JmsAdminServerIfc admin = null;
		try {
			admin = AdminConnectionFactory.create(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		//query all destinations
		Vector<?> destinations;
		try {
			destinations = admin.getAllDestinations();
		    Iterator<?> iterator = destinations.iterator();
		    //traverse the available destinations
		    while (iterator.hasNext()) {
		      Destination destination = (Destination) iterator.next();
		      //list the topics
		      if (destination instanceof Topic) {
		         Topic topic = (Topic) destination;
		         System.out.println("topic:" + topic.getTopicName());
		      }
		    }
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//close admin session
		admin.close();
	}
}
