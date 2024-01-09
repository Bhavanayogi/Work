package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLcertificates {

	public static void main(String[] args) throws InterruptedException {
		// SSl certificates

		// Desired capabilities = general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts(); // one way of writing.
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Below code is for your local browser

		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://rpisatpww001.realpage.com/applogs/propertyware.com/");

		Thread.sleep(2000);
		driver.quit();

	}

}
