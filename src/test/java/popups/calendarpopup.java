package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.className("commonModel_close")).click();
		driver.findElement(By.xpath("//span[text()='Depature']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Mon Oct 26 2023']")).click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
