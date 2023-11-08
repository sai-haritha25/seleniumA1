package framespractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class oneframetoanotherframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	    driver.findElement(By.id("name")).sendKeys("user1");
	    
	    //switching the control to the frame from main page
	    driver.switchTo().frame("frm1");
	    
	    //to handle dropdowns create instance of select class
	    
	    Select dd = new Select(driver.findElement(By.id("course")));
	   dd.deselectByVisibleText("Java");
	   
	   //to jump to another frame 
	   // we have to came out of the frame and then jum to another frame
	   
	  driver.switchTo().defaultContent();
	   
	  driver.switchTo().frame("frm2");
	   driver.findElement(By.id("firstName")).sendKeys("sai haritha");
	   
	   //came out of frame again
	   driver.switchTo().defaultContent();
	   
	  driver.findElement(By.id("name")).clear();
	  driver.findElement(By.id("name")).sendKeys("user2");
	   
	   driver.close();
	   
	   
	   
	   
	   
	    
	    
		}



	}


