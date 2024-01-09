package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  //WebDriverManager.firefoxdriver().setup(); 
		  //WebDriver driver = new FirefoxDriver(); 
		  driver.get("https://www.google.com/");
		  Thread.sleep(3000);
		  driver.close();
		
	}

	
	//WebDriverManager.operadriver().setup();
	//WebDriverManager.phantomjs().setup();
	//WebDriverManager.edgedriver().setup();
	//WebDriverManager.iedriver().setup();
}
	
	


