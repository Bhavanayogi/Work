package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet1 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Praveen\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(500);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(500);
		
        Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s1.selectByValue("3");
        Thread.sleep(500);
        WebElement option = s1.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem );
        Thread.sleep(1000);
        Select s2= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        s2.selectByIndex(4);
        WebElement option2 = s2.getFirstSelectedOption();
        String defaultItem2 = option2.getText();
        System.out.println(defaultItem2 );
        Thread.sleep(500);
        Select s3= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        s3.selectByVisibleText("2");
        WebElement option3 = s3.getFirstSelectedOption();
        String defaultItem3 = option3.getText();
        System.out.println(defaultItem3 );
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);
		driver.quit();
      
	}
}

// selecting from & to, passengers should change to 5 adult, currency-> Us dollars