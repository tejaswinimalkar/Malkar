package YourStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStore_FirstPage 
{

	public YourStore_FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@name='email']")
	private WebElement username;

	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement login;

	@FindBy(xpath="//a[text()='Continue']")
	private WebElement register;

public void gotousername()
	{
	username.sendKeys("Admin");
	}

public void gotopassword()
{
	password.sendKeys("Admin123");
}

public void gotologin()
	{
	login.click();
	}

public void gotoregister()
{
	register.click();
}

public void gotoModulePage()
	{
	username.sendKeys("Admin");
	password.sendKeys("Admin123");
	login.click();
	}
}
