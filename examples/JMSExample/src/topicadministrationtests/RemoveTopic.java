package topicadministrationtests;

import java.net.MalformedURLException;
import javax.jms.JMSException;
import org.exolab.jms.administration.AdminConnectionFactory;
import org.exolab.jms.administration.JmsAdminServerIfc;

public class RemoveTopic {
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
		
		
		//check if the given destination exists
		String destination = "mytopic";
		try {
			if (admin.destinationExists(destination)) {

				System.out.println(destination + " exists");
				//remove the destination
				if (!admin.removeDestination(destination)) {
					System.err.println("Failed to remove destination "
							+ destination);
				}else{
					System.out.println(destination + " removed");
				}

			} else {

				System.out.println(destination + " doesn't exist");
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		//close the admin session
		admin.close();
	}
}
