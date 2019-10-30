package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StatusCheck {
//public WebDriver driver;
By Status1= By.xpath("//*[@id='statistics']/table/tbody/tr[1]/td[4]");
By Status = By.xpath("//div[@class='viz-controller']");
By Status2=By.xpath("//*[@id='statistics']/table/tbody/tr[2]/td[4]");
By Status3= By.xpath("//*[@id='statistics']/table/tbody/tr[3]/td[4]");
By Status4=By.xpath("//*[@id='statistics']/table/tbody/tr[4]/td[4]");

	/*
	 * public StatusCheck(WebDriver driver) { this.driver=driver; }
	 */

public WebElement FirstRow(WebDriver driver) {
return driver.findElement(Status1);
}

public WebElement SecondRow(WebDriver driver) {
	return driver.findElement(Status2);
}

public WebElement ThridRow(WebDriver driver) {
	return driver.findElement(Status3);
}
public WebElement FourthRow(WebDriver driver) {
	return driver.findElement(Status4);
}
public WebElement Status(WebDriver driver)
{
	return driver.findElement(Status);
}

}

