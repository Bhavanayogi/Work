package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utils.ExlReader;



public class DataDrivenApproach2 {

	WebDriver driver;
	WebDriverWait wait;
	ExlReader xlr;

	@BeforeTest
	public void intialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Onedrive\\OneDrive - RealPage\\SE\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sat.propertyware.com/pw/login.jsp");

	}

	@Test

	public void loginTest() throws Exception {
		wait = new WebDriverWait(driver, 15);
		
		xlr = new ExlReader();
		xlr.setExcelSheet("AutomationTestData", "login");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginEmail']")));
		driver.findElement(By.xpath("//input[@id='loginEmail']")).sendKeys(xlr.getCellData(1, "username"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(xlr.getCellData(1, "password"));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button login-button']")));
		driver.findElement(By.xpath("//input[@class='button login-button']")).click();
		Thread.sleep(2000);

	}



	@AfterTest

	public void teardown() {
		driver.quit();
		driver = null;
	}

}
