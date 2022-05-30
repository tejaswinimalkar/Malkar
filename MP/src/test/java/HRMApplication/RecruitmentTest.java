package HRMApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OrangeApplication.HRM_Login;
import OrangeApplication.Recruitment;

public class RecruitmentTest {

	public static void main(String[] args) throws InterruptedException {
	
	    System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	
	     HRM_Login HRMLogin=new HRM_Login(driver);
	     String name="Admin";
	     String pass="admin123";
	     HRMLogin.loginToApplication(name,pass);
	     Thread.sleep(2000);
	     Recruitment r=new Recruitment(driver);
	     
	     //HRMLogin.loginToApplication();
	     Thread.sleep(2000);
	     String url=driver.getCurrentUrl();
         System.out.println(url);
         String title=driver.getTitle();
         System.out.println(title);
           
         if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) //&& title.equals("))
          	System.out.println("Pass");
         else 
       	     System.out.println("Fail");  
         
        r.gotorecruitmenttab();
        r.gotovacancies();
        r.gotojobTitle();
        r.gotovacancy();
        r.gotohiringManager();
        r.gotostatus();
        r.gotosearch();
        // r.gotoRecruitment();
       
       //driver.close();

	}

}
