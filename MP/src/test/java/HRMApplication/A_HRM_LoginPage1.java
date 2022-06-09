package HRMApplication;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.ITestContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
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
import OrangeApplication.LogoutHRM;
import Ut.Utility1;
import Utils.Utility;

public class A_HRM_LoginPage1 {
	WebDriver driver;
	static String urlname="https://opensource-demo.orangehrmlive.com/";
	static String excelsheet = "D:\\TestDataIDpass.xlsx";
	HRM_Login HRMLogin;
	LogoutHRM logout;
	int r=0;
	int c;
	int testID;
	String bname;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite  ");	
	}
	@Parameters("browserName")
	@BeforeTest
	public  void setBrowser(String browserName) throws InterruptedException
	{
		bname=browserName;
		Thread.sleep(2000);
		System.out.println(browserName);
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
	public void beforeclass() throws InterruptedException, EncryptedDocumentException, IOException
	{   
		
	//	r=r+1;
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	
	{
		driver.get(urlname);
		Thread.sleep(2000);
		HRMLogin=new HRM_Login(driver);
		//driver.get(urlname);
		Thread.sleep(2000);
	}
	/*
	@Test
	public void test1()
	{      testID=1008;	
	    String url=driver.getCurrentUrl();
	    Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/", "test1 Pass");
	}
	
	@Test
	public void test2() throws InterruptedException
	{   testID=1009;
		
	    String title=driver.getTitle();
	     Assert.assertEquals(title,"OrangeHRM");
	 }
	 */
	@Test (invocationCount=3)
	public void test3() throws EncryptedDocumentException, IOException
	{      r=r+1;
		   System.out.println("r="+r);
		   testID=1010;
		   String name=Utility1.getData(excelsheet, r, 0);                   
           String pass=Utility1.getData(excelsheet, r, 1);                   
	       HRMLogin.gotousername(name);
           HRMLogin.gotopassword(pass);          
           HRMLogin.gotologinButton();
	
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result ) throws IOException, InterruptedException
	{  
		  Thread.sleep(4000);
	
		
		if(ITestResult.FAILURE==result.getStatus())
		{		
			Utility1.captureScreenShots(driver, testID);
			//Utility.captureScreenShots(driver);
		}
		 logout=new LogoutHRM(driver);
	
		 logout.gotoaccount();
		 Thread.sleep(2000);
		 logout.gotologout();
		
	}
	@AfterClass
	public void afterClass()
	{  
//		HRMLogin.gotoaccount();
//		HRMLogin.gotologout();
	}
	
	@AfterTest
	public void afterTest0()
	{
		driver.close();
		driver=null;
		System.gc();	
	}
	public void afterSuite()
	{	
	}
	
}
