package com.syntax.class33;

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

public class ProcessDataFromExcel {
	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"/TestData/Test.xlsx";
		
		FileInputStream file=new FileInputStream(filePath);
		//System.out.println(filePath);
		
		Workbook wbook=new XSSFWorkbook(file);
		
		Sheet sheet=wbook.getSheet("GeneralDetail");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> lmap=new ArrayList<>();
		for(int r=1; r<rows; r++) {
			Map<String, String> map=new LinkedHashMap<>();
			for(int c=0; c<columns; c++) {
				String key=sheet.getRow(0).getCell(c).toString();
				String value=sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
				
			}
			lmap.add(map);
		}
		
		System.out.println(lmap);
	}

}
