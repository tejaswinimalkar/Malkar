package FaceBook;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Class_FaceBook.LoginPage;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

public class Login_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//1 test case	
		driver.get("https://www.facebook.com/");

        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        if(url.equals("https://www.facebook.com/") && title.equals("Facebook – log in or sign up"))
        	System.out.println("Pass");
        
        else
        	System.out.println("Fail");
         LoginPage  loginpage=new LoginPage(driver);
		 loginpage.sendUsername();
		 loginpage.sendPassword();
		 loginpage.loginButton();
			
       //loginpage.creatAccountButton();
		
	    // driver.close();
         
	}

}
