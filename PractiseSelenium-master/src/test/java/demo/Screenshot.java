package demo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/");
		
		// Code to capture the screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Code to copy the screenshot in the desired location
		FileUtils.copyFile(src, new File("C:\\Praveen\\Screenshots\\screenshot1.png"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("PNR Enquiry")).click();
		File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Praveen\\Screenshots\\screenshot2.png"));
		
		Thread.sleep(2000);
		driver.quit();
	}

}
