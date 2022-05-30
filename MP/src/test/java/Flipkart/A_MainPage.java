package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_MainPage {
	WebDriver driver;
	 FlipkartLoginPage  floginpage;
	 PomMainPage flipMP;
	 
	@BeforeClass
	public void beforeclass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		 driver.get("https://www.flipkart.com/");
		  floginpage=new FlipkartLoginPage(driver);
		    Thread.sleep(2000);
			 floginpage.sendUsername();
			 floginpage.sendPassword();
			// Thread.sleep(3000);
			 floginpage.sendclosebutton();
     		System.out.println("BeforeClass");	
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException	
	{
	//	driver.get("https://www.flipkart.com/");
//		    floginpage=new FlipkartLoginPage(driver);
//		    Thread.sleep(2000);
//			 floginpage.sendUsername();
//			 floginpage.sendPassword();
//			// Thread.sleep(3000);
//			 floginpage.sendclosebutton();
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void verifyMainPageURL()
	{
		    String url=driver.getCurrentUrl();
	        System.out.println(url);
	        Assert.assertEquals(url, "https://www.flipkart.com/");
		System.out.println("test url");
	}
	
	@Test
	public void verifyMainPageTitle()
	{    
		String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("test title");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void afterClass() throws InterruptedException
	{
		    flipMP=new PomMainPage(driver);
			// flipMP.putTocart();
			 flipMP.sendmobiles();
			 flipMP.sendwomen();
			 flipMP.sendsarees();
		        WebDriverWait wait  =new WebDriverWait(driver,2); 
				
				WebElement x1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_213eRC _2ssEMF'])[1]")));
			//	Thread.sleep(2000);
			 flipMP.sendbrand();
			 Thread.sleep(2000);
			 flipMP.sendparttern();
			 Thread.sleep(2000);
			 flipMP.sendEmrodery();
			//  WebDriverWait wait1  =new WebDriverWait(driver,2);
			// WebElement x2=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='_2r_T1I'])[3]")));
			 Thread.sleep(2000);
			// flipMP.sendimage_saree();
			 flipMP.sendcartButton();
		    //  driver.close();
		System.out.println("AfterClass");	
	}


}
