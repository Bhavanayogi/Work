package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathsdemo1 {

/*	 //tagName[@attribute='value']   - xpath syntax
 *   Xpath=//*[contains(@type,'sub')]  
	   tagName[attribute='value']	 - Css syntax
	   tagName#id                     -Css if id is available 
	   
	Regular Expression :
	  //tagName[contains(@attribute,'value')]  - xpath 
	    tagName[attribute*='value']            - Css
	*/
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Praveen\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
		
		Thread.sleep(500);
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email' or id='usernam']")).click();
		driver.findElement(By.xpath("//input[@type='email' and @id='username']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'userna')]")).click();
		driver.findElement(By.xpath("////input[starts-with(@id,'usern')]")).click();
	
		
		//driver.findElement(By.xpath("//a[text()='Try for Free']")).click();
		driver.findElement(By.xpath("//div[@id='wrapper']/div[3]/a")).click(); // traversing from parent to child.
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector(("input[name='UserFirstName']"))).sendKeys("Praveen");  
		
		
	}

}
