package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Selenium_Assign.Selenium_Assign.BrowserUtility;

public class TestCase14 extends BrowserUtility {
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
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
    driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen148']")));
    driver.findElement(By.xpath("//img[@id='ext-gen148']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']")));
    driver.findElement(By.xpath("//div[@class='x-combo-list-item x-combo-selected']")).click();
    //Select From Date
    waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen152']")));
    driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
    
   
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"ext-gen281\"]")));
    driver.findElement(By.xpath("//*[@id=\"ext-gen281\"]")).click();
    //Select To Date
    
   
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen154']")));
    driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
  waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"ext-gen290\"]")));
    driver.findElement(By.xpath("//*[@id=\"ext-gen290\"]")).click();
    waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"ext-gen296\"]")));
    driver.findElement(By.xpath("//*[@id=\"ext-gen296\"]")).click();
    //waitForPageElementToVisible(driver.findElement(By.xpath("//*[@id=\"ext-gen300\"]/tbody/tr[7]/td/button[1]")));
    //driver.findElement(By.xpath("//*[@id=\"ext-gen300\"]/tbody/tr[7]/td/button[1]")).click();
    
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//button[@id='ext-gen300']")));
    driver.findElement(By.xpath("//button[@id='ext-gen300']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//button[@id='ext-gen49']")));
    driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
    driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("abcde");
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
    driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("//button[@id='ext-gen335']")));
    driver.findElement(By.xpath("//button[@id='ext-gen335']")).click();
    
    waitForPageElementToVisible(driver.findElement(By.xpath("")));
    driver.findElement(By.xpath("")).click();
    
    
	}
}

