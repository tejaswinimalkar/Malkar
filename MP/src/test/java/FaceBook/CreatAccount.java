package FaceBook;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Class_FaceBook.CreateNewAccount;
import POM_Class_FaceBook.LoginPage;

public class CreatAccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//1 test case	
		driver.get("https://www.facebook.com/");
		 LoginPage  loginpage=new LoginPage(driver);
		//	ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());	
		loginpage.creatAccountButton();
//		
//        String url=driver.getCurrentUrl();
//        System.out.println(url);
//        String title=driver.getTitle();
//        System.out.println(title);
//       // driver.switchTo().window(addr.get(0));      // methods use to switch the browser
//        
//        if(url.equals("https://www.facebook.com/") && title.equals("Facebook – log in or sign up"))
//        	System.out.println("Pass");
//        
//        else 
//        	System.out.println("Fail");  
		CreateNewAccount newAccount=new CreateNewAccount(driver);
		
		Thread.sleep(2000);
		newAccount.gotofirstname();
		//newAccount.gotosurname();
		newAccount.gotosurname();
		newAccount.gotopassword();
		newAccount.gotomoblieNo();
		newAccount.gotoDDDate();
		newAccount.gotoMMDate();
		newAccount.gotoyyyyDate();
		newAccount.gotofemale();
		newAccount.gotoSignup();
		
		//driver.close();
	}

}
