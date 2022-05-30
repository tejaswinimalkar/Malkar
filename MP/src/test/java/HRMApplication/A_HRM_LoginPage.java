package HRMApplication;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Base;
import OrangeApplication.HRM_Login;
import Utils.Utility;

public class A_HRM_LoginPage {
	WebDriver driver;
	
	HRM_Login HRMLogin;
	static String urlname="https://opensource-demo.orangehrmlive.com/";
	static int r=0;
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite  ");	
	}
	@Parameters("browserName")
	@BeforeTest
	public  void setBrowser(String browserName) throws InterruptedException
	{
		if(browserName.equals("chrome"))
		{
			driver= Base.openchromeDriver();
		}
		
		if(browserName.equals("edge"))
		{
			driver= Base.openEdge();
		}
		
	
	}
	

	@BeforeClass
	public void beforeclass()
	{ 
		
		     System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		r++;
		System.out.println("BeforeMethod");
	}
	
	@Test//(dependsOnMethods = "test2")//(priority=1)
	public void test1()
	{   
		HRMLogin=new HRM_Login(driver);
	    String url=driver.getCurrentUrl();
	    AssertJUnit.assertEquals(url, "https://opensource-demo.orangehrmlive.com/", "test1 Pass");
		System.out.println("Test1");
	}
	
	@Test//(timeOut=2)//(enabled = false)//(invocationCount=2)//(priority=1)
	public void test2() throws InterruptedException
	{
		HRMLogin=new HRM_Login(driver);
	    String title=driver.getTitle();
	    SoftAssert s=new SoftAssert();
	    AssertJUnit.assertEquals(title,"OrangeHRM");
	    AssertJUnit.assertEquals(100,100);    
	    AssertJUnit.assertEquals(true, true);
	    s.assertNotEquals('g', 'h');
	
		System.out.println("test2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
	   
		
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass() throws EncryptedDocumentException, IOException
	{      String name=Utility.getData(r, 0);
           String pass=Utility.getData(r, 1);
            HRMLogin.gotousername(name);
            HRMLogin.gotopassword(pass);
            HRMLogin.gotologinButton();
	  
		System.out.println("AfterClass");	
	}
	
	@AfterTest
	public void afterTest0()
	{
		driver.close();
		driver=null;
		System.gc();
		System.out.println("AfterTest 0");	
	}
	public void afterSuite()
	{
		System.out.println("AfterSuite  ");	
	}
	
}
