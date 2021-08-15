package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExel {
	
	public static void main(String[] args) throws IOException {
		
		//String filePath = System.getProperty("user.dir") + "testdata\\Test.xlsx";
		String filePath = "C:\\Users\\Atoul\\eclipse-workspace\\JavaBasic\\testdata\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet sheet = b.getSheet("TestData");
		
		//I want to write into row with index 0;
		sheet.getRow(0).createCell(5).setCellValue("Country");
		
	}
}
