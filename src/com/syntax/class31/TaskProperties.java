package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TaskProperties {
	public static void main(String[] args) throws IOException {
		String filePath="/Users/bishnuprasadadhikari/eclipse-workspace/JavaBasic/configs/Task.properties";
		FileInputStream input=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		String url=prop.getProperty("url");
		System.out.println(url);
		
		prop.setProperty("lastName", "Adhikari");
		FileOutputStream fileOutput=new FileOutputStream(filePath);
		
		prop.store(fileOutput, "File added");
		
		
		
		
		
	}

}
