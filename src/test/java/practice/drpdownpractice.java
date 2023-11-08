package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdownpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.amazon.in/?");
 WebElement element = driver.findElement(By.id("searchDropdownBox")); 
 Select s = new Select(element);
 System.out.println(s.isMultiple());
 
 
	}

}
