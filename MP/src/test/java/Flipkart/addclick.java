package Flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addclick {

	public static void main(String[] args) {
		
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
//           FlipkartLoginPage  floginpage=new FlipkartLoginPage(driver);
//   		 floginpage.sendUsername();
//   		 floginpage.sendPassword();
//   		 Thread.sleep(3000);
//   		 floginpage.sendclosebutton();
//   		 
           
   	//	 WebElement  x1=driver.findElement(By.xpath("(//img[@class='kJjFO0'])[1])");
   		//   x.

		
		
		
		
		
		
	}

}
