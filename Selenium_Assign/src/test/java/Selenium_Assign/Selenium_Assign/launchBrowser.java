package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Selenium_Assign.Selenium_Assign.BrowserUtility;
import java.util.concurrent.TimeUnit;

	
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class launchBrowser {

		public static void main(String[] args) throws Exception {
			
						WebDriver driver = null;
			WebDriverManager.chromedriver().setup();
		
			
			driver = new ChromeDriver(); 
			driver.get("https://www.google.com");
			
			
			driver.manage().window().maximize();
			
			driver.get("https://login.salesforce.com/");
			Thread.sleep(5000);
			WebElement email=driver.findElement(By.id("username"));
			email.sendKeys("Deepikac.C@salesforce.com");  // action 1
			
			
			
			
			WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("test@123");
			password.clear();
			
			WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
			System.out.println("Login button= "+loginButton.isEnabled());
			loginButton.click();
			
			Thread.sleep(5000);
			
								}

	}