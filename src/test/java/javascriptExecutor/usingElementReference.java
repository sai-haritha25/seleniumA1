package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingElementReference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.ebay.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement element = driver.findElement(By.xpath("//a[text()='Popular Destination]"));
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView",element);
Thread.sleep(2000);
driver.close();

	}

}
