package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase18 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
	   driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	}
}
