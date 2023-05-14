package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basics5 {
	
	@Test(dataProvider="getdata")
	public void demo(String Username, String password)
	{
		System.out.println("Multiple data set");
		System.out.println(Username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st combination - user name & pwd - good credit history
		//2nd combo - UN & PWD - no credit history
		//3rd combo - UN & PWD - fraudelent credit history
		
		//define the multi dimensional object array
		
	   Object[][] data = new Object[3][2]; //3 combinations & 2 data to be passed i.e UN & PWD
	   
	   //1st set
	   data[0][0]="firstUN";
	   data[0][1]="firstPWD";
	   //2nd set
	   data[1][0]="SecondUN";
	   data[1][1]="Secondpwd";
	   //3rd set
	   data[2][0]="thirdUN";
	   data[2][1]="thirdPWD";
	   
		return data;
	}
}


