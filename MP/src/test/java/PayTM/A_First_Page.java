package PayTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_PayTM.FirstPage;
import POM_PayTM.RechargeModule;

public class A_First_Page {
	
	WebDriver driver;
	FirstPage  firstpage;
	RechargeModule recharge;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void rechargeModule()
	{
		driver.get("https://paytm.com//");
		 firstpage=new FirstPage(driver);
	}
	
	@Test
	public void verifyRechargePage()
	{
		firstpage.gotorechargeMobile();
		 recharge=new RechargeModule(driver);
		
		   String url=driver.getCurrentUrl();
	        System.out.println(url);
	        String title=driver.getTitle();
	        System.out.println(title);
	    	Assert.assertEquals(url, "https://paytm.com/recharge");
	    	Assert.assertEquals(title, "Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans");
		/*   if(url.equals("https://paytm.com/recharge") && title.equals("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");   */
	}
	@Test
	public void verifyMobileNo()
	{
		
	}
	@AfterMethod
	public void setRechargeValue()
	{
		recharge.sendMobileNo();
		recharge.sendddoperator();
		recharge.sendamount();
		recharge.gotoProceedRecharge();	
		
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Recharge Done");
		//driver.close();

	}


}
