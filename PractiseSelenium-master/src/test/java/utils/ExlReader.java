package utils;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExlReader {
	
	private XSSFSheet ExcelWSheet;
	private XSSFWorkbook ExcelWBook;
	private XSSFCell Cell;
	private XSSFRow Row;
	private XSSFRow ColHeader;
	static HashMap<String, String> dataHm = new HashMap<String, String>();

		// This method is to set the File path and to open the Excel file,
		// Pass Sheetname as Arguments to this method
		
		public void setExcelSheet(String FileName, String SheetName) throws Exception {

			try {
				String PathtoDataFile = System.getProperty("user.dir") + "\\src\\testData\\" + FileName + ".xlsx";
				FileInputStream DataFile = new FileInputStream(PathtoDataFile);
				ExcelWBook = new XSSFWorkbook(DataFile);

				ExcelWSheet = ExcelWBook.getSheet(SheetName);
			} catch (Exception e) {
				throw (e);
			}
		}

		// This method is to read the test data from the Excel cell, in this we are
		// passing parameters as Row num and Col num
		
		public String getCellData(int RowNum, String ColName) throws Exception {

			try {

				ColHeader = ExcelWSheet.getRow(0);
				String CellData = "";
				for (int i = 0; i < ColHeader.getLastCellNum(); i++) {
					if (ColHeader.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColName)) {
						Cell = ExcelWSheet.getRow(RowNum).getCell(i);
						CellData = Cell.getStringCellValue();
						System.out.println("card used -"+CellData);
						break;
					}
				}
				return CellData;

			} catch (Exception e) {
				System.out.println(e);

				return "";

			}

		}


		public String getDataFromExcel(String FileName, String SheetName,int RowNum,String ColName) throws Exception 
		{
			try {
				String PathtoDataFile = System.getProperty("user.dir") + "\\src\\test\\resources\\" + FileName + ".xlsx";
				FileInputStream DataFile = new FileInputStream(PathtoDataFile);
				ExcelWBook = new XSSFWorkbook(DataFile);
				ExcelWSheet = ExcelWBook.getSheet(SheetName);
				ColHeader = ExcelWSheet.getRow(0);
				String CellData = "";
				for (int i = 0; i < ColHeader.getLastCellNum(); i++) {
					if (ColHeader.getCell(i).getStringCellValue().trim().equalsIgnoreCase(ColName)) {
						Cell = ExcelWSheet.getRow(RowNum).getCell(i);
						CellData = Cell.getStringCellValue();
						break;
					}
				}
				return CellData;
				
			} catch (Exception e) {
				throw (e);
			}
		}
	
		public HashMap<String, String> getData()
		{
			ColHeader = ExcelWSheet.getRow(0);
			
			for(int i=0;i<ColHeader.getLastCellNum();i++)
			{
				dataHm.put(ColHeader.getCell(i).getStringCellValue(), ExcelWSheet.getRow(1).getCell(i).getStringCellValue());
			}
            //System.out.println(dataHm);
			return dataHm;
		}

		
		/*
		 * public static void main(String[] args) throws Exception { ExlReader t1=new
		 * ExlReader(); t1.setExcelSheet("AutomationTestData", "login"); //
		 * System.out.println(t1.getCellData(1, "city")); t1.getData();
		 * //System.out.println(t1.getData());
		 * System.out.println(dataHm.get("username"));
		 * System.out.println(dataHm.get("password")); }
		 */
}
