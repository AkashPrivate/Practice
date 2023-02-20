package Selenium_all_Programs.Selenium_all_Programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEntireSheet {

	public static void main(String[] args) throws IOException {

		String ProjectPath= System.getProperty("user.dir");
		File f=new File(ProjectPath+ "\\Excel_Files\\Book1.xlsx");
		FileInputStream finp=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(finp);
		XSSFSheet    sh= wb.getSheet("Student_Data");
		
		
		int rowcount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		for(int i=1;i<=rowcount;i++) {
		int cellcount=sh.getRow(i).getLastCellNum();
		System.out.println("row"+i+"data");
		
		for(int j=0;j<=cellcount; j++) {
			System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			
		}
		
		System.out.println();
		}
		
		
		
		
		
	}

}
