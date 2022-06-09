package PolicyBazzar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wedge {
	
	@FindBy(xpath="//li[@class='child0 ng-star-inserted']")
	private WebElement insurer ;
	
	@FindBy(xpath="//label[@class='selectval']")
	private WebElement lifeCover ;
	
	@FindBy(xpath="//label[@class='selectval']")
	private WebElement coverAge ;
	
	@FindBy(xpath="//li[@class='child0 ng-star-inserted']")
	private WebElement claimSettled ;
	
	@FindBy(xpath="//li[@class='child0 ng-star-inserted']")
	private WebElement paymonth ;
	
	
	
	
	

}
