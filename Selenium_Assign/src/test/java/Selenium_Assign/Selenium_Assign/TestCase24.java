package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase24 extends BrowserUtility {
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
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
	    driver.findElement(By.xpath("//input[@name='new']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
	    driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='lea3']")));
	    driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
	    driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("")));
	    driver.findElement(By.xpath("")).click();
	   
	    waitForPageElementToVisible(driver.findElement(By.xpath("")));
	    driver.findElement(By.xpath("")).click();
	   

	   
	}
}