package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingHiddenElements {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('displayed-text').value='Testing';"); // To Enter value in a text field
		// To get the value of that hidden field use below step
		String s = ((JavascriptExecutor)driver).executeScript("return document.getElementById('displayed-text').value").toString();
	    System.out.println(s);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
		
		
		
		
		
		
		
		

	}

}
