package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks2 {

	static WebDriver driver;

	public static List<WebElement> brokenlinks()
	{
		List<WebElement> elements = driver.findElements(By.tagName("a"));    
		List<WebElement> finalList = new ArrayList<WebElement>();      
		for (WebElement ele : elements){
			if(ele.getAttribute("href") != null){
				finalList.add(ele);    
			} 
		} 
		return finalList;
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		System.out.println("The broken links are:: "+brokenlinks());
		Thread.sleep(2000);
		driver.quit();

	}

}
