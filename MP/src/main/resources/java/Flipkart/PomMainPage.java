package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomMainPage {
	
	@FindBy(xpath="(//div[@class='_213eRC _2ssEMF'])[1]")
	private WebElement brand;
	
	@FindBy(xpath="(//div[@class='_213eRC _2ssEMF'])[6]")
	private WebElement parttern;
	
	@FindBy(xpath="(//div[@class='_24_Dny'])[10]")
	private WebElement Emrodery;
	
	@FindBy(xpath="(//div[@class='_312yBx SFzpgZ'])[2]")
	private WebElement image_saree;
	
	@FindBy(xpath="//a[@class='_3SkBxJ']")
	private WebElement cartButton;
	
	@FindBy(xpath="//a[contains(@href,'https://www.flipkart.com/mobile-phones-store?fm')]")
	private WebElement mobiles;
	
	
	@FindBy(xpath="(//span[@class='_2I9KP_'])[4]")
	private WebElement women;
	
	
	@FindBy(xpath="//a[@title='Sarees']")
	private WebElement sarees;
	
	public PomMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendmobiles()
	{
		mobiles.click();
	}

	public void sendwomen()
	{
		women.click();
	}

	public void sendsarees()
	{
		sarees.click();
	}
	public void sendbrand()
	{
		brand.click();
	}

	public void sendparttern()
	{
		parttern.click();
	}

	public void sendEmrodery()
	{
		Emrodery.click();
	}

	public void sendimage_saree()
	{
		image_saree.click();
	}
	

	public void sendcartButton()
	{
		cartButton.click();
	}

	public void putTocart()
	{
		mobiles.click();
		women.click();
		sarees.click();
		brand.click();
		parttern.click();
		Emrodery.click();
		image_saree.click();
		cartButton.click();
	}


}

