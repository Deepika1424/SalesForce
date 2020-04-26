package Selenium_Assign.Selenium_Assign;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase6 extends BrowserUtility {
		
		public static void main(String[] args) throws Exception {
			

		launchBrowser("ch");
		loginToBrowser();

		WebDriver driver = BrowserUtility.driver;
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
	    driver.findElement(By.xpath("//div[@id='userNav']")).click();
	    Thread.sleep(2000);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
	    driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
	    Thread.sleep(2000);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
	    //driver.switchTo().frame(driver.findElement(By.id("1")));
		//Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//a[contains(text(),'About')]")).getText()); 
		

	    driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	    
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
	    driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
	    driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
	    
	    driver.findElement(By.xpath("//html")).sendKeys("Hello");
		//how to get the text in website
		String sText=driver.findElement(By.xpath("//html")).getText();
				System.out.println(sText);
		System.out.println(driver.findElement(By.xpath("//html")).getText());
		
	    
	    waitForPageElementToVisible(driver.findElement(By.xpath("")));
	    driver.findElement(By.xpath("")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
	    driver.findElement(By.xpath("//div[@id='userNav']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
	    driver.findElement(By.xpath("//div[@id='userNav']")).click();

	}
	}

