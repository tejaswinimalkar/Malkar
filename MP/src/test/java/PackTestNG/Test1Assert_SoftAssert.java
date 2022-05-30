package PackTestNG;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1Assert_SoftAssert {
	
	@BeforeClass
	public void beforeclass1()
	{
		System.out.println("BeforeClass 1");	
	}
	
	@BeforeMethod
	public void beforeMethod1()
	
	{
		System.out.println("BeforeMethod 1");
	}

	@Test     //  (priority=1)
	public void testM(ITestResult result)
	{   System.out.println("test  M");
	     ITestContext  context=result.getTestContext();
	      System.out.println(context.getAttribute("testId"));
		//Actual is equals to Expected ==> Test Case -PASS
		//Actual is not equals to Expected ==> Test Case -FAILED
		Assert.assertEquals("Hi", "Hi");
		
	}

	
	@Test
	public void testN()
	{
		System.out.println("test  N");
		//Actual is equals to Expected ==> Test Case -FAILED
		//Actual is not equals to Expected ==> Test Case -PASS
		Assert.assertNotEquals(0.1, 1.0, 0, "PASS");		
	}
	@Test //(dependsOnMethods= {"test", "test0"})
	public void testO()
	{
		System.out.println("test  O");
		String url="https://paytm.com/recharge";
		boolean result=url.equals("https://paytm.com/recharge");
		
		//result=> true  -   Test Case=> Pass
		//result=>false  -   Test Case=> fail
		Assert.assertTrue(result);
		
	}
	@Test   (invocationCount=3)
	public void testP() 
	{
		System.out.println("test  P");
		String url="https://paytm.com/recharge";
		boolean result=url.equals("recharge");
			
		//result=> true  -   Test Case=> Pass
		//result=>false  -   Test Case=> fail
		Assert.assertFalse(result, url);
		
	}
	@Test //(timeOut=6) // (enabled= false)
	public void testQ()
	{
		System.out.println("test  Q");
		//Forcefully failed the test case
		//Assert.fail("Forcefully failed");	
	}
			
	@AfterMethod
	public void afterMethod1()
	{
		System.out.println("AfterMethod   1");
	}
	
	@AfterClass
	
	public void afterClass1()
	{
		System.out.println("AfterClass   1");	
	}

	

}

//Listener
//ITestContext  context=result.getTestContext();
	//	System.out.println(context.getAttribute("testId"));
		
