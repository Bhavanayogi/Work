package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleelementException {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/");
		Thread.sleep(2000);
		WebElement link= driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
		link.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//link.click();
		
		// let say now we are getting StaleElementException
		// Use try catch to handle this
		
		try {
			
			link.click();
		}
		catch (StaleElementReferenceException e) {
			
			link= driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
			link.click();
			System.out.println("Clicked on pricing successfully");
		}
		
		
	}

}
