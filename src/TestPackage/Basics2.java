package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Basics2 {
	
	@Test(groups="Smoke") 
	public void demo3()
	{
		System.out.println("Sukrutha");
	
	}

	@BeforeTest
	public void prerequired()
	{
		System.out.println("I am executing this first as high priority");
	}
	
	@Test
	public void dummy()
	{
		System.out.println("Ashish");
		System.out.println("Ashish2");
		
	}
	
	@BeforeMethod
	public void repeatmethod()
	{
		System.out.println("Execute everytime before each test case");
	}
	
	@AfterMethod
	public void repeataftermethod()
	{
		System.out.println("Execute everytime after each test case");
	}
	
	@BeforeClass
	public void before()
	{
		System.out.println("execute this before all methods");
	}
	
	@AfterClass
	public void After()
	{
		System.out.println("execute this after all methods");
	}
	
	@Test
	public void personal()
	{
		System.out.println("Personal loan");
	}
	
    @Parameters({"URL2"})
	@Test
	public void home(String uname1)
	{
		System.out.println("home loan");
		System.out.println(uname1);
	}
}


