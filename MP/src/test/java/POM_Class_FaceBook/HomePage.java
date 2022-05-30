package POM_Class_FaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement messenger;

	@FindBy(xpath="(//div[@aria-label='Notifications, 16 unread'])")
	private WebElement notifications;

	@FindBy(xpath="//div[@aria-label='Your profile']")
	private WebElement yourProfile;

	@FindBy(xpath="")
	private WebElement yourText;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoMessenger()
	{
		messenger.click();
	}
	public void gotoNotifications()
	{
		notifications.click();
	}

	public void gotoYourProfile()
	{
		yourProfile.click();
	}

	public void creatAccountButton()
	{
		yourText.sendKeys("Hello");
		
	}	
}
