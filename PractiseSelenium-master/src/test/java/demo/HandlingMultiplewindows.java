package demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultiplewindows {
	
	WebDriver driver;
	@Test(enabled = false)

	public void windowHandle() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/browser-windows");
		// new window
		driver.findElement(By.xpath("//button[normalize-space()='New Window']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		System.out.println("Total windows are: "+ids.size());
		Iterator<String> it=ids.iterator();
		String parentid = it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		Thread.sleep(1000);
		System.out.println("Child window content: "+driver.findElement(By.xpath("//h1[normalize-space()='This is a sample page']")).getText());
		System.out.println(driver.getTitle());
		driver.close(); // closing child window
		System.out.println("Child window closed successfully");
		driver.switchTo().window(parentid);
		System.out.println("Parent Window Title: "+driver.getTitle());
		
		driver.close(); // closing parent window
		System.out.println("Parent window closed successfully");
		
	}

	
	@Test(enabled = false)
	
	public void tabsHandle() throws InterruptedException 
	{
		System.out.println("***************** New tab *****************");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/browser-windows");
		// new tab
		driver.findElement(By.xpath("//button[normalize-space()='New Tab']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		System.out.println("Total tabs are: "+ids.size());
		Iterator<String> it=ids.iterator();
		String parentid = it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		Thread.sleep(1000);
		System.out.println("Child window content: "+driver.findElement(By.xpath("//h1[normalize-space()='This is a sample page']")).getText());
		System.out.println(driver.getTitle());
		driver.close(); // closing child window
		System.out.println("Child tab closed successfully");
		driver.switchTo().window(parentid);
		System.out.println("Parent tab Title: "+driver.getTitle());
		
		driver.close(); // closing parent window
		System.out.println("Parent tab closed successfully");
		
	}
	
@Test
	
	public void multiplewindowHandle() throws InterruptedException 
	{
	
	System.out.println("***************** Multiple windows *****************");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://nxtgenaiacademy.com/multiplewindows/");
	String parentWindow =driver.getWindowHandle();
	System.out.println("The parent window is:: "+parentWindow);
	System.out.println("Title of parent window is::"+driver.getTitle());
	driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();
	Thread.sleep(3000);
	Set<String> windows=driver.getWindowHandles();
	System.out.println("Total windows are: "+windows.size());
	
	ArrayList<String> windowslist = new ArrayList<String>(windows);
	
	//String windowtitle1 =driver.switchTo().window(windowslist.get(1)).getTitle();
	
	//System.out.println("The title of 1st child pop-up window is:: "+windowtitle1);
	
	
//	driver.switchTo().window(windowslist.get(1)).close();
//	Thread.sleep(3000);
//	driver.switchTo().window(windowslist.get(2)).close();
//	Thread.sleep(3000);
//	driver.switchTo().window(windowslist.get(0)).close();

	for(String i:windowslist){  
        System.out.println("The values in arraylist are: "+i);
    }
	
	
	
	driver.switchTo().window(windowslist.get(0));
	String a=driver.getTitle();
	System.out.println("Title1::"+ a);
	driver.close();
	
	driver.switchTo().window(windowslist.get(1));
	String b=driver.getTitle();
	System.out.println("Title2::"+ b);
	driver.close();
	
	
	driver.switchTo().window(windowslist.get(2));
	String c=driver.getTitle();
	System.out.println("Title3::"+ c);
	driver.close();
	
	

	 
	}
	
}
