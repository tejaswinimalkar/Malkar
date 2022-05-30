package HRMApplication;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OrangeApplication.HRM_Login;
import Utils.Utility;

public class HRM_LoginPage {
	 static String urlname=("https://opensource-demo.orangehrmlive.com/");
	static  int r=0;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    
	    System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	     
	     HRM_Login HRMLogin=new HRM_Login(driver);
		
	     String url=driver.getCurrentUrl();
         System.out.println(url);
         String title=driver.getTitle();
         System.out.println(title);
           
         if(url.equals("https://opensource-demo.orangehrmlive.com/")) //&& title.equals("))
          	System.out.println("Pass");
         else 
       	     System.out.println("Fail");  
         
        System.out.println("Tejaswini Malkar");  
		 
         String name=Utility.getData(r,0);      
         String pass=Utility.getData(r, 1);
	      HRMLogin.gotousername(name);
         HRMLogin.gotopassword(pass);
         HRMLogin.gotologinButton();
         //driver.close();

	}

}
