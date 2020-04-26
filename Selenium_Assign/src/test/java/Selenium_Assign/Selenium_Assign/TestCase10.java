package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase10 extends BrowserUtility {
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
    
 waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
   driver.findElement(By.xpath("//input[@name='new']")).click();
   Thread.sleep(2000);
   
   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='acc2']")));
   driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("ABCD");
   
   waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='acc6']")));
   driver.findElement(By.xpath("//select[@id='acc6']")).click();
   
   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id='acc6']/option[7]")));
   driver.findElement(By.xpath("//*[@id='acc6']/option[7]")).click();
   Thread.sleep(2000);
   waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='00N5w00000HXIet']")));
   driver.findElement(By.xpath("//select[@id='00N5w00000HXIet']")).click();
   Thread.sleep(2000);
   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"00N5w00000HXIet\"]/option[2]")));
   driver.findElement(By.xpath("//*[@id=\"00N5w00000HXIet\"]/option[2]")).click();
   
   waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
   driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
   
   
   Thread.sleep(5000);

}
}