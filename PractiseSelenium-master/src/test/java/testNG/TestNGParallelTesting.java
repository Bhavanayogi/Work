package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGParallelTesting {
	
	
		WebDriver driver = null;
		
		@Test
		
		public void test1() throws Exception {
			
			System.out.println("I'm inside the Test1 | "+ Thread.currentThread().getId());
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.close();
			
			}
	
	
	@Test
		
		public void test2() throws Exception {
			
			System.out.println("I'm inside the Test1 | "+ Thread.currentThread().getId());
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			Thread.sleep(4000);
			driver.close();
			
			}
	
	
	

}
