package TestPackage;

import org.testng.annotations.Test;


public class Basics3 {
	
	@Test(groups="Smoke") 
	public void Carlogin()
	{
		//selenium code for weblogin
 System.out.println("web login carloan");
	}

	@Test
	public void mobilehomelogin()
	{
		//appium code
		System.out.println("mobile login carloan");
	}
	
	@Test
	public void mobileapilogin()
	{
		//rest api code
		System.out.println("api login carloan");
		
	}
	
	
}

