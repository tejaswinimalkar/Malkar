package OrangeApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_Login {
	
 	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement  username;

 	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement  password;

 	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement  loginButton;

 	
 	public HRM_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 	
    public void gotousername(String name)
	{
	     username.sendKeys(name);
	}

    public void gotopassword(String pass)
    {
	    password.sendKeys(pass);
    }

    public void gotologinButton()
	{
	   loginButton.click();
	}
    
    public void loginToApplication(String name,String pass)
	{
    	username.sendKeys(name);
    	password.sendKeys(pass);
    	loginButton.click();
	}

}
