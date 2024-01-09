/*
 * package demo;
 * 
 * import org.openqa.selenium.By; import
 * org.openqa.selenium.htmlunit.HtmlUnitDriver;
 * 
 * public class HeadlessHtmlUnitDriver {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * // htmlunit-driver-2.53.0-jar-with-dependencies // htmlunit-driver-2.53.0 ->
 * these two jars need to be added to run this program successfully.
 * 
 * // create instance for the HtmlUnitWebDriver //HtmlUnitDriver driver = new
 * HtmlUnitDriver();
 * 
 * driver.get("https://opensource-demo.orangehrmlive.com/");
 * 
 * System.out.println("Title of the page:" + driver.getTitle());
 * System.out.println("URL of the page:" + driver.getCurrentUrl());
 * 
 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
 * Thread.sleep(1000); driver.findElement(By.id("btnLogin")).click();
 * Thread.sleep(1000); String actual =
 * driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
 * //System.out.println(actual); String exp = "Dashboard";
 * 
 * if(exp.equalsIgnoreCase(actual)) {
 * 
 * System.out.println("Logged in successfully"); }
 * 
 * }
 * 
 * 
 * }
 */