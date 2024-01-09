package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentChild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Praveen\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(300);
		driver.get("http://qaclickacademy.com/interview.php");
		Thread.sleep(200);
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		Thread.sleep(300);
		// driver.findElement(By.xpath("//div[@class='responsive-tabs-wrapper']/div/ul[@class='responsive-tabs__list']/li")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//*[text()=' Soap UI ']")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
