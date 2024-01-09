package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click(); -> parent to child traverse
		driver.findElement(By.xpath("//*[text()='From']")).click();
		System.out.println("Clicked From");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Hyderabad");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//*[text()='To']")).click();
	    System.out.println("Clicked To");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys("Jaipur");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@placeholder='To']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
