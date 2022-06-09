package OrangeApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutHRM {
	
	@FindBy(xpath="//a[@id='welcome']")
	private WebElement  account;
 	
 	@FindBy(xpath="//a[text()='Logout']")
	private WebElement  logoutButton;
 
 	public LogoutHRM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 	
 	  public void gotoaccount()
 	   	{
 		 //  Actions act=new Actions();
 		   
 	   	   account.click();
 	   	}
 	    
 	    public void gotologout()
 	 	{
 	 	   logoutButton.click();
 	 	}

}
