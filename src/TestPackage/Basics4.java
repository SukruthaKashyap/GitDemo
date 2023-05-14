package TestPackage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics4 {
		
		@Test
		public void webloginHome()
		{
			//selenium code for weblogin
	 System.out.println("web login homeloan");
		}

		@Test
		public void mobilelogin()
		{
			//appium code
			System.out.println("mobile login homeloan");
		}
		
		@Test(groups="Smoke") 
		public void apilogin()
		{
			//rest api code
			System.out.println("api login homeloan");
		}
		
		@BeforeSuite
		public void highpriority()
		{
			System.out.println("I am the BOSS");
		}
		
		@AfterSuite
		public void lastpriority()
		{
			System.out.println("I am the last one");
		}
		
		 @Parameters({"URL1"})
		@Test
		public void home(String uname2)
		{
			System.out.println("home loan");
			System.out.println(uname2);
		}
	}

