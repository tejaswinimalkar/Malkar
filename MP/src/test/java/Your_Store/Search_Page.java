package Your_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import YourStore.Search;

public class Search_Page {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		Thread.sleep(2000);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		Search s=new Search(driver);
        s.gotosearchBar();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        if(url.equals("https://demo.opencart.com/index.php?route=product/search") && title.equals("Search"))
        	System.out.println("Pass");
        
        else
        	System.out.println("Fail");

       
     
           s.gotokeyword();
           s.gotocategory();
           s.gotosearchButton();
         //driver.close();

	}

}
