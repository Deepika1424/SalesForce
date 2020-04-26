package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase22 extends BrowserUtility {
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
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
	    driver.findElement(By.xpath("//select[@id='fcf']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']//option[contains(text(),'My Unread Leads')]")));
	    driver.findElement(By.xpath("//select[@id='fcf']//option[contains(text(),'My Unread Leads')]")).click();
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    Thread.sleep(2000);
	    launchBrowser("ch");
		loginToBrowser();
		
		// waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		   Thread.sleep(2000);
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		    Thread.sleep(2000);
		    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		    driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();

	    
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("")));
	    driver.findElement(By.xpath("")).click();
	   

	    
	    
	    
	}
}