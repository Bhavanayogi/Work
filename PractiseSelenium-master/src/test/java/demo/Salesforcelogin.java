package demo;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testNG.Globaldemo1;

public class Salesforcelogin extends Globaldemo1{

	public static void main(String[] args) throws InterruptedException, IOException 
	
	// xpath syntax : //tagName[@attribute='value']
	// CSS syntax :  tagName[attribute='value'] , tagName#id - can be used only if ID is available , tagName.classname - for class
		  

	{
		login();
		/*System.setProperty("webdriver.chrome.driver", "C:\\\\Praveen\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		driver.manage().window().maximize();
		//driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
		String s=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("id");
		System.out.println("The attribute value is:"+ s);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("praveen.yogi@gmail.com");
		String a=driver.findElement(By.xpath("//input[@id='password']")).getAttribute("class");
		System.out.println("The attribute value is:"+ a);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abcd1234");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#Login")).click();
		
		
	}

}
