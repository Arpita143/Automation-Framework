package testNGdemo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class ReadTestData {
	
	@DataProvider(name="get-test-data-method")
	public Object[][] readTestData(){
		
		HashMap m = new HashMap();
		m.put("username", "batman");
		m.put("password", "abc");
		m.put("username1", "dharm");
		m.put("password1", "xyz");
		
		
		
		Object [] []  result = new Object[1][];
		result[0] = new Object[] {m};
		
		return result;
		
	}
	
	

}
