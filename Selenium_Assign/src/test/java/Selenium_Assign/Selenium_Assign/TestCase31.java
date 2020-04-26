package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_Assign.Selenium_Assign.BrowserUtility;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase31 extends BrowserUtility {
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
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		   
		   
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		   driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCD");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
		   driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")));
		   driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']")).click();
		  
	}
}

		   