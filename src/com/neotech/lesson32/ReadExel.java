package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExel {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "\\testdata\\Test.xlsx";
		//String filePath = "C:\\Users\\Atoul\\eclipse-workspace\\JavaBasic\\testdata\\Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet s = b.getSheet("TestData");
		
		//get the number of rows
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("rows --> " + rows);
		
		//get the number of columns/cells in a specific row
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("cols --> " + cols);
		
		System.out.println("-------------------------------------");
		
		//looping through all rows and colums
		for (int row = 0; row < rows; row++) {
			//iterating rows

			for(int col = 0; col < cols; col++) {
				//iterating columns
				String cellValue = s.getRow(row).getCell(col).toString();
				System.out.print(cellValue + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
