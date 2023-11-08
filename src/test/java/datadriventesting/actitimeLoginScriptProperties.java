package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimeLoginScriptProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(read("url"));
		long time = Long.parseLong("timeouts");
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
		driver.findElement(By.id("usernmae")).sendKeys(read("username"));
		driver.findElement(By.name("pwd")).sendKeys(read("pwd2"));
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		driver.close();
		
		}
	public static String read(String key)
	{
		FileInputStream fis = null;
		try {
		 fis = new FileInputStream("./src/test/resources/data.properties");
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			
		}
		Properties property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return property.getProperty(key);
	}

}
