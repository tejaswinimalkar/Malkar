package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
     		driver.get("https://www.flipkart.com/");

        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        if(url.equals("https://www.flipkart.com/") && title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
        	System.out.println("Pass");
        
        else
        	System.out.println("Fail");
        FlipkartLoginPage  floginpage=new FlipkartLoginPage(driver);
		 floginpage.sendUsername();
		 floginpage.sendPassword();
		 Thread.sleep(3000);
		 floginpage.sendclosebutton();

		 PomMainPage flipMP=new PomMainPage(driver);
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
		 flipMP.sendimage_saree();
		// flipMP.sendcartButton();
	    // driver.close();
         
	}
	
}