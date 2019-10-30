package POM;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserConfig {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\mukri2\\eclipse-workspace\\check\\src\\main\\java\\test\\check\\Browser");
		prop.load(fis);
	    String BrowserName=	prop.getProperty("Browser");
	
	    if 	(BrowserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mukri2\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
           }
        else if(BrowserName.equals("FireFox")) {
    	//
        	System.setProperty("webdriver.gecko.driver", "C:\\Users\\mukri2\\Downloads\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        	driver=new FirefoxDriver();
         }
        else if(BrowserName.equals("IE")) {
        	System.setProperty("webdriver.ie.driver","C:\\Users\\mukri2\\Downloads\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
    	    driver= new InternetExplorerDriver();
          }
	    driver.manage().window().maximize();
	return driver;

}
}
