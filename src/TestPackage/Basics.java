package TestPackage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Basics {

	@Test(groups="Smoke") //test case1
	public void Wemo()
	{
	
		System.out.println("Sukku");

	}
	
	@Parameters({"URL","APIKey"})
	@Test 
	public void Demo2(String urlname , String Key)
	{
		System.out.println("Bye");
		System.out.println(urlname);
		System.out.println(Key);
	}
	
	
	@Test(dependsOnMethods={"Wemo","Demo4"})
	public void Demo3()
	{
		System.out.println("See you");
	}
	
	@Test
	public void Demo4()
	{
		System.out.println("Miss you");
		Assert.assertTrue(false);
	}
	
	
	@Test(enabled=false)
	public void Demo5()
	{
		System.out.println("Ashish");
	}
	
	@Test(timeOut = 4000)
	public void Demo6()
	{
		System.out.println("Nag");
	}
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("Execute this at last");
	}
	
	
}
