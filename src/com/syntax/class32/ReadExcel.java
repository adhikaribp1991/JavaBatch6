package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		FileInputStream file=new FileInputStream(filePath);
		//get an object of workbook type
		Workbook wbook=new XSSFWorkbook(file);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		//need to find no of rows and no of columns
		
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		List<Map<String, String>> listMap= new ArrayList<>();
		
		System.out.println(rows+" "+columns);
		for(int r=1; r<rows; r++) {
			Map<String, String> map=new LinkedHashMap<>();
			
			for(int c=0; c<columns; c++) {
			String key=sheet.getRow(0).getCell(c).toString();
			String value=sheet.getRow(r).getCell(c).toString();
			map.put(key, value);
				
			}
			listMap.add(map);
		}
		for(Map<String, String>list:listMap) {
			System.out.println(list);
		}
		
		
		
	}

}
