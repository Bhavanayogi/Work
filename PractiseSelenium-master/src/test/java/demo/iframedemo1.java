package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframedemo1 {

	public static void main(String[] args) throws InterruptedException {

         System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://jqueryui.com/droppable/");
         System.out.println(driver.findElements(By.tagName("iframe")).size());
         //driver.switchTo().frame(0);
         driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
         driver.findElement(By.id("draggable")).click();
         Actions a= new Actions(driver);
         WebElement source= driver.findElement(By.id("draggable"));
         WebElement target = driver.findElement(By.id("droppable"));
         a.dragAndDrop(source, target).build().perform();
         Thread.sleep(1000);
         driver.switchTo().defaultContent(); // used to switch back to default window from iframe.
        
         //driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
