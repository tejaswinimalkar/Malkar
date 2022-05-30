package POM_Class_FaceBook;

import org.apache.commons.math3.geometry.spherical.oned.S1Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccount {
	
	WebDriver  driver;
	Select s;
 	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")
	private WebElement firstname ;

 	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")
	private WebElement surname ;

 	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")
	private WebElement moblieNo ;

 	@FindBy(xpath="(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")
	private WebElement password ;

 	@FindBy(xpath="//select[@aria-label='Day']")
	private WebElement DDDate ;

 	@FindBy(xpath="//select[@aria-label='Month']")
	private WebElement MMDate ;
 	
 	@FindBy(xpath="//select[@aria-label='Year']")
	private WebElement yyyyDate ;

 	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement male ;
 	
 	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement female ;
 	
 	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement custom ;
 	
 	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement signup ;
 	


	public CreateNewAccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotofirstname()
	{
		firstname.sendKeys("Deepa");
	}

	public void gotosurname()
	{
		surname.sendKeys("Sankpal");
	}
	public void gotomoblieNo()
	{
		moblieNo.sendKeys("9865327845");
	}
	public void gotopassword()
	{
		password.sendKeys("Zivah12");
	}
	public void gotoDDDate()
	{
	    s=new Select(DDDate);
		s.selectByValue("16");
		//DDDate.sendKeys("16");
	}
	public void gotoMMDate()
	{
		s=new Select(MMDate);
		s.selectByIndex(0);
		//MMDate.sendKeys("Jan");
	}
	public void gotoyyyyDate()
	{
		s=new Select(yyyyDate);
		s.selectByValue("2001");
		//yyyyDate.sendKeys("2001");
	}
	public void gotomale()
	{
		Actions act=new Actions(driver);
		act.moveToElement(male).click().build().perform();
		//male.click();
	}
	public void gotofemale()
	{
		//Actions act=new Actions(driver);	
		//act.moveToElement(female).click().build().perform();
		female.click();
	}
	public void gotocustom()
	{
		Actions act=new Actions(driver);
		act.moveToElement(custom).click().build().perform();
		//custom.click();
	}
	public void gotoSignup()
	{
		signup.click();
	}
	public void creatAccount_task()
	{
		
		firstname.sendKeys("Deepa");
		surname.sendKeys("Sankpal");
		moblieNo.sendKeys("9865327845");
		password.sendKeys("Zivah");
		// mouse action
		signup.click();
	}


}