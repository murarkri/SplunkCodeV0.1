package POM;

import java.sql.Timestamp;
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
			java.util.Date date= new java.util.Date();
		    
			String htmlMsg="<head>\r\n" + 
					"<style>\r\n" + 
					"table {\r\n" + 
					"  width:100%;\r\n" + 
					"}\r\n" + 
					"table, th, td {\r\n" + 
					"  border: 1px solid black;\r\n" + 
					"  border-collapse: collapse;\r\n" + 
					"}\r\n" + 
					"th, td {\r\n" + 
					"  padding: 15px;\r\n" + 
					"  text-align: left;\r\n" + 
					"}\r\n" + 
					"table#t01 tr:nth-child(even) {\r\n" + 
					"  background-color: #eee;\r\n" + 
					"}\r\n" + 
					"table#t01 tr:nth-child(odd) {\r\n" + 
					" background-color: #fff;\r\n" + 
					"}\r\n" + 
					"table#t01 th {\r\n" + 
					"  background-color: black;\r\n" + 
					"  color: white;\r\n" + 
					"}\r\n" + 
					"</style>\r\n" + 
					"</head>\r\n" + 
					"<body>\r\n" + 
					"\r\n" + 
					"<h2>Splunk Integration Servers Health Status</h2>\r\n" +
					"<h2>"+new Timestamp(date.getTime())+"</h2>\r\n" +
					"\r\n" + 
					"\r\n" + 
					"<br>\r\n" + 
					"\r\n" + 
					"<table id=\"t01\">\r\n" + 
					"  <tr>\r\n" + 
					"    <th>Server Name</th>\r\n" + 
					"    <th>Status</th> \r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"  <tr>\r\n" + 
					"    <td>IkeaOrderCreationIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					" \r\n" + 
					"  </tr>\r\n" + 
					"  <tr>\r\n" + 
					"    <td>IkeaCreateWorkOrderIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"  <tr>\r\n" + 
					"    <td>IKEAWorkOrderAckIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAWorkOrderAckIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaScheduleOrderAgent</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"  \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaReleaseOrderAgent</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaDeliveryReleasedUpdateIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaReceivePickingUpdatesIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaReadyForLoadUpdateIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					" \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaCDULoadConfirmationIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaCSMDsptchdConfrmtnIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaReceivedAtHubIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaLoadedOnDeliveryTruckIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"  \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaDeliveredToCustomerIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAPublishMsgForIBISAndOCServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAProcessConfirmShipmentIntegServer</td>\r\n" + 
					"    <td>Doe</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAILTCreateInventoryActyIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					" \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAConsolidateInventoryAgentServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaConsgmntRcptForROAgent</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"    \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IKEAReceiveROIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"  \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaProcessRepOrderIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"   \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaInventoryAdjustIntegServer</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"  \r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaRTAMActivityBroadcast</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"\r\n" + 
					"  </tr>\r\n" + 
					"<tr>\r\n" + 
					"    <td>IkeaRTAMActivityPrimary</td>\r\n" + 
					"    <td>Running</td>\r\n" + 
					"  </tr>\r\n" + 
					"\r\n" + 
					"</table>\r\n" + 
					"\r\n" + 
					"</body>";
			messageBodyPart.setContent(htmlMsg, "text/html");
			
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




	
