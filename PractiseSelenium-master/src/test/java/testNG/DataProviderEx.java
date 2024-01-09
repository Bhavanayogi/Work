package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DataProviderEx {


	@Test(dataProvider = "login")

	public void login(String username, String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver d = new ChromeDriver();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.id("user-name")).sendKeys(username);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("login-button")).click();

		Thread.sleep(3000);

		  String actual =d.findElement(By.xpath("//span[text()='Products']")).getText();
		  String exp= "PRODUCTS";
		  Assert.assertEquals(exp, actual,"The expected value is not matching");
		  
		  d.quit();

	}

	@DataProvider(name = "login")

	public Object[][] testData()

	{

		return new Object[][] {

				{ "standard_user", "secret_sauce" }, 
				{ "problem_user", "secret_sauce" }, 
				{ "performance_glitch_user", "secret_sauce" }

		};

	}

}
