package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aa {
	
	
public static void main(String[] args) throws InterruptedException {
	


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	System.out.println("Title of the page:" + driver.getTitle());
	System.out.println("URL of the page:" + driver.getCurrentUrl());
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(1000);
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	String actual = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	//System.out.println(actual);
	String exp = "Dashboard";
	
	if(exp.equalsIgnoreCase(actual))
	{
		
		System.out.println("Logged in successfully");
	}

}

}
