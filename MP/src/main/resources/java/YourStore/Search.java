package YourStore;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search {
	
	public Search(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement  searchBar;
   	

   	@FindBy(xpath="//input[@name='search']")
	private WebElement  searchtext;
   	
	@FindBy(xpath="//input[@placeholder='Keywords']")
	private WebElement keyword ;

	@FindBy(xpath="//select[@name='category_id']")
	private WebElement  category;

	@FindBy(xpath="//input[@value='Search']")
	private WebElement  searchButton;

	
public void gotosearchtext()
	{
	searchtext.sendKeys("computer");
	}

public void gotosearchBar()
{
    searchBar.click();
}


public void gotokeyword()
{
	keyword.sendKeys("computer");
}

public void gotocategory()
{
	Select s=new Select(category);
	s.selectByIndex(2);
	//s.selectByValue("PC");
	//category.sendKeys("PC");
}

public void gotosearchButton()
	{
	searchButton.click();
	}
public void gotoModulePage()
	{
	searchtext.sendKeys("computer");
	keyword.sendKeys("computer");
	Select s=new Select(category);
	s.selectByIndex(2);
	//category.sendKeys("PC");
	searchButton.click();
	}
	


}
