package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelDataConfig;

public class DataDrivenDemo1 {

	WebDriver driver;
	WebDriverWait wait;
	String sheetPath = "C:\\Praveen\\AutomationTestData.xlsx";

	@BeforeTest
	public void intialize() throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sat.propertyware.com/pw/login.jsp");
		//driver.wait(5);

	}

	@Test(dataProvider = "loginData")

	public void loginTest(String username, String password) throws InterruptedException {
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginEmail']")));
		driver.findElement(By.xpath("//input[@id='loginEmail']")).sendKeys(username);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button login-button']")));
		driver.findElement(By.xpath("//input[@class='button login-button']")).click();
		Thread.sleep(2000);

	}

	@DataProvider(name = "loginData")
	public Object[][] login() {

		ExcelDataConfig config = new ExcelDataConfig(sheetPath);

		int rows = config.getRowCount(0);

		Object[][] data = new Object[rows][2];

		for (int i = 1; i < rows; i++) {

			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
		}

		/*
		 * Object[][] data = new Object[3][2];
		 * 
		 * data[0][0] = "username"; data[0][1] = "password";
		 * 
		 * data[1][0] = "seth@expressrealtyok.com"; data[1][1] = "Realpage12";
		 * 
		 * data[2][0] = "sat@nomail.com"; data[2][1] = "Realpage12";
		 */

		return data;
	}

	@AfterTest

	public void teardown() {
		driver.quit();
		driver = null;
	}

}
