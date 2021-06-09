package testNGdemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTest {
	
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am in  before beforeSuite SmokeTest");
	 }
	
	
	
	@BeforeTest
	  public void beforeTest() {
		  System.out.println("I am in  before Test of SmokeTest");
	  }
	
	
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am in before class of SmokeTest");
	  }
	
	
	 @Test 
	  public void smoketestcase() {
		  System.out.println("I am in smoketestcase");
	  }
	 
	 
	
	
	  

}
