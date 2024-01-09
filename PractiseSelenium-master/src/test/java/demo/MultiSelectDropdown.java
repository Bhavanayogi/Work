package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropdown {
	
	WebDriver driver;

    @Test
    public void testApp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement select1 = driver.findElement(By.xpath("//option[contains(text(),'Volvo')]"));
        WebElement select2 = driver.findElement(By.xpath("//option[contains(text(),'Audi')]"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();

        Thread.sleep(2000);
        driver.quit();

}
}