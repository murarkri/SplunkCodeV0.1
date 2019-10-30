package POM;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email1 {



	public void SendEmail() throws EmailException {
	
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("smartsonu39@gmail.com", "safdar7651686"));
	email.setSSLOnConnect(true);
	email.setFrom("lazymowgli@gmail.com");
	email.setSubject("Splunk Health Check Report");
	email.setMsg("All servers are Running perfectly fine");
	email.addTo("murari.krishna1@ikea.com");
	email.send();
}
}
