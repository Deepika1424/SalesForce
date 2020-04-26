package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase16 extends BrowserUtility {
	public static void main(String[] args) throws Exception {
		

	launchBrowser("ch");
	loginToBrowser();

	WebDriver driver = BrowserUtility.driver;
	Thread.sleep(2000);
	 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
	   driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
	   Thread.sleep(2000);
	   
	   waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
	    driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
	    Thread.sleep(2000);
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		   driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		
		
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp3']")));
		   driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("abbbb");
		
		
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp4']")));
		   driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("ABCD");
	    
		   waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'4')]")));
		   driver.findElement(By.xpath("//a[contains(text(),'4')]")).click();
		   
		  // waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(@class,'calToday')]")));
		   //driver.findElement(By.xpath("//a[contains(@class,'calToday')]")).click();
	    
		   waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='opp11']")));
		   driver.findElement(By.xpath("//select[@id='opp11']")).click();
		   Thread.sleep(2000);
	    
		   waitForPageElementToVisible(driver.findElement(By.xpath("//option[contains(text(),'Qualification')]")));
		   driver.findElement(By.xpath("//option[contains(text(),'Qualification')]")).click();
	    
		   waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='opp6']")));
		   driver.findElement(By.xpath("//select[@id='opp6']")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//option[contains(text(),'Web')]")));
		   driver.findElement(By.xpath("//option[contains(text(),'Web')]")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp12']")));
		   driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("0.1");
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='opp17_lkwgt']//img[@class='lookupIcon']")));
		   driver.findElement(By.xpath("//a[@id='opp17_lkwgt']//img[@class='lookupIcon']")).click();
		   
		   waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")));
		   driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]")).click();

	    
	    
	}
}
