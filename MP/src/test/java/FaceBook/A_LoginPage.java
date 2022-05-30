package FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Class_FaceBook.LoginPage;

public class A_LoginPage {
	WebDriver driver;
	LoginPage  loginpage;
	@BeforeClass
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
	    driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void fetchUrl()
	
	{
		driver.get("https://www.facebook.com/");
	    loginpage=new LoginPage(driver);
     
		//System.out.println("BeforeMethod");
	    }
	
	@Test 

	public void VerifyLoginURL()
	{         
 	         String url=driver.getCurrentUrl();
	        System.out.println(url);
	        Assert.assertEquals(url,"https://www.facebook.com/");
//		   if(url.equals("https://www.facebook.com/"))
//	        	System.out.println("Pass");
//	        
//	        else
//	        	System.out.println("Fail");
	   //  Ass//ert.fail();
		System.out.println("test1");
	}
	
	@Test //(timeOut=5)
	public void verifyLoginTitle() throws InterruptedException
	{
	        String title=driver.getTitle();
	        System.out.println(title);
	        SoftAssert soft=new SoftAssert();
	        soft.assertEquals(title,"Facebook – log in or sign up");
	       // Assert.assertEquals(url,"https://www.facebook.com/");
//		   if( title.equals("Facebook – log in or sign up"))
//	        	System.out.println("Pass");
//	        
//	        else
//	        	System.out.println("Fail");
	       // soft.assertEquals("Hello","Hi");
	       // soft.assertEquals("Bye","Bye");
	     //   soft.assertEquals("Hi","Facebook – log in or sign up");
	     //   soft.assertAll();
	        Thread.sleep(6000);
		System.out.println("test2");
	} 
	@AfterClass
	public void afterClass()
	{
	      loginpage.sendUsername();
	      loginpage.sendPassword();
          loginpage.loginButton()  ; 
		
		System.out.println("AfterClass");	
	}
	
	@AfterMethod
	public void afterMethod()
	{
		//driver.close();
		System.out.println("AfterMethod");
	}
	
}
