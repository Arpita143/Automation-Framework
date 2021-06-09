package testNGdemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnoationsDemo {

@BeforeTest
  public void beforeTest() {
	  System.out.println("I am in  before Test of AnnoationsDemo");
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in before class in AnnoationsDemo");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("I am in after class");
  }
		  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in before Method");
  }
	  
	
  @Test 
  public void testA() {
	  System.out.println("test A");
  }
  
  @Test 
  public void testB() {
	  System.out.println("test B");
  }
  
  
  @Test 
  public void testC() {
	  System.out.println("test C");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in after Method");
  }
	  
  
  
}
