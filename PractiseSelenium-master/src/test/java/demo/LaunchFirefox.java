package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Praveen\\Geckodriver\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.close();

	}

}
