package HRMApplication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browser.Base;
import OrangeApplication.HRM_Login;
import OrangeApplication.Recruitment;

public class A_Recruitment {
	WebDriver driver;
	HRM_Login HRMLogin;
	Recruitment r;
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
		// driver= Base.openchromeDriver();
		System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 HRMLogin=new HRM_Login(driver);
		 HRMLogin.loginToApplication("Admin","admin123");
		 Thread.sleep(2000);
		
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test()
	{
		 String url=driver.getCurrentUrl();
         System.out.println(url);
         String title=driver.getTitle();
         System.out.println(title);
         
         Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
         Assert.assertEquals(title, "OrangeHRM");
		System.out.println("test");
	}
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		  Recruitment r=new Recruitment(driver);   
		  Thread.sleep(2000);
		 
	    	r.gotorecruitmenttab();
	         Thread.sleep(3000);
	         r.gotovacancies();
	         Thread.sleep(3000);
	        r.gotojobTitle();
	        r.gotovacancy();
	        r.gotohiringManager();
	        r.gotostatus();
	        r.gotosearch();
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		driver.close();
		driver=null;
		System.gc();
		System.out.println("AfterClass");	
	}
}
