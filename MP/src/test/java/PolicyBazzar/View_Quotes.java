package PolicyBazzar;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Ut.Utility1;

public class View_Quotes {
	 WebDriver driver;
	 ArrayList<String> addr;
	 ViewQuotes termVQ;
		HomePage pb;
	@BeforeClass
	public void beforeclass()
	{
     	System.setProperty("webdriver.chrome.driver", "D:\\zChrome\\chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.policybazaar.com/");
		 pb=new HomePage(driver);
			pb.gototerm();
		 termVQ=new ViewQuotes(driver);
			 addr= new ArrayList<String>(driver.getWindowHandles());	
			driver.switchTo().window(addr.get(0)); 
			 termVQ=new ViewQuotes(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{ 
		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(2000);
		termVQ.gotogender("Male");
		termVQ.gotonameInsurer("Chetan");
		termVQ.gotodob("12/6/1985");
		termVQ.gotomobileNo("9999956321");
	
		 
	  
		termVQ.gotoviewQbutton ();
	//	 ArrayList<String> addr1= new ArrayList<String>(driver.getWindowHandles());	
	//	driver.switchTo().window(addr1.get(0));
	
	//	TermPlans q1=new TermPlans(driver);
	//	q1.gotosmokeno();
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		//System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		//System.out.println("AfterClass");	
	}
	

}
