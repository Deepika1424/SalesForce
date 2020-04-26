package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase12 extends BrowserUtility {
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
    
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
    driver.findElement(By.xpath("//select[@id='fcf']")).click();
    Thread.sleep(2000);
   
    waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'fBody')]")));
    driver.findElement(By.xpath("//span[contains(@class,'fBody')]")).click();
    //Thread.sleep(2000);
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")));
    driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Deepu1");
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
    driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("1");
    
    
    //waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")));
    //driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcol1']")));
    driver.findElement(By.xpath("//select[@id='fcol1']")).click();

   waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Number')]")));
    driver.findElement(By.xpath("//select[@id='fcol1']//option[contains(text(),'Account Number')]")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fop1']")));
    driver.findElement(By.xpath("//select[@id='fop1']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fval1']")));
    driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("a");
    Thread.sleep(5000);
    waitForPageElementToVisible(driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/form/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")));
    driver.findElement(By.xpath("//body/div/div/table/tbody/tr/td/div/form/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
    
   
    
    
	}
}