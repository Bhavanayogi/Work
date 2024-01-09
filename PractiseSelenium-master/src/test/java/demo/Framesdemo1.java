package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesdemo1 {
	
	// We can switch to any frame in 3 methods

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		Thread.sleep(1000);
		
		// Method 1 > By frame attribute like name etc.
		
		//driver.switchTo().frame("iframeResult");
		
		// Method 2 > By frame index
		
		//driver.switchTo().frame(0);
		
		// Method 3 > By xpath of iframe
		
		WebElement iframe= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Tester");
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
