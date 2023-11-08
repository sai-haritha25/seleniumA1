package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logindemoskillradyapplicationpage {
	@FindBy (xpath = "//a[text()='LOGIN']")
	private WebElement loginbutton;
	
	@FindBy (id="email")
	private WebElement username;
	
	@FindBy (id="password")
	private WebElement password;
	

	@FindBy (id="last")
	private WebElement button;
	

	@FindBy (xpath  ="//span[text()='Users']")
	private WebElement user;
	

	@FindBy (className ="btn")
	private WebElement plusNew;
	
	
	///

	@FindBy (id ="email")
	private WebElement email1;
	
	

	@FindBy (id ="password")
	private WebElement password1;
	
	
	

	@FindBy (id ="firstname")
	private WebElement firstname;
	
	

	@FindBy (id ="lastname")
	private WebElement lastname;
	

	@FindBy (className ="address")
	private WebElement address;
		

	@FindBy (id ="contact")
	private WebElement contact;
		
	
	

	@FindBy (name ="add")
	private WebElement save;
		
	

}
