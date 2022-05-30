package Your_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import YourStore.YourStore_FirstPage;



public class A_Your_Store_FP 
{

public class A_Amazon_first_page {
	WebDriver driver;
	YourStore_FirstPage  urStore;
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
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		urStore=new YourStore_FirstPage(driver);
		System.out.println("BeforeMethod");}
	
	@Test
	public void verifyLoginPage()
	{
        String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		System.out.println(url);
		System.out.println(title);
		 if(url.equals("https://demo.opencart.com/index.php?route=account/login") && title.equals("Account Login"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");
	    
		System.out.println("test");
	}
	@AfterMethod
	public void afterClass()
	{
		urStore=new YourStore_FirstPage(driver);
		urStore.gotoModulePage();
		System.out.println("Aftermethod");	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		//driver.close();
		System.out.println("Afterclass");
	}

	
}

 
}
