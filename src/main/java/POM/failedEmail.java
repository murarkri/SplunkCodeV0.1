package POM;

import java.sql.Timestamp;
import java.util.Properties;

import javax.mail.MessagingException;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class failedEmail {

	
	static final String myAccount = "murari.krishna1@ikea.com";
	static final String password = "india12b";
	
	public void mailTrigger(String Recipient) throws MessagingException
	{
		System.out.println("Sending Email");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "false");
		properties.put("mail.smtp.host", "smtp-gw.ikea.com");
		properties.put("mail.smtp.port", "25");
		
		
		
			
			  EmailAttachment emailAttachment=new EmailAttachment();
			  emailAttachment.setPath("C:\\Users\\mukri2\\eclipse-workspace\\splunk_automation\\Screenshots\\Check0.png");
			  emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
			  emailAttachment.setDescription("FailedServerScreenshot");
			  emailAttachment.setName("Not Running Servers Screenshot");
			  java.util.Date date= new java.util.Date();
			  
			  MultiPartEmail email=new MultiPartEmail();
		        //Set email host
		        email.setHostName("smtp-gw.ikea.com");
		        //Set email authentication username and password
		        email.setAuthenticator(new DefaultAuthenticator(myAccount,password));
		        //Set email host SSL to true
		       // email.setSSL(true);
		        try {
		            //Set From email address
		            email.setFrom(myAccount);
		        } catch (EmailException e) {
		            e.printStackTrace();
		        }
		        //Set email Subject line
		        email.setSubject("Splunk integration server health check_iPPE1-EU"+"\n"+new Timestamp(date.getTime()));
		        try {
		            //Set Email Message
		            email.setMsg("OOPS!  One or more server is not running."+" \n"+"\n" +"Please find  not running Server name in screenshot attached for reporting."+"\n"+"\n"+"\n"+"BR//"+"\n"+"Murari Krishna");
		        } catch (EmailException e) {
		            e.printStackTrace();
		        }
		        try {
		            //Set Email To Address
		            email.addTo(Recipient);
		        } catch (EmailException e) {
		            e.printStackTrace();
		        }
		        //add the attachment
		        try {
		            email.attach(emailAttachment);
		        } catch (EmailException e) {
		            e.printStackTrace();
		        }
		        try {
		            //Send Email
		            email.send();
		        } catch (EmailException e) {
		            e.printStackTrace();
		        }
			 
		 System.out.println("Email sent successfully");
	
	}	
	
}
