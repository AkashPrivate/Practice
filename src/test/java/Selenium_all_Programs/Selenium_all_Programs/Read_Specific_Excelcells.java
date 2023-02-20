package Selenium_all_Programs.Selenium_all_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Specific_Excelcells {
	
	
	

	public static void main(String[] args) throws IOException {
		

		
		String ProjectPath=System.getProperty("user.dir");
		
		File f = new File( ProjectPath + "\\Excel_Files\\Book1.xlsx");
		FileInputStream finp=new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(finp);
		XSSFSheet sheet= wb.getSheet("Student_Data");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		String firstname=cell.getStringCellValue();
		System.out.println(firstname);
		
		
		
		
		
	}

}
