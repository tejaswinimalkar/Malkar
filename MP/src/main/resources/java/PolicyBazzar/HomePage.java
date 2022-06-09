package PolicyBazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[1]")
	private WebElement  termTab;

 	@FindBy(xpath="(//div[@class='shadowHandlerBox'])[2]")
	private WebElement  healthTab;

// 	@FindBy(xpath="//input[@id='btnLogin']")
//	private WebElement  loginButton;

 
 	
 	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 	
    public void gototerm()
	{
    	termTab.click();
	}

    public void gotohealth()
    {
    	healthTab.click();
    }

   
  
	

}
