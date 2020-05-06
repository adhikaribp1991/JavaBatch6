package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyFileReading {
	public static void main(String[] args) throws IOException {
		//to read the files
		//1. have files
		String filePath="/Users/bishnuprasadadhikari/eclipse-workspace/JavaBasic/configs/Java.properties";
		
		//2. bring object of FileInputStream
		FileInputStream fileInput=new FileInputStream(filePath);
		
		//to handle data from .properties file we need property Class
		Properties prop=new Properties();
		prop.load(fileInput);
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		Set<Object> keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
	}

}
