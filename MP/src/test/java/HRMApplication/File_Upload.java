package HRMApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import OrangeApplication.BuzzFileUpload;
import OrangeApplication.HRM_Login;

public class File_Upload {
	public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://opensource-demo.orangehrmlive.com/");
	
	     HRM_Login HRMLogin=new HRM_Login(driver);
	     HRMLogin.loginToApplication("","");    //argumentpass  String username , String password
	     Thread.sleep(2000);
	     
	     BuzzFileUpload  image_Upload= new BuzzFileUpload(driver);
	     
	     image_Upload.gototabbuzz();
	     image_Upload.gotouploadImagetab();
	     image_Upload.gotouploadImageText();
	     image_Upload.gotouploadImageButton();
	     WebElement x1=driver.findElement(By.xpath("//textarea[@id='phototext']"));
	     x1.clear();
	     x1.sendKeys("C:\\Users\\Admin\\Desktop\\Velocity\\Program List.jpeg");
	     image_Upload.gotopostButton();
	     
	     
	     
	     
	}
}
