package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngdemo1 {
	// in TestNG all the methods execution is done based on alphabetical order
	
	@BeforeClass   // its scope is till class level
	
	public void beforclass()
	{
		System.out.println("Before executing any methods in the class");
	}

	@BeforeSuite  // its scope is till testNG level
	
		public void beforesuite()
		{
		System.out.println("This is executed before suite");
		
		}
	
	
	@AfterTest
	public void aftertestmethod() {
		System.out.println("This is AFterTest");
	}
	
	@Test
	public void fun1() {

		System.out.println("Hello Using TestNG");
		
	}

	@BeforeTest //  This will execute before the actual test executes 
	            //& the scope is limited to particular Test only

	public void beforeTest() {
		System.out.println("This is beforeTest");
	}
	
	@BeforeMethod  // its scope is till class level
	
	public void beforeverymethod()
	{
		System.out.println("This will be executed before every method");
	}
	@AfterMethod
	
	public void afterevery()
	{
		System.out.println("This will be executed after every method");
	}
	
	@Test
	public void fun2() {
		System.out.println("This is second testcase");
	}

	@Test
	public void thirdmethod() {
		System.out.println("This the 3rd method");
	}
	
	@AfterSuite
	
	public void aftersuite()
	{
		System.out.println("This is executed after suite");
	}
	
	@AfterClass()
		public void afterclass()
		{
			System.out.println("After executing all methods in the class");
		}
	}

