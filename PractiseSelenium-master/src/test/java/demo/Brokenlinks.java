package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws IOException, InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> links =driver.findElements(By.tagName("a")); // storing all the links in links ref variable

		System.out.println("The total number of links are: "+ links.size());

		for (WebElement wb : links) {


			String url = wb.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpcon= (HttpURLConnection)link.openConnection();

			Thread.sleep(2000);

			httpcon.connect();  //establish connection

			int responseCode = httpcon.getResponseCode();  //returns the response code.

			if(responseCode>=400)

			{
				System.out.println(url + "--> "+ "is broken link");
			}
			else

			{
				System.out.println(url + "--> "+ "is valid link");
			}

		}

		System.out.println("***********  Execution Completed  **************");
		driver.quit();
	}

}
