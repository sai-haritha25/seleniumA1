package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/plus");
		Actions actions = new Actions(driver);
		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();

	}

}
