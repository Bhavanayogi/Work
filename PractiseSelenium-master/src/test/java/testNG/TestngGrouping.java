package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngGrouping {
	
	@Parameters({"URL"})
	@Test
	public void demo(String url)
	{
		System.out.println("This is 2nd testNG demo class");
		System.out.println(url);
	}

	@Test(groups= {"smoke"})
	//@Test
	public void demo2()
	{
		System.out.println("This is smoke group method in testNG demo class");
	}
	
	@Test(groups= {"Regression"})
	
	public void demo3()
	{
		System.out.println("This is Regression group method in testNG demo class");
	}
	
}
