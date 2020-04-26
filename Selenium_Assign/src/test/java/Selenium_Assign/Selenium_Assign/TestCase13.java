package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase13 extends BrowserUtility {
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

    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
    driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
    Thread.sleep(2000);
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='srch']")));
    driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("ABCD");
    
    
    //waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbWizardBody')]//input[contains(@name,'srchbutton')]")));
    //driver.findElement(By.xpath("//div[contains(@class,'pbWizardBody')]//input[contains(@name,'srchbutton')]")).click();
   
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")));
    driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
    waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'goNext')]")));
    driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'goNext')]")).click();
    waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")));
    driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")).click();
    
    Alert al = driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	
    
    //waitForPageElementToVisible(driver.findElement(By.xpath("")));
   // driver.findElement(By.xpath("")).click();
   
    
	}
}
