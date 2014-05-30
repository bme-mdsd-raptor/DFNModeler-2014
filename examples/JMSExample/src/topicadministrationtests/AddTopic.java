package topicadministrationtests;

import java.net.MalformedURLException;
import javax.jms.JMSException;
import org.exolab.jms.administration.AdminConnectionFactory;
import org.exolab.jms.administration.JmsAdminServerIfc;

public class AddTopic {
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
		
		//create new topic
	    String topic = "mytopic";
	    Boolean isQueue = Boolean.FALSE;
	    try {
			if (!admin.addDestination(topic, isQueue)) {
			    System.err.println("Failed to create topic " + topic);
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
				
	  //close the admin session
		admin.close();
	}
}
