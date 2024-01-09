package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowndemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		Thread.sleep(2000);
		
		//using Keys
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/b[1]/select[1]")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		Select s= new
	    Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		s.selectByVisibleText("London");
		
		WebElement option = s.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem ); // the value which has been selected is printed.
		
	
	}
	//return true if multi-select dropdown
    //Boolean b=s.isMultiple();
}
