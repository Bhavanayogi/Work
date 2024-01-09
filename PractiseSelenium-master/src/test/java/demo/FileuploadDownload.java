package demo;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileuploadDownload {
	
	//FileUpload using AutoIT

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver","C:\\Praveen\\ChromeDriver\\chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://pdf2jpg.net/");
		driver.findElement(By.xpath("//button[@id='advanced_pdf_file']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Praveen\\Fileuploading.exe");
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='convert_pdf_to_jpg_button']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='convert_pdf_to_jpg_button']")));
		driver.findElement(By.xpath("//input[@id='convert_pdf_to_jpg_button']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='download_zip_file_link']")));
		driver.findElement(By.xpath("//a[@id='download_zip_file_link']")).click();
		
		//File f= new File("C:\\Users\\pratanlal\\Downloads\\filename.zip");
		Thread.sleep(3000);
		File f=new File(downloadPath+"/SamplePDF.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());

			if(f.delete())

			System.out.println("file deleted");
		}
	}

}


 
 
 
