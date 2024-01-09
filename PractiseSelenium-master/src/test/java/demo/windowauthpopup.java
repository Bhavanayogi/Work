package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowauthpopup {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Praveen\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//use-> https://Username:Password@SiteURL
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Basic Auth")).click();

	}

}
