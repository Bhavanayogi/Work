package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestive {
	public static void main(String args[]) throws InterruptedException {

		/*
		 * //System.setProperty("webdriver.chrome.driver",
		 * "C:\\Praveen\\chromedriver.exe"); //WebDriver driver= new ChromeDriver();
		 * System.setProperty("webdriver.gecko.driver","C:\\Praveen\\geckodriver.exe");
		 * FirefoxDriver driver=new FirefoxDriver();
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * driver.get("https://www.makemytrip.com/");
		 * //driver.get("https://www.goindigo.in/");
		 * 
		 * Thread.sleep(2000);
		 * //driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		 * driver.findElement(By.xpath("//input[contains(@placeholder='From')]")).
		 * sendKeys("mum"); //tagName[contains(@attribute,'value')]
		 * //driver.findElement(By.xpath(
		 * "//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div/input"
		 * )).clear(); //*
		 * [@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/
		 * input" //WebElement From=
		 * driver.findElement(By.xpath("//input[@name='or-src']")); //From.clear();
		 * //.sleep(5000); //From.click(); //Thread.sleep(1000); //From.clear();
		 * 
		 * //Thread.sleep(5000); //From.sendKeys("Ben"); //From.sendKeys(Keys.ENTER);
		 * //Thread.sleep(1000); //driver.quit();
		 */
		System.setProperty("webdriver.chrome.driver", "C:/Praveen/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait eWait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='From']"))).click();
		driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div/input"))
		.sendKeys("hyderabad");
		// eWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder='From']"))).sendKeys("hyderabad");
		Thread.sleep(2000);
		driver.quit();

	}
}
