package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase25 extends BrowserUtility {
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
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		   driver.findElement(By.xpath("//input[@name='new']")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		   driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("accc");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='con4']")));
		   driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("ABCD");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
		   driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
		  
	}
}