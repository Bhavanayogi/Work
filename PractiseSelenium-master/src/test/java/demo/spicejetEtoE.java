package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetEtoE {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click(); // using index
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JAI']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/table/tbody/tr[5]/td[2]/a")).click();
	    driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
	    Thread.sleep(500);
		
        Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s1.selectByValue("3");
        Thread.sleep(500);
        WebElement option = s1.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem );
        
        Thread.sleep(1000);
        Select s2= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        s2.selectByIndex(4);
        WebElement option2 = s2.getFirstSelectedOption();
        String defaultItem2 = option2.getText();
        System.out.println(defaultItem2 );
        
        Thread.sleep(500);
        Select s3= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        s3.selectByVisibleText("2");
        WebElement option3 = s3.getFirstSelectedOption();
        String defaultItem3 = option3.getText();
        System.out.println(defaultItem3 );
        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(500);
        
        Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("AED");
        WebElement option4 = s.getFirstSelectedOption();
        String defaultItem4 = option4.getText();
        System.out.println(defaultItem4 );
        Thread.sleep(500);
        s.selectByIndex(0);
        WebElement option5 = s.getFirstSelectedOption();
        String defaultItem5 = option5.getText();
        System.out.println(defaultItem5 );
        Thread.sleep(500);
        s.selectByVisibleText("USD");
        WebElement option6 = s.getFirstSelectedOption();
        String defaultItem6 = option6.getText();
        System.out.println(defaultItem6 );
		Thread.sleep(500);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
