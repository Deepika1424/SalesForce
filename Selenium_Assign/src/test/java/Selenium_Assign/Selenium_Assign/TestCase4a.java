package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase4a {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = null;
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver(); 
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		WebElement Username=driver.findElement(By.id("username"));
		Username.sendKeys("Deepikac.C@salesforce.com");  // action 1
		Thread.sleep(3000);
		WebElement forgotpassword=driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
        System.out.println("forgotpassword= "+forgotpassword.isEnabled());
        forgotpassword.click();
        WebElement Username1=driver.findElement(By.id("un"));
		Username1.sendKeys("Deepikac.C@salesforce.com");
        
       driver.findElement(By.xpath("//input[@id='continue']")).click();
}
}