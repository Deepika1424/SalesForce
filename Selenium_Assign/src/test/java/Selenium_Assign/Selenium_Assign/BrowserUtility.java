package Selenium_Assign.Selenium_Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserUtility {

	public static WebDriver driver = null;
	
	 static void launchBrowser(String sBrowser){
		
		if(sBrowser.startsWith("ch")) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hanuma\\Downloads\\chromedriver_win32_2020\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		
			
			
			
		else {
			System.out.println("You have not given browser type correctly");
		}
		
		driver.manage().window().maximize(); 
		driver.get("https://login.salesforce.com/"); 
		
	}

	static void quitBrowser(){
		driver.quit();
	}
	static void loginToBrowser()  {
		/*driver.get("https://login.salesforce.com/");
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("Deepikac.C@salesforce.com");  // action 1
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("test@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}*/
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("username"))));
		
							
		driver.findElement(By.id("username")).sendKeys("Deepikac.C@salesforce.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test@123");
		//String sText=driver.findElement(By.xpath("//img[@id='pwcapsicon']']")).getText();
			//	System.out.println(sText);
		//System.out.println(driver.findElement(By.xpath("//img[@id='pwcapsicon']")).getText());
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"))));
	}
	
	static void waitForPageElementToVisible(WebElement eleToWait) {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(eleToWait));
		
	}
}

