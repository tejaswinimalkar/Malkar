package FaceBook;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Class_FaceBook.CreateNewAccount;
import POM_Class_FaceBook.LoginPage;

public class A_Creat_Account {
	WebDriver driver;
	CreateNewAccount newAccount;
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 
		System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{     LoginPage  loginpage=new LoginPage(driver);
      	//	ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());	
	      loginpage.creatAccountButton();
	      newAccount=new CreateNewAccount(driver);

		System.out.println("BeforeMethod");}
	
	@Test
	public void verifyURL()
	
	{
		  String url=driver.getCurrentUrl();
	        System.out.println(url);
	    
	        Assert.assertEquals(url, "https://www.facebook.com/");
	        
	      //  driver.switchTo().window(addr.get(0));      // methods use to switch the browser
	  /*      if(url.equals("https://www.facebook.com/") && title.equals("Facebook – log in or sign up"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");   
			
		System.out.println("test");      */
	}
	@Test
	public void verifyTitle()
	{
		 String title=driver.getTitle();
	        System.out.println(title);
	        Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	@AfterClass
	public void afterClass() throws InterruptedException
	{   Thread.sleep(2000);
		newAccount.gotofirstname();
		//newAccount.gotosurname();
		newAccount.gotosurname();
		newAccount.gotopassword();
		newAccount.gotomoblieNo();
		newAccount.gotoDDDate();
		newAccount.gotoMMDate();
		newAccount.gotoyyyyDate();
		newAccount.gotofemale();
		newAccount.gotoSignup();
		
		System.out.println("AfterClass");	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}

	

}
