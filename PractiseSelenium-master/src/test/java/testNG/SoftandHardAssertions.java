package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftandHardAssertions {
	
	SoftAssert softassert1= new SoftAssert();
	
	@Test
	
	public void test()
	{
		
		System.out.println("Launch browser and navigate to the url");
		Assert.assertEquals(true, true);  //hard assertion
		
		System.out.println("Enter username and password");
		System.out.println("Click on login button");
		
		softassert1.assertEquals(true, true);  //soft assertion
		
		System.out.println("Validate Homepage");
		
		softassert1.assertEquals(true, false, "Homepage title is missing");
		
		System.out.println("Logout");
		
		softassert1.assertAll();  //at the end of the test cases we need to add this line
	}

}
