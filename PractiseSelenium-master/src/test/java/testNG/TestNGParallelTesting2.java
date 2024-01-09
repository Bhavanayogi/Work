package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParallelTesting2 {
	
	
	WebDriver driver = null;
	
	@Parameters("browser")
	@BeforeTest
	
	public void setup(String browser) {
		
		System.out.println("Browser name is: "+ browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		
		else if(browser.equalsIgnoreCase("FF"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		}
		
		
		else if(browser.equalsIgnoreCase("IE"))
		{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		}
		
	}
	
	
	@Test
	
	public void test1() throws Exception {
		
		driver.get("https://google.co.in");
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	
	public void tearDown() {
		
		driver.close();
		System.out.println("Test completed");
		
	}
	
}
