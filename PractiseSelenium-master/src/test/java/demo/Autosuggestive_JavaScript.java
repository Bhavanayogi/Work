package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Enter the letters BENG 
// Verify if Airport option is displayed in suggestive box.

public class Autosuggestive_JavaScript {

	public static void main(String[] args) throws InterruptedException {

		// Javascript DOM can extract hidden elements.
		// b'coz selenium cannot identify hidden elements. (Ajax implementation)
		// Javascript has access to the DOM structure & can also change if required
		// investigate the properties of object if it have any hidden text.

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/");
		By fromPlace= By.id("fromPlaceName");
		driver.findElement(fromPlace).sendKeys("BENG");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);

		// System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		//Here in the below step we are typecasting webdriver into JavascriptExecutor 
		//i.e. we are converting webdriver into JavascriptExecutor.

		JavascriptExecutor js = (JavascriptExecutor) driver; 
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		// System.out.println(text);
		int i = 0;
		// while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		while (!text.equalsIgnoreCase("BENGALURU INTETION AIRPORT"))

		{
			i++;

			driver.findElement(fromPlace).sendKeys(Keys.ARROW_DOWN);

			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}
		}
		if (i > 10) {
			System.out.println("Expected value is Not Found");
		} else

			System.out.println("Expected value is Found");

		Thread.sleep(2000);
		driver.quit();

	}

}
