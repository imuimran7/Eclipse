package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceloginpage {
	WebDriver driver;
	//locating login button
	@FindBy(xpath="//*[@id=\"login-button\"]")
	WebElement loginbutton;

	//Locating Username Text box
	@FindBy(xpath="//*[@id=\"user-name\"]")
	WebElement Username;
	
	//Locating password text box
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	public Sauceloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setvalues(String username2,String password2)
	{
		System.out.println("setValues");
		Username.clear();
	Username.sendKeys(username2);
	password.clear();
	password.sendKeys(password2);
		
	}
	
	public void loginbutton()
	{
		loginbutton.click();
	}
}



