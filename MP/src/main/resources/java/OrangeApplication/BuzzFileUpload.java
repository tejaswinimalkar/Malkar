package OrangeApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzFileUpload {
	
	public BuzzFileUpload(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

   	@FindBy(xpath="//a[@href='/index.php/buzz/viewBuzz'] ")
	private WebElement  tabbuzz;
   	
   	@FindBy(xpath="//li[@id='tabLink2']")
	private WebElement  uploadImagetab;
   	
   	@FindBy(xpath="//textarea[@id='phototext']")
	private WebElement  uploadImageText;
   	
   	@FindBy(xpath="//input[@id='image-upload-button']")
	private WebElement  uploadImageButton;
   	
   
   	@FindBy(xpath="//li[@id='tabLink3']")
	private WebElement  uploadVideotab;
   	
	@FindBy(xpath="//input[@id='imageUploadBtn']")
	private WebElement  postButton;
  
  
public void gototabbuzz()
	{
	tabbuzz.click();
    }
	
public void gotouploadImagetab()
	{
	uploadImagetab.click();
    }
public void gotouploadImageText()
	{
	uploadImageText.sendKeys("C:\\Users\\Admin\\Desktop\\Velocity\\Program List.jpeg");
			
	}
public void gotouploadImageButton()
{
	//uploadImageButton.click();	
}
public void gotopostButton()
{
	postButton.click();	
}



}
