package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		
		
		// Handling Webtable rows
		
		// rows pattern
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		
		
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount= rows.size();
		System.out.println("Total number of rows in webtable are: "+ rowCount);
		
	
		
		String colbeforeXpath= "//*[@id='customers']/tbody/tr[";
		String CompanycolafterXpath= "]/td[1]";
	
		
		for(int i=2;i<=rowCount;i++)
		{
			String Companycolactualxpath= colbeforeXpath+i+CompanycolafterXpath;
			WebElement ele= driver.findElement(By.xpath(Companycolactualxpath));
			System.out.println(ele.getText());
			if(ele.getText().equals("Island Trading"))
			{
				System.out.println("Company name: "+ele.getText()+"is found at position: "+(i-1));
				break;
			}
				
		}
		
		System.out.println("************************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		
		String ContactcolafterXpath="]/td[2]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String Companycolactualxpath= colbeforeXpath+i+ContactcolafterXpath;
			WebElement ele= driver.findElement(By.xpath(Companycolactualxpath));
			System.out.println(ele.getText());
		
		}
		
		System.out.println("************************************");
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		
       String CountrycolafterXpath="]/td[3]";
		
		for(int i=2;i<=rowCount;i++)
		{
			String Companycolactualxpath= colbeforeXpath+i+CountrycolafterXpath;
			WebElement ele= driver.findElement(By.xpath(Companycolactualxpath));
			System.out.println(ele.getText());
		
		}
		System.out.println("************************************");
		
		// Handling Webtable columns
		
		// columns pattern
		//table[@id='customers']/tbody/tr[1]/th[1]
		//table[@id='customers']/tbody/tr[1]/th[2]
		//table[@id='customers']/tbody/tr[1]/th[3]
		
		
		List<WebElement> colums= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int columCount= colums.size();
		System.out.println("Total number of colums in webtable are: "+ columCount);
		
		String colBeforeXpath= "//table[@id='customers']/tbody/tr[1]/th[";
		String colAfterXpath= "]";
		
		System.out.println("Column values are:");
		
		for(int i=1;i<=columCount;i++)
		{
			String actualColXpath = colBeforeXpath+i+colAfterXpath;
			WebElement col= driver.findElement(By.xpath(actualColXpath));
			System.out.println(col.getText());
			
		}
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
