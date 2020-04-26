package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Selenium_Assign.Selenium_Assign.BrowserUtility;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase35 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//img[@class='allTabsArrow']")));
	   driver.findElement(By.xpath("//img[@class='allTabsArrow']")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='customize']")));
		   driver.findElement(By.xpath("//input[@name='customize']")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//option[contains(text(),'Card Payment Methods')]")));
		   driver.findElement(By.xpath("//option[contains(text(),'Card Payment Methods')]")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")));
		   driver.findElement(By.xpath("//img[contains(@class,'leftArrowIcon')]")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")));
		   driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]")).click();
		   Thread.sleep(2000);
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNavButton']")));
		   driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		   Thread.sleep(2000);
		   
		   launchBrowser("ch");
			loginToBrowser();

		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("")));
		   driver.findElement(By.xpath("")).click();
		   waitForPageElementToVisible(driver.findElement(By.xpath("")));
		   driver.findElement(By.xpath("")).click();
		   waitForPageElementToVisible(driver.findElement(By.xpath("")));
		   driver.findElement(By.xpath("")).click();
	    
	    
	    
	    
	    
	    
	    
	}
}
