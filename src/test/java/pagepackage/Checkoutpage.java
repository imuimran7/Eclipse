package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
WebDriver driver;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cart;

@FindBy(xpath="//*[@id=\"checkout\"]")
WebElement checkout;

public Checkoutpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	//System.out.println("checkout constructor");
}
public void cartclick()
{
System.out.println("inside cart click");
	cart.click();
}
public void checkoutclick()
{
	checkout.click();
}

}
