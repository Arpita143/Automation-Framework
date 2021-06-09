package testNGdemo;

import org.testng.annotations.Test;

public class DependsOnMethodsDempPart2 {
	
	  @Test 
	  public void testA() {
		System.out.println(10/0); // AE
		  System.out.println("test A");
	  }
	  
	  @Test (dependsOnMethods = "testA" , alwaysRun = true)
	  public void testB() {
		  System.out.println("test B");
	  }
	  
	  
	  @Test (dependsOnMethods = "testB", alwaysRun = true)
	  public void testC() {
		  System.out.println("test C");
	  }
	  
	  
	//==================================================  
	  @Test  (dependsOnMethods = {"testA","testB"},alwaysRun=true )
	  public void testD() {
		  System.out.println("test D");
	  }
	  
	  @Test  (dependsOnMethods = "launchBrowser", ignoreMissingDependencies = true)
	  public void testE() {
		  System.out.println("test E");
	  }

}
