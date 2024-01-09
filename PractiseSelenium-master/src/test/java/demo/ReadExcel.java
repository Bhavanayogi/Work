package demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		String path = "C:\\Onedrive\\OneDrive - RealPage\\Documents\\write.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data1 from excel is::"+data1);
		
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data2 from excel is::"+data2);
		
		

	}

}	
