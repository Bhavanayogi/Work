package demo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:/Praveen/ChromeDriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/seeker/registration");
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)driver; //Scrolling using JavascriptExecutor
//		   js.executeScript("window.scrollBy(0,380)");//Scroll Down to file upload button (+ve)
//		   Thread.sleep(3000);
		 
		   // FILE UPLOADING USING SENDKEYS ....
		 
		   WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		   //click on �Choose file� to upload the desired file
		   Thread.sleep(3000);
		   browse.sendKeys("C:\\Onedrive\\OneDrive - RealPage\\Documents\\PDF\\Dummy.pdf"); //Uploading the file using sendKeys
		  
		   System.out.println("File is Uploaded Successfully");
		   driver.close();
		   
		
		// FILE UPLOADING USING Robot class
		   
		   driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://pdf2jpg.net/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='advanced_pdf_file']")).click();
			Thread.sleep(2000);
			
			// creating object of Robot class
		    Robot rb = new Robot();
		 
		    // copying File path to Clipboard
		    
		    StringSelection str = new StringSelection("C:\\Onedrive\\OneDrive - RealPage\\Documents\\PDF\\Dummy.pdf");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // press Contol+V for pasting
		    
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		     
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
