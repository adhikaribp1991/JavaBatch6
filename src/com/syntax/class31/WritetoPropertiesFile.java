package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritetoPropertiesFile {
	public static void main(String[] args) throws IOException {
		//Write into existing file add values
		String filePath="/Users/bishnuprasadadhikari/eclipse-workspace/JavaBasic/configs/Java.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		
		prop.load(fileInput);
		
		prop.setProperty("phoneNumber", "123456789");
		FileOutputStream fileOutput=new FileOutputStream(filePath);
		
		prop.store(fileOutput, "Added additional key");
		
	}

}
