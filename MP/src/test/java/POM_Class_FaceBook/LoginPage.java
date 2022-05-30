package POM_Class_FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {  
	
	@FindBy(xpath="//input[@data-testid='royal_email']")
	private WebElement username;

	@FindBy(xpath="//input[@name='pass']")
	private WebElement password;

	@FindBy(xpath="//button[@value='1']")
	private WebElement login;

	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement creatAccount;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUsername()
	{
		username.sendKeys("9922449797 ");
	}
	public void sendPassword()
	{
		password.sendKeys("teju1983");
	}

	public void loginButton()
	{
		login.click();
	}

	public void creatAccountButton()
	{
		creatAccount.click();
	}
    //or
	public void LoginToApplication()
	{
		username.sendKeys("Admin");
		password.sendKeys("manager");
		login.click();
		creatAccount.click();
	}
}
