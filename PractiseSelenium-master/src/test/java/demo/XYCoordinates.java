package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XYCoordinates {
	
	
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
	  
	  Point location = element.getLocation();
	  int x = location.getX();
	  int y = location.getY();
	  System.out.println("Coordinates of an element is : " + x + " and " + y);
	  driver.quit();
	 }
	


}
