
package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_Assign.Selenium_Assign.BrowserUtility;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase32 extends BrowserUtility {
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
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		   driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		   driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='con4']")));
		   driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")));
		   driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
		  

	}
}
