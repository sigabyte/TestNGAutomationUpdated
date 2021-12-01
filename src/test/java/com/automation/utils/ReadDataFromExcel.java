package com.automation.utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {	
	public static void main(String args[]) throws Exception {
	
		XSSFWorkbook workbook = new XSSFWorkbook("src//test//resources//data//TestData.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		System.out.println(row.getCell(0));
		System.out.println(row.getCell(1));
		
	}

}
