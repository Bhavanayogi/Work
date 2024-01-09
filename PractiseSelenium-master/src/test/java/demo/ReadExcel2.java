package demo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws Exception {
		
		String path = "C:\\Onedrive\\OneDrive - RealPage\\Documents\\write.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		
		int rowCount = sh1.getLastRowNum();
		
		System.out.println("Total rows are::"+rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			String data =sh1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row::"+i+" is "+ data);
		}

	}

}
