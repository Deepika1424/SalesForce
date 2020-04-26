package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase23 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
	   driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")));
	    driver.findElement(By.xpath("//option[contains(text(),\"Today's Leads\")]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")));
	    driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")).click();
	   
	   
	}
}