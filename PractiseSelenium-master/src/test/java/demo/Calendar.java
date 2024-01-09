package demo;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	// https://www.youtube.com/watch?v=HqzlDEPdJ3w

	public static void main(String[] args) throws InterruptedException {

		//		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(2000);
		// below code is used for month selection.

		/*
		 * while(!driver.findElement(By.
		 * cssSelector(".datepicker-days .datepicker-switch")).getText().contains("May")
		 * ) { driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		 * 
		 * }
		 */

		// below code is used for month selection.

		driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).click();

		List<WebElement> months = driver.findElements(By.xpath("//span[contains(@class,'month')]"));

		for (int i = 0; i < months.size(); i++) {
			String monthText = months.get(i).getText();
			if (monthText.equalsIgnoreCase("Dec")) {
				months.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);

		// below code is used for date selection.

		List<WebElement> dates = driver.findElements(By.className("day"));// Grab common attribute//Put into list and
		// iterate

		int count = dates.size();
		for (int i = 0; i < count; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				dates.get(i).click();
				break;
			}

		}

	}

}
