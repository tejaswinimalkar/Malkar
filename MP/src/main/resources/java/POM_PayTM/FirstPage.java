package POM_PayTM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

	@FindBy(xpath="(//div[@class='_2EGQY cqA0P'])[1]")
	private WebElement rechargeMobile;

	@FindBy(xpath="(//div[@class='_2EGQY cqA0P'])[2]")
	private WebElement rentPayment;

	@FindBy(xpath="(//div[@class='_2EGQY cqA0P'])[3]")
	private WebElement electricityBill;

	@FindBy(xpath="(//div[@class='_2EGQY cqA0P'])[5]")
	private WebElement gasCylinder;

	public FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotorechargeMobile()
	{
		rechargeMobile.click();
	}
	public void gotorentPayment()
	{
		rentPayment.click();
	}

	public void gotoelectricityBill()
	{
		electricityBill.click();
	}

	public void gotogasCylinder()
	{
		gasCylinder.click();
	}
    //or
	public void gotoModulePage()
	{
		rechargeMobile.click();
		rentPayment.click();
		electricityBill.click();
		gasCylinder.click();
	}
}
