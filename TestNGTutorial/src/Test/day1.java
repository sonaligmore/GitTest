package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterTest
	public void endDemo()
	{
	System.out.println("Execute last ");
	}
	
@Test
	public void Demo()
	{
	System.out.println("Hello ");
	}

@Test(groups={"smoke"})
public void Demo1()
{
	System.out.println("welcome ");
	}

@AfterSuite
public void afsuite()
{
	System.out.println("After suit");

	
	}
}
