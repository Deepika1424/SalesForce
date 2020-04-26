package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase11 extends BrowserUtility {
	

	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	
	waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
    driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
    Thread.sleep(2000);

  
    waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
    Thread.sleep(2000);
    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
    driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Deepu");
    Thread.sleep(2000);
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
    driver.findElement(By.xpath("//input[@id='devname']")).click();
    Thread.sleep(2000);
    waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")));
    driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']")).click();
    Thread.sleep(2000);
    
    
	}
}
    
