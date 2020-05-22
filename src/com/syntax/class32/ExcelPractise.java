package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractise {
	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		//System.out.println(filePath);
		FileInputStream file=new FileInputStream(filePath);
		Workbook wbook=new XSSFWorkbook(file);
		Sheet sheet=wbook.getSheet("GeneralDetail");
		int nor=sheet.getPhysicalNumberOfRows();
		int noc=sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int r=0;r<nor;r++) {
			for(int c=0;c<noc;c++) {
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+"  ");
			}
			System.out.println();
		}
	}

}
