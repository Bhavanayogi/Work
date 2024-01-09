package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatingelements {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Praveen\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 */
		System.setProperty("webdriver.gecko.driver", "C:\\Praveen\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("https://login.yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("praveen.yogi");
		Thread.sleep(1000);

		// driver.findElement(By.id("createacc")).click();
		driver.findElement(By.xpath("//a[@href='/account/create?specId=yidReg']")).click();
		// driver.findElement(By.xpath("//a[.='Create account']")).click(); -- not
		// working
		// driver.findElement(By.xpath("//a[@id='createacc' and
		// @role='button']")).click();
		// driver.findElement(By.xpath("//a[text()='Create account']")).click(); //not
		// working
		// driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		// driver.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Praveen");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Yogi");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='yid']")).sendKeys("hobbs.johnson1211");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//div[@class='phone-number']//input[@id='usernamereg-phone']"))
				.sendKeys("9030222112");

		Thread.sleep(500);

		driver.quit();

	}

}

// driver.get("https://www.goindigo.in/");
/*
 * driver.findElement(By.xpath("//a[text()='Book Flight']")).click();
 * driver.findElement(By.
 * xpath("//label[@class='new_radio']//label[text()='Round Trip']")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//input[@type='text' and @name='or-src']")).
 * click(); Thread.sleep(500);
 * driver.findElement(By.xpath("//input[@type='text' and @name='or-src']")).
 * clear(); //Thread.sleep(1000);
 * driver.findElement(By.xpath("//input[@type='text' and @name='or-src']")).
 * clear();
 * driver.findElement(By.xpath("//input[@type='text' and @name='or-src']")).
 * sendKeys("HYD"); driver.findElement(By.
 * xpath("//div[@class='airport-city' and @text()='Hyderabad, India']")).click()
 * ; //driver.findElement(By.
 * xpath("//div[@class='autocomplete-wrapper station-wrapper']//input[@name='or-dest']"
 * )).sendKeys("DEL"); //driver.findElement(By.
 * xpath("//div[@class='airport-city' and name ='Delhi, India'")).click();
 */