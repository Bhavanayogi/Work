package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertionsEx {
	
//	Types of Assertions:
//
//		1) Hard Assertion
//		2) Soft Assertion
//	

//Hard Assertions
//1) Assert.assertTrue()
//2) Assert.assertFalse()
//3) Assert.assertEquals()

	
	@Test
	
	public void assertEquals1()
	
	{
		Assert.assertEquals(12, 13);
		
	}
	
	@Test
	
	public void assertEquals2()
	
	{
		Assert.assertEquals(12, 12,"The links count is not matching"); // preferred assertion over above one.
	}
	
	@Test
	
	public void assertEquals3()
	
	{
		Assert.assertEquals("Praveen", "Kumar", "The words does not match");
	}
	
	//assertNotEquals
	//assertNotEquals is used to verify if two data values are not equal. 
	//It is just the opposite of the functioning of assertEquals Assertion.
	
	@Test
	
	public void assertNotEquals1()
	{
		Assert.assertNotEquals(12, 12,"Failed as both the values are equal");
	}
	
	@Test
	
	public void assertTrue1()
	{
		String str="Welocme to Java";
		Assert.assertTrue(str.contains("java"));
	}
	
	@Test
	
	public void assertTrue2()
	{
		Assert.assertTrue(false);
	}
	

	
	@Test
	
	public void assertFalse1()
	{
		Assert.assertFalse(false);
	//ex - Assert.assertFalse(SignIn.isDisplayed());		
	}
	
	
	//assertNull 
	//This assertion is used to verify if an object has a null return value. In other words, it checks if the result is null. 
	//When the object is Null, the assertion is passed without any exception.
	
	@Test
	
	public void assertNull()
	{
		Assert.assertNull(true);
	}
	
	
	
	@Test
	
	public void assertNotNull()
	{
		Assert.assertNotNull(true);
	}
	
	
	@Test
	
	public void assertSame()
	{
		Assert.assertSame("abc","xyz", "The values are not same");
	}
	
	
	@Test
	
	public void assertNotSame()
	{
		Assert.assertNotSame("pqr", "abc");
	}
	
	
	
}
