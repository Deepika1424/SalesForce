package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {


public static void main(String[] args) throws Exception {
	
	WebDriver driver = null;
WebDriverManager.chromedriver().setup();


driver = new ChromeDriver(); 
driver.get("https://www.google.com");


driver.manage().window().maximize();

driver.get("https://login.salesforce.com/");
Thread.sleep(2000);

WebElement email=driver.findElement(By.id("username"));
email.sendKeys("Deepikac.C@salesforce.com");  // action 1
Thread.sleep(3000);
WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("test@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@id='rememberUn']")).click();

driver.findElement(By.xpath("//input[@id='Login']")).click();
//System.out.println("please enter your password");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='userNavButton']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

//driver.findElement(By.xpath("//input[@id='username']")).click();

}
}

