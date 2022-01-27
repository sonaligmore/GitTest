package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	@Test
	public void FTest()
	{
		System.out.println("byee ");
		System.out.println("byee 2");
		System.out.println("byee 3");

	}
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first ");
		System.out.println("I will execute first ");
		
	}
}
