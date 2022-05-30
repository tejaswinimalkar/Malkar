import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_Amazon.AmazonFirstPage;

public class A_Amazon_first_page {
	WebDriver driver;
	AmazonFirstPage amazonFP;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void launchLoginPage()
	
	{
		driver.get("https://www.amazon.in/");
		 amazonFP=new AmazonFirstPage(driver);
		System.out.println("BeforeMethod");}
	
	@Test
	public void verifyLoginPage()
	{
        String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
	    Assert.assertEquals(url, "https://www.amazon.in/");
	    Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	/*	 if(url.equals("https://www.amazon.in/") && title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");    */
	    
		System.out.println("test");
	}
	@AfterMethod
	public void afterClass()
	{
		amazonFP.gotoFashion();
		System.out.println("Aftermethod");	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
		System.out.println("Afterclass");
	}

	
}
