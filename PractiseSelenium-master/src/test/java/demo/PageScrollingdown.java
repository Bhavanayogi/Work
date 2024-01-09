package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		
		WebElement ele= driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
		
		// To scroll down to a particular element
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ele);
		

	}

}
