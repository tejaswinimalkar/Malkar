package PolicyBazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Policy_Bazzar {
	WebDriver driver;
	HomePage pb;
	@BeforeClass
	public void beforeclass()
	{
		 System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://www.policybazaar.com/");
	     
	     
		System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		HomePage pb=new HomePage(driver);
		pb.gototerm();
		
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test()
	{
	
		System.out.println("test");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("AfterClass");	
	}

}
