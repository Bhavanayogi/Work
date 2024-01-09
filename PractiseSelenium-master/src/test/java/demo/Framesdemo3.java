package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesdemo3 {

	// Handling nested frames
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/nestedframes");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1").switchTo().frame(0); //switching from parent frame to child frame using index
		//driver.findElement(By.tagName("p"));
		String ch=driver.findElement(By.xpath("//p[normalize-space()='Child Iframe']")).getText();
		
		System.out.println("Child frame text: "+ch);
		driver.switchTo().parentFrame();
		String p=driver.findElement(By.xpath("//body")).getText();
	    System.out.println("Parent frame text: "+p);
	   
	    driver.switchTo().defaultContent();
	    String defaultpagecontent =driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page. There are nested iframe')]")).getText();
	    System.out.println("The default dom content: "+ defaultpagecontent);
		Thread.sleep(1000);
        driver.quit();
	}

}
