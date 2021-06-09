package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void invokeDriver() {
		 System.setProperty("webdriver.chrome.driver",
					"G:\\selenium1\\chromedriver.exe");
	driver=new ChromeDriver();}
	 
	
	 @Test 
	  public void verifyTitle() throws InterruptedException {
		
			driver.get("http://newtours.demoaut.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
	  }
	 
	 
	 @Test (dependsOnMethods = "verifyTitle" )
	  public void VerifyUserNameAndPassword() {
		 driver.findElement(By.name("userName")).sendKeys("batman");
		 driver.findElement(By.name("password")).sendKeys("batman");
	  }
	

}
