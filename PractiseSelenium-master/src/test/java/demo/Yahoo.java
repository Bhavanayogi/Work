package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://login.yahoo.com");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//*[@id='uh-signin']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='createacc']")).click();

	}

}
