package hello;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	@Parameters({"a","b"})
	
	public void add(int a,int b) {
		
		System.out.println(a+b);
		
	}

}
