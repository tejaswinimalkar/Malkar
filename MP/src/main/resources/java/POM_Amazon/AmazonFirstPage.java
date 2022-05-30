package POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFirstPage {
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchtext;

	@FindBy(xpath="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement cartButton;

	@FindBy(xpath="//a[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement fashion;

	@FindBy(xpath="//img[@alt='One Plus Pre Pre Tease']")
	private WebElement image1;
	
 	@FindBy(xpath="(//img[contains(@src,'https://images-eu.ssl-images-amazon.com')])[11]")
	private WebElement womenCollection ;



	public AmazonFirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gotoSearchText()
	{
		searchtext.sendKeys("Mobile");
	}
	public void gotoCartButton()
	{
		cartButton.click();
	}

	public void gotoFashion()
	{
		fashion.click();
	}

	public void gotoImage1()
	{
		image1.click();
	}
	public void gotoWomenCollection()
	{
		womenCollection.click();
	}

   }
