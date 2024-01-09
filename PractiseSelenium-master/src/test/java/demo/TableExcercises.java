package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExcercises {

	public static void main(String[] args) {
		int sum = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/23093/mlr-vs-hbh-47th-match-big-bash-league-2019-20");

		WebElement table = driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));

		// int rowcount = table.findElements(By.cssSelector("div[class='cb-col
		// cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {

			String value = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int valueinteger = Integer.parseInt(value);
			sum = sum + valueinteger;

		}

		// System.out.println(sum);

		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int Extrasinteger = Integer.parseInt(Extras);
		int totalSum = sum + Extrasinteger;
		System.out.println("Total runs score with the Extras is:: " + totalSum);

		String Actualtotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int Actualtotalinteger = Integer.parseInt(Actualtotal);
		System.out.println("The value in the Total row is:: " + Actualtotalinteger);
		if (totalSum == Actualtotalinteger) {

			System.out.println("Count Matches");
		} else
			System.out.println("Count Does not match");
		driver.quit();
	}

}
