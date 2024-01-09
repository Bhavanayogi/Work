package demo;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReusableMethods;

public class Verifydropdowns2 {

	@Test
	
	public void compareDDvalues() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		Thread.sleep(2000);
		
		WebElement months=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		
		ReusableMethods rm= new ReusableMethods();
		
		List<String> actualvalues =rm.getDropDownOptionsAsList(months);
		
		
		List<String> expectedlvalues = Arrays.asList("January","February","March","April","May","June","July","August",
				                                     "September","October","November","December");
		
		
		Assert.assertEquals(actualvalues, expectedlvalues,"Error in Drop-Down options comparision");
		System.out.println("Comparision is successfull");
		Thread.sleep(2000);
		driver.quit();
	}

}
