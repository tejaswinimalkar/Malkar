package POM_PayTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RechargeModule {

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

	public RechargeModule(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

	public void sendrbPrepaid()
	{
		rbPrepaid.click();
	}
	

	public void sendrbPostpaid()
	{
		rbPostpaid.sendKeys();
	}
	
	
	public void sendMobileNo()
	{
		mobileNumber.sendKeys("9511725196");                    //9511725196 valid no
	}
	public void sendddoperator()
	{
		ddoperator.sendKeys("");
	}

	public void sendamount()
	{
		amount.sendKeys("39");
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






