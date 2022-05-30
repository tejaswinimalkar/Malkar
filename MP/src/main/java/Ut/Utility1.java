package Ut;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility1 {
	public static void captureScreenShots(WebDriver driver,int testID) throws IOException
	{
		    TakesScreenshot t=(TakesScreenshot)driver;
	        File source=t.getScreenshotAs(OutputType.FILE);
	        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH mm ss");  
		    Date date = new Date();  
		    String today=(formatter.format(date));  
	      
	        File dest =new File("C:\\Users\\Admin\\eclipse-workspace\\MP\\test-output\\ScreenShot\\Test"+testID+""+today+".jpeg");
	        FileHandler.copy(source, dest);
	}
	
	public static String getData(int r,int c) throws EncryptedDocumentException, IOException
	{
		String path="D:\\TestDataSheet1.xlsx";
		 FileInputStream file=new FileInputStream(path);
				
		Workbook book=  WorkbookFactory.create(file);
		Sheet  sheet=book.getSheet("Sheet1"); 
	//	int lastRow=sheet.getLastRowNum();    
		Row row=sheet.getRow(r);
	//	int lastcell=row.getLastCellNum();  
		String data;
		Cell cell=row.getCell(c);
		try {
				data=cell.getStringCellValue();
		}
		catch(Exception e)
		{
			data=String.valueOf(cell.getStringCellValue());
		}
		
		return (data);
	}

}
