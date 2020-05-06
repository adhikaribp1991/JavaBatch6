package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TryCatchFinally {
	public static void main(String[] args) {
		division(10,0);
		read("");
	}
	public static void division(int num, int num1) {
		try {
		System.out.println(num/num1);
	
		}catch(ArithmeticException ae) {
		//ae.printStackTrace();//detailed message of an exception
		System.out.println(ae.getMessage());//MessAge of an exception
		//System.out.println(ae);
	}
		finally {
			System.out.println("I am a final block");
		}
	}

		public static void read(String filePath) {
			FileInputStream file;
			try {
			 file=new FileInputStream(filePath);
				Properties prop= new Properties();
				prop.load(file);
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
				file.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			}
			
}