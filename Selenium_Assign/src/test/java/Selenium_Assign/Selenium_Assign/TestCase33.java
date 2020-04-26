package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_Assign.Selenium_Assign.BrowserUtility;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase33 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
	   driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Deepikac C')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'Deepikac C')]")).click();
		  
	}
}

	    