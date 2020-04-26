package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_Assign.Selenium_Assign.BrowserUtility;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase29 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
	   driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'accc')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'accc')]")).click();
		   
		   WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'accc')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()",ele);
				Thread.sleep(5000);
				
				
				
		   
		  
	   
	}
}