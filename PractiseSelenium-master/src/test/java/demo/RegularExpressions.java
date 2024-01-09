package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressions 
{
// xpath Regular Expression syntax : //tagName[contains(@attribute,'value')]
// CSS Regular Expression syntax : tagName[attribute*='value']
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(200);
driver.get("https://www.rediff.com/");
driver.findElement(By.xpath("//a[contains(@title,'Sign')]")).click();
//driver.findElement(By.cssSelector("input#login1")).sendKeys("Praveen"); // tagName#id-CSS ( can be used only if id attribute is available)
driver.findElement(By.xpath("//form[@name='loginform']/div/div/input[@id='login1']")).sendKeys("praveen.yogi@rediffmail.com");
driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("CssRegPassword");
driver.findElement(By.xpath("//input[@value='Go']")).click();
Thread.sleep(500);
driver.close();

	}

}
