package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemo {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void invokeDriver() {
		 System.setProperty("webdriver.chrome.driver", 
					"D:\\SeleniumEthans_Jan_Batch\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
	  }
	 
	
	 @Test (priority = 0)
	  public void verifyTitle() throws InterruptedException {
		
			driver.get("http://newtours.demoaut.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
	  }
	 
	 
	 @Test (priority = 1)
	  public void VerifyUserNameAndPassword() {
		 driver.findElement(By.name("userName")).sendKeys("batman");
		 driver.findElement(By.name("password")).sendKeys("batman");
	  }
	
	 
}
