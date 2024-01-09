package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingTimeTaken {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		long startTime = System.currentTimeMillis();
		System.out.println("The starting time is::"+startTime);
		driver.get("https://sat.propertyware.com/pw/login.jsp?");
		driver.findElement(By.id("loginEmail")).sendKeys("sam@texasrenters.com");
		driver.findElement(By.name("password")).sendKeys("Realpage12");
		driver.findElement(By.xpath("//input[@value='Sign Me In']")).click();

		long stopTime = System.currentTimeMillis();
		System.out.println("The stopping time is::"+stopTime);
		long diff= stopTime-startTime;

		System.out.println("Time take is :: "+diff+" millisecondsl");

	}

}
