package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeofwebElement {
	
	WebDriver driver;
	 @BeforeTest
	 public void setup(){
	  WebDriverManager.chromedriver().setup();
	 }
	
	  @Test
	  public void getCoordinates(){
	   driver = new ChromeDriver();
	   driver.get("https://www.google.com");
	   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
	   System.out.println(element.getText());

	    int elementWidth = element.getSize().getWidth();
	   System.out.println("Element width: "+ elementWidth);
	   int elementHeight = element.getSize().getHeight();
	   System.out.println("Element Height: "+ elementHeight);
       driver.quit();
	  }

}
