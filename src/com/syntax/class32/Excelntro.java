package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelntro {

	public static void main(String[] args) throws IOException {
		
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		
		FileInputStream file=new FileInputStream(filePath);
		//accessing workbook
				Workbook wbook=new XSSFWorkbook(file);
				//accessing Sheet
				Sheet sheet=wbook.getSheet("Sheet1");
				//accessing row
				Row row1=sheet.getRow(0);
				//accessing cell
				Cell cell=row1.getCell(1);
				// get value from cell
				String r1cell2=cell.toString();
				System.out.println(r1cell2);
				Row row3=sheet.getRow(2);
				Cell cell3=row3.getCell(2);
				String r3cell3=cell3.toString();
				System.out.println(cell3);
				
				String r2c4=sheet.getRow(1).getCell(3).toString();
				System.out.println(r2c4);
				
				String st=sheet.getRow(1).getCell(4).toString();
				String[] arr=st.split("\\.");
				System.out.println(arr[0]);
				
				//to retrieve value based on type
				double g=sheet.getRow(1).getCell(4).getNumericCellValue();
				System.out.println((int)g);
				
		
		
		
		
		
		
		
		
	}

}
