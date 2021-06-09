package testNGdemo;

import javax.swing.JFrame;

import org.testng.annotations.Test;

public class Parrallel_DemoTest {
	
	@Test 
	  public void testA() throws InterruptedException {
	
		  JFrame jframe = new JFrame("First frame");
		  jframe.setLocation(100, 100);
		  jframe.setSize(400, 400);
		  jframe.setVisible(true);
		  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Thread.sleep(8000);
		  System.out.println("test A");
		  System.out.println(Thread.currentThread().getName());
	  }
	  
	  @Test 
	  public void testB() throws InterruptedException {
		  
		  JFrame jframe = new JFrame("First frame");
		  jframe.setLocation(100, 100);
		  jframe.setSize(400, 400);
		  jframe.setVisible(true);
		  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Thread.sleep(4000);
		  
		  System.out.println("test B");
		  System.out.println(Thread.currentThread().getName());
	  }
	  
	  
	  @Test 
	  public void testC() throws InterruptedException {
		  
		  JFrame jframe = new JFrame("First frame");
		  jframe.setLocation(100, 100);
		  jframe.setSize(400, 400);
		  jframe.setVisible(true);
		  jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  Thread.sleep(11000);
		  System.out.println("test C");
		  System.out.println(Thread.currentThread().getName());
	  }
	
	

}
