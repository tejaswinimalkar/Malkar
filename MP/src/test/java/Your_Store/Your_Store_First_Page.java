package Your_Store;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import YourStore.YourStore_FirstPage;

public class Your_Store_First_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		    String url=driver.getCurrentUrl();
	        System.out.println(url);
	        String title=driver.getTitle();
	        System.out.println(title);
	        if(url.equals("https://demo.opencart.com/index.php?route=account/login") && title.equals("Account Login"))
	        	System.out.println("Pass");
	        
	        else
	        	System.out.println("Fail");
	      
	        YourStore_FirstPage   store=new YourStore_FirstPage(driver);
	        store.gotousername();
	        store.gotopassword();
	        store.gotologin();
	        
	        //driver.close();
	}

}
