package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintoshopersstock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Email")).sendKeys("saiharithapenumalla07@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("Password")).sendKeys("Navi@2507");
		Thread.sleep(5000);
		driver.findElement(By.id("Login")).submit();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
	}

}
