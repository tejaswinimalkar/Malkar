package PackTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.Base;

public class TestAssert_SoftAssert {

	WebDriver driver;
	@BeforeSuite
	
	
		public  void setBrowser(String browser)
		{
			if(browser.equals("chrome"))
				driver= Base.openchromeDriver();
			
			if(browser.equals("edge"))
				driver= Base.openchromeDriver();
			
			if(browser.equals("opera"))
				driver= Base.openchromeDriver();	
		}

	//	System.out.println("BeforeSuite  0");	
	
	
	@BeforeTest
	public void beforeTest0()
	{
		System.out.println("Beforetest 0");	
	}
	
	
	@BeforeClass
	public void beforeclass0()
	{
		System.out.println("BeforeClass 0");	
	}
	
	@BeforeMethod
	public void beforeMethod0()
	
	{
		System.out.println("BeforeMethod 0");
	}

	@Test    //   (priority=1)
	public void testA()
	{   System.out.println("test A");
		//Actual is equals to Expected ==> Test Case -PASS
		//Actual is not equals to Expected ==> Test Case -FAILED
		Assert.assertEquals("Hi", "Hi");
		
	}

	
	@Test
	public void testB()
	{
		System.out.println("test  B");
		//Actual is equals to Expected ==> Test Case -FAILED
		//Actual is not equals to Expected ==> Test Case -PASS
		Assert.assertNotEquals(0.1, 1.0, 0, "PASS");		
	}
	@Test // (dependsOnMethods= {"testA", "testB"})
	public void test1()
	{
		System.out.println("testC");
		String url="https://paytm.com/recharge";
		boolean result=url.equals("https://paytm.com/recharge");
		
		//result=> true  -   Test Case=> Pass
		//result=>false  -   Test Case=> fail
		Assert.assertTrue(result);
		
	}
	@Test // (invocationCount=3)
	public void testD() 
	{
		System.out.println("test2");
		String url="https://paytm.com/recharge";
		boolean result=url.equals("recharge");
			
		//result=> true  -   Test Case=> Pass
		//result=>false  -   Test Case=> fail
		Assert.assertFalse(result, url);
		
	}
	@Test //(timeOut=6) // (enabled= false)
	public void testE()
	{
		System.out.println("test3");
		//Forcefully failed the test case
		//Assert.fail("Forcefully failed");	
		
	}
	
		
	@AfterMethod
	public void afterMethod0()
	{
		System.out.println("AfterMethod 0");
	}
	
	@AfterClass
	public void afterClass0()
	{
		System.out.println("AfterClass 0");	
	}
	
	@AfterTest
	public void afterTest0()
	{
		System.out.println("AfterTest 0");	
	}
	
	@AfterSuite
	public void afterSuite0()
	{
		System.out.println("AfterSuite 0 ");	
	}

	
}

/*
<class name="PackTestNG.ClassTestNG"/>
<class name="PackTestNG.MultipleCheckLogin"/>   */
