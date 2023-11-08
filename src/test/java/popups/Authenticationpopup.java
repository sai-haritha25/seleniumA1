package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//div[@id='content']/descendant::p")).getText();
		System.out.println(text);
		driver.close();
		
		

	}

}
