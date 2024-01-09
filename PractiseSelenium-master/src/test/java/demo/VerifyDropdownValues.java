package demo;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyDropdownValues {

	@Test
	
	public void test() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		Thread.sleep(2000);
		
		WebElement months=driver.findElement(By.xpath("//select[@name='fromMonth']"));
		
		Select s= new Select(months);
		
		List<String> actualdropdownvalues = new ArrayList<String>();
		
		for (WebElement ele : s.getOptions()) {
			
			actualdropdownvalues.add(ele.getText());
					}
		
		List<String> expecteddropdownvalues = new ArrayList();
		
		
		expecteddropdownvalues.add("January");
		expecteddropdownvalues.add("February");
		expecteddropdownvalues.add("March");
		expecteddropdownvalues.add("April");
		expecteddropdownvalues.add("May");
		expecteddropdownvalues.add("June");
		expecteddropdownvalues.add("July");
		expecteddropdownvalues.add("August");
		expecteddropdownvalues.add("September");
		expecteddropdownvalues.add("October");
		expecteddropdownvalues.add("November");
		expecteddropdownvalues.add("December");
		
		
		for (int i = 0; i < actualdropdownvalues.size(); i++) {
			
			System.out.println("Actual: "+actualdropdownvalues.get(i)+"  Expected: "+expecteddropdownvalues.get(i));
			
			Assert.assertTrue(actualdropdownvalues.get(i).equals(expecteddropdownvalues.get(i)));
			
			
		}
		
	}

}
