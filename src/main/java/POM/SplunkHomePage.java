package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SplunkHomePage {
public WebDriver driver;
By DropDown=By.xpath("//button[contains(@data-test,'toggle')]");
By region=By.xpath("//button[contains(@data-selectable,'true')][3]");
By Submit=By.xpath("//button[@class='btn btn-primary']");
By Sis=By.xpath("//input[@type='text']"); 
By Status=By.xpath("//*[@id='statistics']/table/tbody/tr[1]/td[4]");

public SplunkHomePage(WebDriver driver) {
this.driver=driver;

}
public WebElement DropDown() {
	return driver.findElement(DropDown);
	}
public WebElement SelectRegion() {
	return driver.findElement(region);
}
public void Submit() {
	driver.findElement(Submit).click();
			}
public void Sis(String req) {
	driver.findElement(Sis).sendKeys(req);
}
public WebElement Status() {
	return driver.findElement(Status);

}
public WebElement ClearText() {
	return driver.findElement(Sis);
}
}

