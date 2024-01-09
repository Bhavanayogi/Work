package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablesort {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("tr th:nth-child(2")).click();
		
		List<WebElement> firstCol = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		System.out.println("************ Original list *************");
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < firstCol.size(); i++) {

			originalList.add(firstCol.get(i).getText());
		}
		
		
		ArrayList<String> copiedlList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {

			copiedlList.add(originalList.get(i));

		}

		// String

		Collections.sort(copiedlList);
		Collections.reverse(copiedlList);
		for (String s1 : originalList) // for(int i=0;i<copiedlList.size();i++)
		{
			System.out.println(s1);
		}

		System.out.println("************ Copied list *************");

		for (String s2 : copiedlList) {
			System.out.println(s2);
		}

		Assert.assertTrue(originalList.equals(copiedlList),"Values does not match");
		Thread.sleep(2000);
		driver.quit();

	}

}
