package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException
	{
//System.setProperty("webdriver.chrome.driver","C:/Praveen/ChromeDriver/chromedriver.exe");
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://google.co.in");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div/div/div/input")).sendKeys("Selenium");
//driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("Selenium");
System.out.println(driver.getTitle());
Thread.sleep(2000);
driver.quit();

	}

}
