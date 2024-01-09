package demo;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addingtocart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); // implicitwait
		WebDriverWait w= new WebDriverWait(driver, 5); // declaration of explicit wait globally
		driver.manage().window().maximize();

		String[] itemsNeeded = { "Cauliflower", "Beans", "Mushroom" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode"))); // Explicit wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); // Explicit wait
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException

	{

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg

			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name

			// convert array into array list for easy search

			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{

				j++;

				// click on Add to cart

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(1000);

				if (j == itemsNeeded.length)

				{

					break;

				}

			}

		}

	}

}

/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Praveen\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
 * 
 * String[] itemsNeeded = { "Cauliflower", "Beans", "Mushroom" };
 * driver.get("https://rahulshettyacademy.com/seleniumPractise/");
 * Thread.sleep(3000); List<WebElement> products =
 * driver.findElements(By.cssSelector("h4.product-name")); // tagName.Classname
 * int j = 0; for (int i=0; i<products.size(); i++) { // Brocolli - 1 Kg //
 * Brocolli, 1 kg
 * 
 * String[] name = products.get(i).getText().split("-"); String formattedName =
 * name[0].trim(); // format it to get actual vegetable name // convert array
 * into array list for easy search // check whether name you extracted is
 * present in arrayList or not-
 * 
 * List itemsNeededList = Arrays.asList(itemsNeeded); if
 * (itemsNeededList.contains(formattedName)) { j++;
 * 
 * // Click on Add to Cart
 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
 * .click(); Thread.sleep(1000); if (j == itemsNeeded.length) { break; }
 * 
 * }
 * 
 * }
 * 
 * } }
 */