package splunk.splunk_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;

import javax.mail.MessagingException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import POM.BrowserConfig;
import POM.CommonFunctions;
import POM.ExtentReportClass;
import POM.SplunkHomePage;
import POM.SplunkLoginPage;
import POM.StatusCheck;
import POM.sendMail;

public class DriverTest extends BrowserConfig {
@Test
	public  void Code() throws InterruptedException, IOException, MessagingException {
		// TODO Auto-generated method stub
	     driver=initializeDriver();
		 driver.get("https://splunk.ikea.com/en-US/app/ikea/somchecksterlingserverstatus?form.field1=");
		 driver.manage().window().maximize();
		
		 SplunkLoginPage Slp=new SplunkLoginPage(driver);
		 Slp.UN().sendKeys("mukri2");
		 Slp.Password().sendKeys("india12c");
		 Slp.Login().click();
		 Thread.sleep(7000);
		 SplunkHomePage Shp=new SplunkHomePage(driver);
		 Shp.DropDown().click();
		 //driver.findElement(By.xpath("//button[contains(@data-test,'toggle')]")).click();
		 Actions builder = new Actions(driver);
		 Actions el=builder.moveToElement(Shp.SelectRegion());
		 el.click().perform();
		 java.util.Date date= new java.util.Date();
		 
         File src= new File("./ServerExcel/Splunk Integ Server.xlsx");
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet sheet=wb.getSheetAt(0);
		 int RowCount=sheet.getLastRowNum();
		 int RealCount=RowCount+1;
		 System.out.println("Total Number of Servers are : "+ RealCount);
		 
		 for(int i=0;i<RowCount;i++) {
			 String Server1 = sheet.getRow(i).getCell(0).getStringCellValue();
			 System.out.println("Started Checking four components of  "  +  Server1 );
			 
		 
		 Shp.Sis(Server1);
			 
			 Shp.Submit();
			
			 
			 StatusCheck Sc=new StatusCheck();
			 
			 
			 
				
				 
			      System.out.println(new Timestamp(date.getTime()) + " Before Check");
			      Thread.sleep(5000);
			      CommonFunctions scrShot = new CommonFunctions();
					
			      
				scrShot.expWait(driver, new StatusCheck().Status(driver));
				
				scrShot.ScreenShot(driver, i);
				
			 
				 String result1=Sc.FirstRow(driver).getText();
				 
				 
				 String result2=Sc.SecondRow(driver).getText(); 
				 
				 String result3=Sc.ThridRow(driver).getText();
				 
				 String result4=Sc.FourthRow(driver).getText();
				 
			
			
				
				 if(result1.equalsIgnoreCase("Running")) {
					 System.out.println("First row of "+ Server1 + " : Running");
					   }else {
						System.out.println("First row of " + Server1 + ": Not Running");
						
						
					  }
				 if(result2.equalsIgnoreCase("Running")) {
					  System.out.println("Second row of "+ Server1 + ": Running");
				         }else {
					      System.out.println("Second row of "+ Server1 + ":Not Running");
				               }
				 
				 if(result3.equalsIgnoreCase("Running")) {
					   System.out.println("Thrid row of "+ Server1 + " : Running");
				            }else {
				 	            System.out.println("third row of " +  Server1 + ":Not Running");
				                                }

					if(result4.equalsIgnoreCase("Running")) {
						   System.out.println("Fourth row of "+ Server1 + ": Running");
					            }else {
						               System.out.println("Fourht row of "+ Server1 +":Not Running");
					                   }
			 
					System.out.println(new Timestamp(date.getTime()) + " After Check");
		 
					if((result1.equalsIgnoreCase("Not Running"))||(result2.equalsIgnoreCase("Not Running"))||(result3.equalsIgnoreCase("Not Running"))||(result4.equalsIgnoreCase("Not Running")))
						  {							
						   
						   String Valid="Not Running";     
						
						   System.out.println("One or more components of " + Server1 + "is " + Valid);
						  }
					 else    
					      {
						
						   System.out.println("All four components of " + Server1 + " are Running");
					        
					      }
		            
					
					

				
			    
			
			Thread.sleep(5000);
			Shp.Sis(Keys.chord(Keys.CONTROL,"a"));
			Shp.ClearText().sendKeys(Keys.BACK_SPACE);
		
			
		}
		 
		 
		 wb.close();
		 
		 ExtentReportClass showTime = new ExtentReportClass();
		 showTime.report();
		 
		
		 
	     new sendMail().mailTrigger("murari.krishna1@ikea.com");
		 
		 driver.quit();
		 
		
		 
}
	
	
      
}
