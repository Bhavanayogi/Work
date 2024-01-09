package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sliderdemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		Thread.sleep(3000);
		driver.switchTo().frame(0); //need to switch to this frame before clicking the slider
        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 80, 0).build();
        action.perform();
        System.out.println("Action completed");
		
        // method 2
        
        Dimension dim= slider.getSize();
		int x= dim.getWidth();
		Actions act= new Actions(driver);
		act.clickAndHold(slider).moveByOffset(x-100, 0).release().build().perform();
		System.out.println("Action 2 completed");
		
		// methodd 3 (not sure)
		
		//act.dragAndDropBy(list.listings_Range_rightSlider(), 104, 1053).release().build().perform();
		//list.listings_Range_rightSlider().click();
		
		// method 4
		
		/*for (int i = 1; i <= 85 ; i++) {
			list.listings_Range_rightSlider().sendKeys(Keys.ARROW_LEFT);
        }*/
		
		
		driver.quit();
		

	}

}
