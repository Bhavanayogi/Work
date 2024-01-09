package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("Total number of rows in webtable are: " + rowCount);

		List<WebElement> colums = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		int columCount = colums.size();
		System.out.println("Total number of colums in webtable are: " + columCount);

		for (int i = 2; i <= rowCount; i++) {
			for (int j = 1; j <= columCount; j++) {

				System.out.print(
						driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"))
								.getText() + " | ");

			}
			System.out.println();
		}

		driver.quit();

	}
}
