package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.Checkoutpage;
import pagepackage.Productpage;
import pagepackage.Saucefill;
import pagepackage.Sauceloginpage;
import utilities.Excelutils;




public class Saucelogintest {
	WebDriver d;
	@BeforeTest
	public void url()
	{
		
d=new ChromeDriver();
d.get("https://www.saucedemo.com/");
d.manage().window().maximize();

}
	
		@Test
		public void verifyLoginWithValidCred () throws Exception

		{
		            Sauceloginpage p1 = new Sauceloginpage(d);
                     Productpage s=new Productpage(d);
                     Checkoutpage c;
                     Saucefill f=new Saucefill(d);
		// Reading the data from excel file by the specified path

		            String xl = "C:\\Users\\iru10\\Downloads\\Booksauce1.xlsx";

		            String Sheet = "Sheet1";

		            int rowCount1 = Excelutils.getRowCount1(xl, Sheet);

		            for (int i=1;i<=rowCount1;i++)

		            {

		                        String UserName=Excelutils.getCellValue1(xl, Sheet, i, 0);
	                               System.out.println("username---"+UserName);
		                        String Pwd=Excelutils.getCellValue1(xl, Sheet, i, 1);
	                             System.out.println("password---"+Pwd);
		                        //Passing Username and password as parameters
		                        p1.setvalues(UserName, Pwd);
	                         //Submitting the data by clicking on login button                   
	                             p1.loginbutton();
		                        
		                        
		                        
		                        String expectedurl="https://www.saucedemo.com/inventory.html";
		          			  String actualurl= d.getCurrentUrl();
		          			  
		          			     if(actualurl.equals(expectedurl))
		          			     {
		          			    	System.out.println("pass");
		          			    	s.addtocart();
		          			    	 c=new Checkoutpage(d);
		          			    	c.cartclick();
		          			    	c.checkoutclick();
		          			    	f.setvalues("IMRAN","I","682021");
		          			    	f.continueclick();
		          			    	f.finishclick();
		          			    	Thread.sleep(5000);
		          			    	f.backclick();
		          			    
		          			    	f.burgclick();
		          			    	f.logclick();
		          			    	
		          			    	
		          			     }else
		          			     {
		          			    	System.out.println("fail");
		          			     }
		                         

		                        
		            }
	}

	}


