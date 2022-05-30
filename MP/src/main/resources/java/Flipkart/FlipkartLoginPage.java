package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement username;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//a[@class='_1_3w1N']")
	private WebElement login;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginapp;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closebutton;
	
	@FindBy(xpath="//a[@href='/account/login?signup=true']")
	private WebElement creataccount;
	
	@FindBy(xpath="//a[@class='_2QKxJ- _2_DUc_']")
	private WebElement forgot;

	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")
	private WebElement otp;
	

	public FlipkartLoginPage(WebDriver driver)
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

	public void sendloginapp()
	{
		loginapp.click();
	}

	public void sendclosebutton()
	{
		closebutton.click();
	}

	public void sendcreataccount()
	{
		creataccount.click();
	}

	public void sendforgot()
	{
		forgot.click();
	}

	public void sendotp()
	{
		otp.click();
	}
	

	public void loginButton()
	{
		login.click();
	}

	public void loginToApp()
	{
		login.click();
		username.sendKeys("9922449797 ");
		password.sendKeys("teju1983");
		loginapp.click();
	}

}
