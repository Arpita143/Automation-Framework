package testNGdemo;

import javax.swing.JFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	WebDriver driver;
	
	 @BeforeClass
	  public void invokeDriver() {
		 System.setProperty("webdriver.chrome.driver", 
				 "G:\\selenium1\\chromedriver.exe");
			 driver = new ChromeDriver();
	  }
	 
	
	 @Test (priority = 0)
	  public void verifyTitle() throws InterruptedException {		
			driver.get("http://newtours.demoaut.com/");			
			driver.manage().window().maximize();		
			Thread.sleep(5000);
	  }
	 
	 
	
	 @Test (priority = 1)
	 @Parameters({"username", "password" })//doubt
	  public void VerifyUserNameAndPassword(String user , String passwd) {
		 driver.findElement(By.name("userName")).sendKeys(user);
		 driver.findElement(By.name("password")).sendKeys(passwd);
	  }
	

	
	
	
	
	
	

}
