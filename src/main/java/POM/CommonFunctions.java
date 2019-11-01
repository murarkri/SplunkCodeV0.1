package POM;



import java.io.File;
import java.io.IOException;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {


	public  void ScreenShot(WebDriver driver, int i) throws IOException 
	{
		File source1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source1, new File("C:\\Users\\mukri2\\eclipse-workspace\\splunk_automation\\Screenshots\\Check"+ i +".png"));
	}
	
	public void expWait(WebDriver driver, WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 35);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}