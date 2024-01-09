package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	public static void main(String[] args) throws Exception {
		// Initiate browser
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
	
		// Create object of actions class
		Actions act=new Actions(driver);
		// find element which we need to drag 
		WebElement drag=driver.findElement(By.xpath(".//*[@id='draggable']"));
		// find element which we need to drop
		WebElement drop=driver.findElement(By.xpath(".//*[@id='droppable']"));
		// this will drag element to destination 
		Thread.sleep(3000);
		act.dragAndDrop(drag, drop).build().perform();
				}

}
