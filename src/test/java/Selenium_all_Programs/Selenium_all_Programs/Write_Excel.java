package Selenium_all_Programs.Selenium_all_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	

	public static void main(String[] args) throws IOException {

		String ProjectPath= System.getProperty("user.dir");
		File f = new File(ProjectPath+ "\\Excel_Files\\Book1.xlsx");
		FileInputStream finp=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(finp);
		XSSFSheet sh= wb.getSheet("Student_data");
		XSSFRow row=sh.createRow(6);
		
		row.createCell(0).setCellValue("nilesh");
		row.createCell(1).setCellValue("akash");
		row.createCell(2).setCellValueImpl(0.000008);
		
		FileOutputStream outputStream=new FileOutputStream(ProjectPath+ "\\Excel_Files\\Book1.xlsx");
		wb.write(outputStream);
		wb.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
