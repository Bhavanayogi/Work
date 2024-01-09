package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathsCSSDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Praveen\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/?ec=302&startURL=%2Fhome%2Fhome.jsp");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("my own xpath");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("my own CSS");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.close();
	}

}
