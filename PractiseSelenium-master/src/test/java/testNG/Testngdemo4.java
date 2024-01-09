package testNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Testngdemo4 {

	
	@Test

	public void test1() {
		System.out.println("Ryt now inside test1");
		Assert.assertTrue(false);
	}

	@Parameters({"URL", "Username"})
	@Test

	public void test2(String urlname, String key) {
		System.out.println("Ryt now inside test2");
		System.out.println(urlname);
		System.out.println(key);
	}

	
	@Test(dataProvider="getData")

	public void test3(String username,String password) {
		System.out.println("Ryt now inside test3");
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username & password 
		//2nd combination - username & password
		//3rd combination - username & password
		
		Object[][] data = new Object[3][2];
		data[0][0]= "username1";
		data[0][1]= "password1";
		
		data[1][0]= "username2";
		data[1][1]= "password2";
		
		data[2][0]= "username3";
		data[2][1]= "password3";
		return data;
	}

}
