package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.foundit.in/");
 driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
 driver.findElement(By.id("file-upload")).
 sendKeys("C:\\Users\\Naveen\\Downloads\\automation1.pdf");
  Thread.sleep(10000);
  driver.close();
	}

}
