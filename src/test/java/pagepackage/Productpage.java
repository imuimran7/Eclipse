package pagepackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Productpage {
	WebDriver driver;
	@FindBy(xpath="//*[@class=\"btn btn_primary btn_small btn_inventory \"]")
	List<WebElement> addtocart;
	public Productpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addtocart()
	{
		//System.out.println("add to cart");
		for	(WebElement cart:addtocart)
		{
			cart.click();
		}
	}
	
	
	

}
