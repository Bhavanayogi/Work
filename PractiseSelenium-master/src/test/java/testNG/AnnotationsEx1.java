package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationsEx1 {
	
	
	@BeforeSuite()
	public void BeforeSuite() {
		System.out.println("Execute Before Suite");
	}

	@AfterSuite()
	public void AfterSuite() {
		System.out.println("Execute After Suite");
	}

	@BeforeTest()
	public void BeforeTest() {
		System.out.println("Execute Before Test");
	}

	@AfterTest()
	public void AfterTest() {
		System.out.println("Execute After Test");
	}
	
	@BeforeMethod()
	public void BeforeMethod() {
		System.out.println("Execute Before Method");
	}
	
	@AfterMethod()
	public void AfterMethod() {
		System.out.println("Execute After Method");
	}

	@BeforeClass()
	public void BeforeClass() {
		System.out.println("Execute Before Class");
	}
	
	@AfterClass()
	public void AfterClass() {
		System.out.println("Execute After Class");
	}
	
}
