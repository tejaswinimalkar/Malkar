package NewPackage;

import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class checkdata {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		   
	   //  String path="D:\\TestDataIDpass.xlsx";
		//	FileInputStream inputStream1=new FileInputStream(path);
		/*	//Thread.sleep(2000);
			
			XSSFWorkbook workbook=new XSSFWorkbook(inputStream1);
			XSSFSheet sheet=workbook.getSheet("Sheet1");
		//	Thread.sleep(2000);
			 int rows=sheet.getLastRowNum();
			 int cols=sheet.getRow(1).getLastCellNum();
			 for(int r=0;r<=rows;r++)
				 {
		
				    System.setProperty("webdriver.chrome.driver", "F:\\ProjectChrome\\chromedriver.exe");
				     WebDriver driver= new ChromeDriver();
				     driver.get("https://opensource-demo.orangehrmlive.com/");
					
				     
				     WebElement user=driver.findElement(By.xpath("//input[@id='txtUsername']"));
				     WebElement passsword=driver.findElement(By.xpath("//input[@id='txtPassword']"));
				     WebElement loginButton=driver.findElement(By.xpath("//input[@id='btnLogin']"));
							 
				 
				     XSSFRow row=sheet.getRow(r);
				 	 XSSFCell cellr0 =row.getCell(0);
		             String valueUser=cellr0.getStringCellValue();
		             user.sendKeys(valueUser);
			
		             XSSFCell cellr1 =row.getCell(1);
		           //  String valuepass=cellr1.getStringCellValue();
		             passsword.sendKeys(cellr1.getStringCellValue());
		             
		             loginButton.click();
		             String url=driver.getCurrentUrl();
		             System.out.println(url);
		             String title=driver.getTitle();
		             System.out.println(title);
		            
		             if(url.equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard"))//&& title.equals(""))
		            	 System.out.println("Log in pass "+ r);
		             else
		            	 System.out.println("Log in fail "+ r);
				 
		             Thread.sleep(5000);
				     driver.close();            
				 }	 */
		}

}
