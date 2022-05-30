package OrangeApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment {
	
	public Recruitment(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

   	@FindBy(xpath="//a[@href='/index.php/recruitment/viewRecruitmentModule']")
	private WebElement  recruitmenttab;
   	
	@FindBy(xpath="//a[@href='/index.php/recruitment/viewJobVacancy']")
	private WebElement  vacancies;

	@FindBy(xpath="//select[@name='vacancySearch[jobTitle]']")
	private WebElement  jobTitle;

	@FindBy(xpath="//select[@name='vacancySearch[jobVacancy]']")
	private WebElement  vacancy;

	@FindBy(xpath="//select[@name='vacancySearch[hiringManager]']")
	private WebElement  hiringManager;

	@FindBy(xpath="//select[@name='vacancySearch[status]']")
	private WebElement  status;

	@FindBy(xpath="//input[@id='btnSrch']")
	private WebElement  search;

public void gotorecruitmenttab()
	{
	recruitmenttab.click();
	}
public void gotovacancies()
{
	vacancies.click();
}

public void gotojobTitle()
{
	jobTitle.sendKeys("HR Manager");
	System.out.println("jobtitle");
}

public void gotovacancy()
{
	vacancy.sendKeys("All");
}

public void gotohiringManager()
{
	hiringManager.sendKeys("All");
}

public void gotostatus()
{
	status.sendKeys("All");
}
	
public void gotosearch()
	{
	search.click();
	System.out.println("search click");
	}
public void gotoRecruitment()
	{
	recruitmenttab.click();	
	vacancies.click();
	jobTitle.sendKeys("Automation Tester");
	vacancy.sendKeys("All");
	hiringManager.sendKeys("All");
	status.sendKeys("All");
	search.click();
	}

}
