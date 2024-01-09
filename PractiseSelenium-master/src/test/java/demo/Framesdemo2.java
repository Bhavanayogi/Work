package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesdemo2 {

	// To switch from one frame to another frame, then first we need to come out of current frame & then switch to other frame
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		Thread.sleep(1000);
		
		// frame1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='htmlf.htm']"));
		driver.switchTo().frame(frame1);
		String value1=driver.findElement(By.xpath("//p[contains(text(),'A Basic')]")).getText();
		System.out.println(value1);
		driver.switchTo().defaultContent();
		
		//frame2
		
		WebElement frame2= driver.findElement(By.xpath("//frame[@src='message.htm']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Testing frames");
		driver.switchTo().parentFrame();
		
		// frame3
		WebElement frame3= driver.findElement(By.xpath("//frame[@src='tags.htm']"));
		driver.switchTo().frame(frame3);
		String value2=driver.findElement(By.xpath("//font[contains(text(),'Brief')]")).getText();
		System.out.println(value2);
		

	}

}
