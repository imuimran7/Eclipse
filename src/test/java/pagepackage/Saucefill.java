package pagepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Saucefill {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement fn;
	@FindBy(xpath="//*[@id=\"last-name\"]")
     WebElement ln;
	@FindBy(xpath="//*[@id=\"postal-code\"]")
	WebElement code;
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement continuebutton;
	@FindBy(xpath="//*[@id=\"finish\"]")
	WebElement finish;
	@FindBy(xpath="/html/body/div/div/div/div[2]/button")
	WebElement backhome;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement hamburgermenu;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	public Saucefill(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void setvalues(String firstn,String lastn,String pincode)
	{
	   fn.sendKeys(firstn);
	   ln.sendKeys(lastn);
	   code.sendKeys(pincode);
	}
	public void continueclick()
	{
		continuebutton.click();
	}
	public void finishclick()
	{
		finish.click();
		
	}
	public void backclick()
	{
		backhome.click();
	}
	public void burgclick()
	{
		hamburgermenu.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	public void logclick()
	{
		logout.click();
	}
     

}
