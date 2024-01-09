package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdowns {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Praveen\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("AED");
        WebElement option = s.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem );
        Thread.sleep(500);
        s.selectByIndex(0);
        WebElement option1 = s.getFirstSelectedOption();
        String defaultItem1 = option1.getText();
        System.out.println(defaultItem1 );
        Thread.sleep(500);
        s.selectByVisibleText("USD");
        WebElement option2 = s.getFirstSelectedOption();
        String defaultItem2 = option2.getText();
        System.out.println(defaultItem2 );
		Thread.sleep(500);
		driver.quit();
	}

}
