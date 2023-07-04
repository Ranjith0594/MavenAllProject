package org.Day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static void main(String[] args) throws Exception {
		
//		File file = new File("C:\\Users\\Ranjith\\eclipse-workspace\\MavenProjects\\src\\test\\"
//				+ "resources\\Testdata\\testdata.xlsx");
		
		FileInputStream inputstream = new FileInputStream("C:\\Users\\Ranjith\\eclipse-workspace\\MavenProjects\\src\\test\\"
				+ "resources\\Testdata\\testdata.xlsx");
		
		Workbook workbook = new XSSFWorkbook(inputstream);
		
		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
//		System.out.println(cell);
		
		int PhysicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(PhysicalNumberOfRows);
		
		int physicalNumberOfCells2 = row.getPhysicalNumberOfCells();
//		System.out.println(physicalNumberOfCells2);

		Row row2 = sheet.getRow(0);
		
for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
	Cell cell2 = row2.getCell(i);
	System.out.println(cell2);
}
// to print all row data
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row rowData = sheet.getRow(i);
	System.out.println(rowData);
	
}
		
	}
}
