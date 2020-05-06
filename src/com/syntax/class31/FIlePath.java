package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FIlePath {
	public static void main(String[] args) throws IOException {
		String filePath="/Users/bishnuprasadadhikari/eclipse-workspace/JavaBasic/configs/Task.properties";
		System.out.println(filePath);
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String userName=System.getProperty("user.name");
		System.out.println(userName);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		
		String filePath1=System.getProperty("user.dir")+"/configs/Task.properties";
		System.out.println(filePath1);
		FileInputStream file=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		prop.load(file);
		
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		String url=prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.get("url"));
	}

}
