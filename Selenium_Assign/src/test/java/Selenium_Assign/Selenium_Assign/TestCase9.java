package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase9 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
    driver.findElement(By.xpath("//div[@id='userNav']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    Thread.sleep(2000);


}
}