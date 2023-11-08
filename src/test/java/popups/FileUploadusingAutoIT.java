package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadusingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=CjwKCAjw69moBhBgEiwAUFCx2Cf5F5AcPMtlu2oNNu33IdbtXvpkBB-V2wVrOCkdvaV7f4IF6hiyYBoCW98QAvD_BwE&gclsrc=aw.ds");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
Runtime.getRuntime().exec("C:\\Users\\Naveen\\Documents\\autoIT\\fileupload1.exe");
Thread.sleep(2000);
driver.close();





	}

}
