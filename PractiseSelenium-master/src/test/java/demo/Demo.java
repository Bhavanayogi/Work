package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,6);
		driver.get("https://login.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp");
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Hello");
		driver.findElement(By.cssSelector("#password")).sendKeys("Test");
		driver.findElement(By.id("Login")).sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#error")));
		String a = driver.findElement(By.cssSelector("#error")).getText();
		System.out.println(a);
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().back();
		// System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.quit();

	}

}
