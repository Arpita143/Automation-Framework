package testNGdemo;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataproviderDemo extends ReadTestData{
	
	WebDriver driver;
	
	 @BeforeClass
	  public void invokeDriver() {
		 System.setProperty("webdriver.chrome.driver", 
					"G:\\selenium1\\chromedriver.exe");
			 driver = new ChromeDriver();
	  }
	 
	
	 @Test 
	  public void testA() throws InterruptedException {		
			driver.get("http://newtours.demoaut.com/");			
			driver.manage().window().maximize();		
			Thread.sleep(5000);
	  }
	 
	 
	
	 @Test (invocationCount = 2 , dataProvider="get-test-data-method")
	  public void testB(Map <String , String> testData) throws InterruptedException {
		 driver.findElement(By.name("userName")).sendKeys(testData.get("username"));
		 driver.findElement(By.name("password")).sendKeys(testData.get("password"));
		 Thread.sleep(7000);
		 
		 driver.findElement(By.name("userName")).clear();
		 driver.findElement(By.name("password")).clear();
		 
		 driver.findElement(By.name("userName")).sendKeys(testData.get("username"));
		 driver.findElement(By.name("password")).sendKeys(testData.get("password"));
		 Thread.sleep(7000);
		 
	  }
	

}
