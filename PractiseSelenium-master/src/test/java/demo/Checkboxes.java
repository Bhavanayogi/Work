package demo;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Assert.assertTrue(
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());

		// To get the count of Total no.of check boxes on the page

		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		List<WebElement> checkboxes = driver.findElements(By.xpath("//label[contains(@for,'ctl00_mainContent_chk')]"));
		/*
		 * for (WebElement currentcheckbox : checkboxes) { String S=
		 * currentcheckbox.getText(); System.out.println(S); }
		 */

		for (int i = 0; i < checkboxes.size(); i++)

		{

			System.out.println(checkboxes.get(i).getText());
		}

		driver.quit();

	}

}
