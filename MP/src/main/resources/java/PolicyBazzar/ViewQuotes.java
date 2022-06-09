package PolicyBazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewQuotes {

 	@FindBy(xpath="(//span[@class='checkmark'])[1]")
	private WebElement  maleButton;

 	@FindBy(xpath="(//span[@class='checkmark'])[2]")
	private WebElement femaleButton ;
 	
 	@FindBy(xpath="//input[@formcontrolname='fullName']")
	private WebElement nameInsurer ;
 	
 	@FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
	private WebElement dob ;
 	
 	@FindBy(xpath="//input[@formcontrolname='mobileNumber']")
	private WebElement mobileNo  ;
 	
 	@FindBy(xpath="//span[text()='View Free Quotes ']")
	private WebElement viewQbutton  ;
 	
 	
 	public ViewQuotes(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 	
    public void gotonameInsurer(String name)
	{
    	nameInsurer.sendKeys(name);
	}

    public void gotodob(String dateofBirth)
 	{
    	dob.sendKeys(dateofBirth);
 	}
    public void gotogender(String gender)
 	{
    	if(gender=="Male")
    		maleButton.click();
    	else
    		femaleButton.click();
     	
 	}
        
    public void gotomobileNo(String mobilenumber)
 	{
    	mobileNo.sendKeys(mobilenumber);
 	}
    
    public void gotoviewQbutton()
  	{
    	viewQbutton.click();
  	}
	
	

}
