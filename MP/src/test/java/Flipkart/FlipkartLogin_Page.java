package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin_Page {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//1 test case	
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
		 Thread.sleep(5000);
		 floginpage.sendclosebutton();
	    // driver.close();
         
	}

}
