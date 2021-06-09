package testNGdemo;

import org.testng.annotations.Test;

public class EnabledDemo {
	
	
	  @Test (enabled=true)
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
	
	

}
