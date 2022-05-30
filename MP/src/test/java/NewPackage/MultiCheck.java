package NewPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class MultiCheck {

public static void main(String[] args) throws IOException, InterruptedException {
	String path="D:\\TestDataSheet1.xlsx";
	
	FileInputStream file=new FileInputStream(path);
	
	Workbook book=  WorkbookFactory.create(file);
	
	Sheet  sheet=book.getSheet("Sheet1");
	
	//int lastRow=sheet.getLastRowNum();     // for condition
	
	Row row=sheet.getRow(1);
	
	System.out.println("row "+row);
	
	
	//int lastcell=row.getLastCellNum();     //  for condition
	
	Cell cell=row.getCell(1);
	
	String v=cell.getStringCellValue();
	
	System.out.println(v);

		
		}
}



