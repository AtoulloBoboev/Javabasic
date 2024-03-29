package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelIntro {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\Atoul\\Downloads\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(1);
		
		//Getting data/information from the cell
		String info = cell.toString();
		System.out.println(info);
		
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		String cellValue = cell3.toString();
		System.out.println(cellValue);
		
		String cellInfo = sheet.getRow(1).getCell(2).toString();
		System.out.println(cellInfo);
		
		//How to get numeric value from the cell
		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);
		
		//downcasting to an integer
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		
		//I can get the zip as a String
		String zip = sheet.getRow(1).getCell(4).toString();
		System.out.println(zip);
	}

}
