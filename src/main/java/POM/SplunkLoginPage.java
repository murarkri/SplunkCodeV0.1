package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SplunkLoginPage {

	public WebDriver driver;
	 By userName=By.xpath("//input[contains(@id,'username')]");
	 By pwd=By.xpath("//input[contains(@id,'password')]");
	 By Login =By.xpath("//input[contains(@value,'Sign In')]");
	 public SplunkLoginPage(WebDriver driver) {
		 this.driver=driver;
	 }
	 public WebElement UN() {
		 return driver.findElement(userName);
	 }
	 public WebElement Password() {
		 return driver.findElement(pwd);
		 
	 }
	 public WebElement Login() {
		 return driver.findElement(Login);
	 }
}
