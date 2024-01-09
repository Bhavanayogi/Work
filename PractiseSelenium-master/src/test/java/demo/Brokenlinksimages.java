package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinksimages {

	public static void main(String[] args) throws InterruptedException, IOException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		List<WebElement> links =driver.findElements(By.tagName("a")); // storing all the links in links ref variable
		links.addAll(driver.findElements(By.tagName("img")));   // adding all the images to the existing list

		System.out.println("The total number of links and images are: "+ links.size());

		List<WebElement> activelinks = new ArrayList<WebElement>();

		// iterate links and exclude all the links and images which does not have href attribute

		for(int i=0; i<links.size();i++) {

			if(links.get(i).getAttribute("href")!=null)

			{

				activelinks.add(links.get(i));

			}

		}

		System.out.println("The size of total active links and images is: "+activelinks.size());

		for(int j=0;j<activelinks.size();j++)
		{
			URL link = new URL(activelinks.get(j).getAttribute("href"));
			HttpURLConnection httpcon= (HttpURLConnection)link.openConnection();

			Thread.sleep(2000);

			httpcon.connect();  //establish connection

			int responseCode = httpcon.getResponseCode();  //returns the response code.

			if(responseCode>=400)

			{
				System.out.println(link + "--> "+ "is broken");
			}
			else

			{
				System.out.println(link + "--> "+ "is valid");
			}

		}

		System.out.println("***********  Execution Completed  **************");

	}



}


