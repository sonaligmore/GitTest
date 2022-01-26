package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day4 {
	@Test
	public void MbileloginHomeloan()
	{
		System.out.println("MbileloginHomeloan ");
		}

	@BeforeClass
	public void BfClass()
	{
		System.out.println("Execute before class ");
		}
	
	@Test
	public void WebloginHomeloan()
	{
		System.out.println("WebloginHomeloan");

		
		}

	@Test
	public void LoginAPIHomeloan()
	{
		System.out.println("LoginAPIHomeloan");

		}
}
