package demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		// System Property for IEDriver   
		System.setProperty("webdriver.ie.driver", "C:\\Praveen\\IEDriverServer.exe");  
		          
		     // Instantiate a IEDriver class.     
		WebDriver driver=new InternetExplorerDriver(); 
		driver.get("https://sat.propertyware.com/pw/login.jsp");

	}

}
