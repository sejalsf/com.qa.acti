package com.acti.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public int ExcelLib(String Excelpath) {
		try{
			File src = new File(Excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Unable to load the Excel Sheet Please check the path"+e.getMessage());
			
			
		}
		//Sheet num is used to get the active rows from the excel sheet
		Object sheetnum;
		public int void getRows(int sheetnum)
		{
			int rows = wb.getSheetAt(sheetnum).getLastRowNum()+1;
			return rows;
		}
		
		//This method is used to get data from excel
		public void getCelldata(int sheetnum,int row,int col) {
			int rows = wb.getSheetAt(sheetnum).getLastRowNum()+1
		}
		
}
}
