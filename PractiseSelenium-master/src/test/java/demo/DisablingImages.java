package demo;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisablingImages {

	String test_url = "https://www.amazon.in/";
	WebDriver driver = null;

	@Test
	public void imagesDisabled() throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		disableChromeImages(options);
//
//		driver = new ChromeDriver(options);

		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		disableFFImages(options);
		driver = new FirefoxDriver(options);

		driver.get(test_url);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// Thread.sleep(5000);
		driver.close();
	}

	public static void disableChromeImages(ChromeOptions options) {

		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.managed_default_content_settings.images", 2);
		options.setExperimentalOption("prefs", prefs);

	}

	public static void disableFFImages(FirefoxOptions options) {

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);

	}
}
