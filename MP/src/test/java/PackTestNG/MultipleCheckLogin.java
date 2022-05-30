package PackTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleCheckLogin {
	
	 int r,c;
	@BeforeClass
	public void openExcelFile() throws InterruptedException, EncryptedDocumentException, IOException
	{
		 String path="D:\\TestDataIDpass.xlsx";
		 FileInputStream file=new FileInputStream(path);
			Workbook book=  WorkbookFactory.create(file);
			Sheet  sheet=book.getSheet("Sheet1");
			Thread.sleep(2000);
		     int lastRow=sheet.getLastRowNum();
		     Row row=sheet.getRow(2);
		     int lastcell=row.getLastCellNum();
		     r=1;c=0;
		     				
			
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		    System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
		     WebDriver driver= new ChromeDriver();
		     driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("validate page");
	}
	
	@Test
	public void test2()
	{
		System.out.println("validate password");
	}
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	
	public void afterClass()
	{
		System.out.println("AfterClass");	
	}


}
