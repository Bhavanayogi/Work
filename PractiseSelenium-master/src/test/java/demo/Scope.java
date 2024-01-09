package demo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/");
		//System.out.println(driver.findElements(By.tagName("a")).size()); //1. To find total no. of links
		WebDriverWait eWait = new WebDriverWait(driver, 15);
		eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'NO THANKS')]"))).click();
		
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
			
			System.out.println(links.get(i).getText());
		}*/
		
		/*System.out.println("***************************************************");
		WebElement footerLinks = driver.findElement(By.xpath("//div[@id='prefooter']")); //2. To find total no. of footer links
		
		List<WebElement> allfooterLinks = footerLinks.findElements(By.tagName("a"));
		
		for(int i=0; i<allfooterLinks.size();i++)
		{
			
			System.out.println(allfooterLinks.get(i).getText());
		}*/
		
		System.out.println("***************************************************");
		WebElement firstcolLinks = driver.findElement(By.xpath("//div[@id='links']")); //3. To find total no. of 1st column footer links
		
		List<WebElement> allfirstcolfooterLinks = firstcolLinks.findElements(By.tagName("a"));
		
		for(int i=0; i<allfirstcolfooterLinks.size();i++)
		{
			
			System.out.println(allfirstcolfooterLinks.get(i).getText());
		}
		
		System.out.println("***************************************************");
		
		//4. click on each link in the column and check if the links are opening or not
		
		for(int i=0; i<allfirstcolfooterLinks.size();i++)
			
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			allfirstcolfooterLinks.get(i).sendKeys(clickonlinktab);
			Thread.sleep(3000);
			
		} // opens all links in new tabs
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
