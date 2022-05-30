

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RechargeMobile {

	// procedure Code for radio buttons prepaid and postpaid not written
 	@FindBy(xpath="//input[@id='radio0']")
	private WebElement rbPrepaid ;

 	@FindBy(xpath="//input[@id='radio1']")
	private WebElement rbPostpaid;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	private WebElement mobileNumber;

	@FindBy(xpath="//input[@type='text']")
	private WebElement ddoperator;

	@FindBy(xpath="//input[@maxlength='30']")
	private WebElement amount;

	@FindBy(xpath="//button[@class='_11kC  _15qf _2qE6']")
	private WebElement proceedRecharge;

	public RechargeMobile(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendMobileNo()
	{
		mobileNumber.sendKeys("9511725196");
	}
	public void sendddoperator()
	{
		ddoperator.sendKeys("");
	}

	public void sendamount()
	{
		amount.sendKeys("50");
	}

	public void gotoProceedRecharge()
	{
		proceedRecharge.click();
	}
    //or
	public void gotoModulePage()
	{
		mobileNumber.sendKeys("9865327845");
		ddoperator.sendKeys(" ");
		amount.sendKeys("500");
		proceedRecharge.click();
	}

}
