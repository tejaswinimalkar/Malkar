package PolicyBazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermPlans {
	
	//Question 1
	@FindBy(xpath="//div[@class='model-body ng-tns-c70-1']")
	private WebElement  smoke;

 	@FindBy(xpath="//input[@value='Yes']")
	private WebElement smokeyes ;
 	
	@FindBy(xpath="(//input[@value='No']")
	private WebElement smokeno ;
	
	//Question 2
	@FindBy(xpath="//div[contains(@class,'slide-box annuabox ng-tns-c70-1 ng-trigger ng-trigger-divState ng-star-inserted')]")
	private WebElement annualIncome ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[1]")                      // 15 lac +
	private WebElement a1 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[2]")                    //10 lac to 14.9 lac
	private WebElement a2 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[3]")                    //7 lac to 9.9 lac     
	private WebElement a3 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[4]")                    //5 lac to 6.9 lac
	private WebElement a4 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[5]")                   //3 lac to 4.9 lac
	private WebElement a5 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[6]")                   //2 lac to 2.9 lac
	private WebElement a6 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[7]")                   //less than 2lac
	private WebElement a7 ;
	
	@FindBy(xpath="(//button[@class='ng-tns-c70-1 ng-star-inserted'])[1]")
	private WebElement previousButton ;
	
	@FindBy(xpath="(//button[@class='ng-tns-c70-1 ng-star-inserted'])[2]")
	private WebElement nextButton ;
		
	
	// Question 3
	
	@FindBy(xpath="//input[@value='Salaried']")
	private WebElement salaried ;
	
	@FindBy(xpath="//input[@value='Self Employed']")
	private WebElement selfEmployed ;
	
	
	//Question 4
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[1]")             	//College graduate & above 
	private WebElement eduCollege ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[2]")               // 12 pass 
	private WebElement edu12 ;
	
	@FindBy(xpath="(//i[@class='ng-tns-c70-1'])[3]")               //10  pass or below
	private WebElement edu10 ;
	
	
	// Question 5
	@FindBy(xpath="//input[@value='Yes']")               // yes from maharashtra 
	private WebElement yesResidence ;
	
	
	@FindBy(xpath="//input[@value='No']")               // not from maharashtra 
	private WebElement noResidence ;
	
	
	
	public TermPlans(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 	
    public void gotosmokeno()
	{
    	smokeno.click();
	}
    
    public void gotosmokeyes()
  	{
    	smokeyes.click();
  	}
			
  
}
