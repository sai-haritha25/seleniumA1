package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("sai"+Keys.TAB+"haritha"+Keys.TAB+"saiharithapenumalla07@gmail.com"+Keys.ENTER);
		driver.findElement(By.id("Password")).sendKeys("Navi@2507"+Keys.TAB+"Navi@2507");
		driver.findElement(By.id("register-button")).submit();
		//driver.close();
		
	}

}
