package org.Day2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		//File path
		File file = new File("C:\\Users\\Ranjith\\eclipse-workspace\\MavenProjects\\src\\test\\"
				+ "resources\\Testdata\\testdata.xlsx");
		
		//scope to read the excel data
		FileInputStream inputstream = new FileInputStream(file);
		
		//to declare which type of excel we go to use
		Workbook workbook=new XSSFWorkbook(inputstream);	
		
		//Get the sheet
		Sheet sheet = workbook.getSheet("sheet1");
		
		//Get the row
		Row row = sheet.getRow(1);
		
		//Get the Cell
		Cell cell = row.getCell(0);
		
		
		
		
	}

}
