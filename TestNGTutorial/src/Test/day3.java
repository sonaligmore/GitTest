package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	
	@Parameters({"URL","APIKey"})	
	@Test
	public void MbileCarloan(String urlname,String key)
	{
		System.out.println("mobilecarloan ");
		System.out.println(urlname);
		System.out.println(key);
		}
	
	@Test(dataProvider="getData")
	public void SignIn(String urlname,String pwd)
	{
		System.out.println(urlname);
		System.out.println(pwd);
	}
	
@Test
public void MbileloginCarloan()
{
	System.out.println("mobilelogincarloan ");

	}

@Test(groups={"smoke"})
public void WebloginCarloan()
{
	System.out.println("weblogincarloan");

	
	}

@BeforeMethod
public void Bfmethod()
{
	System.out.println("Execute before every method ");

	
	}

@Test(dependsOnMethods={"WebloginCarloan"})
public void LoginAPIcarloan()
{
	System.out.println("loginAPIcarloan");

	}


@BeforeSuite
public void bfsuite()
{
	System.out.println("Before suit");

	
	}
@DataProvider
public Object[][] getData()
{

Object[][] data =new Object[3][2];

data[0][0]="First Uname";
data[0][1]="FirstPassword";

data[1][0]="Second Uname";
data[1][1]="SecondPassword";

data[2][0]="Third Uname";
data[2][1]="ThirdPassword";

return data;
}


}
