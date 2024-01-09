package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsdemo1 {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver","C:\\Praveen\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//Webdriver driver=new FirefoxDriver();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement moveEle= driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")); //optimizing below step
		WebElement ele2= driver.findElement(By.xpath("//span[contains(text(),'Your Account')]"));
		a.moveToElement(moveEle).moveToElement(ele2).click().perform();
		//Thread.sleep(2000);
		//a.moveToElement(ele2).click().perform();
driver.navigate().back();
		Thread.sleep(3000);
		driver.quit();		











	}

}
