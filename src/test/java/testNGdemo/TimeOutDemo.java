package testNGdemo;

import org.testng.annotations.Test;

public class TimeOutDemo {
	
	 @Test (timeOut = 6000)
	  public void testA() throws InterruptedException {
		  System.out.println("test A");
		  Thread.sleep(5000);
	  }
	  

}
