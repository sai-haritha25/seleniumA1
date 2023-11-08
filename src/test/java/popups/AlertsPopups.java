package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertsPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement courseTab = driver.findElement(By.id("course"));
 Actions actions = new Actions(driver);
 actions.moveToElement(courseTab).perform();
 
 driver.findElement(By.xpath("//span/a[text()='selenium']")).click();
 driver.findElement(By.xpath("//button[.='Add to Cart']")).click();
 
 Alert a = driver.switchTo().alert();
 System.out.println(a.getText());
 a.accept();
 WebElement itemAddedMessage = driver.findElement(By.xpath("//span[@class='message']"));
 System.out.println(itemAddedMessage.getText());
 Thread.sleep(3000);
 
 driver.close();
 
 
	}

}
