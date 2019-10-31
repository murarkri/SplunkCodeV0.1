package POM;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class sendMail {

	static final String myAccount = "murari.krishna1@ikea.com";
	static final String password = "india12b";
	
	/*
	 * public static void main(String[] args) throws MessagingException {
	 * 
	 * new sendMail().mailTrigger("lazymowgli@gmail.com");
	 * 
	 * }
	 */

	public void mailTrigger(String recipient) throws MessagingException
	{
		System.out.println("Sending Email");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "false");
		properties.put("mail.smtp.host", "smtp-gw.ikea.com");
		properties.put("mail.smtp.port", "25");
		
	 	
		
		Session session = Session.getInstance(properties, new Authenticator() {
			
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				
				return new PasswordAuthentication(myAccount, password);
			
				
				
			}
		
		});
		
		Message message = prepareMessage(session, recipient);
		
		Transport.send(message);
		System.out.println("Email sent successfully");
		
	}
	
	public static Message prepareMessage(Session session, String recipient) 
	{
		try 
		{
			
			BodyPart messageBodyPart = new MimeBodyPart();
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccount));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			message.setSubject("Splunk integration server health check_iPPE1-EU");
			messageBodyPart.setText("Hi Team,"+"\n"+"\n"+"Please find the attached htlm report of health status for Splunk integration servers. "+"\n"+"\n"+"\n"+"Best Regards,"+"\n"+"Murari Krishna");
			
			Multipart multipart = new MimeMultipart();
			
			multipart.addBodyPart(messageBodyPart);
			
			messageBodyPart = new MimeBodyPart();
			String fileName = "C:\\Users\\mukri2\\eclipse-workspace\\splunk_automation\\ExtentReportFolder\\SplunkStatusReport.html";
			DataSource source = new FileDataSource(fileName);
			
			messageBodyPart.setDataHandler(new DataHandler(source));
			
			messageBodyPart.setFileName(fileName);
			
			multipart.addBodyPart(messageBodyPart);
			
			message.setContent(multipart);
			
			return message;
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	
	
} 




	
