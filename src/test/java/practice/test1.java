package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions actions = new Actions(driver);
	
	actions.moveToElement(driver.findElement(By.partialLinkText("COMPUTERS"))).perform();
	driver.findElement(By.partialLinkText("COMPUTERS")).click();
	
	//actions.moveToElement(driver.findElement(By.partialLinkText("Desktops"))).perform();
	
	WebElement dd1=driver.findElement(By.id("products-orderby"));
	Select s=new Select(dd1);
	
	if(s.isMultiple()) {
		System.out.println("Multi select drop down");
	}
	else {
		System.out.println("Single select drop down");
		s.selectByVisibleText("//option[text()=\"Price: Low to High\"");
	}
	
	WebElement dd2=driver.findElement(By.xpath("//option[text()=\"8\"]"));
	Select s2=new Select(dd2);
	if(s2.isMultiple()) {
		System.out.println("Multi Select Drop Down");
	}
	else {
		System.out.println("Select Select Drop Sown");
		s2.selectByVisibleText("//option[t\"ext()=12\"]");
	}
	Thread.sleep(3000);
	driver.close();
	}
}
