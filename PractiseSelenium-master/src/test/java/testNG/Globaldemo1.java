package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Globaldemo1 {

	public static WebDriver driver=null;
	
	@Test
	public static void login() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Praveen\\Programs\\Practise SE\\src\\testNG\\datadriven.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("username"));
		//System.out.println(prop.getProperty("password"));
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Praveen\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Praveen\\Geckodriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "C:\\Praveen\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url2"));
	}
	
	
	
	
	
}
