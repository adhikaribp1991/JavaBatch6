package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionIntro {
	static String str;
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
	 
			String fPath="";
			
		try {
			FileInputStream file=new FileInputStream(fPath);
		}catch(FileNotFoundException fne) {
			System.out.println("Catched filenot exception");
		}
		int a=10;
		int b=0;
		try{
			System.out.println(a/b);
			System.out.println("try");
		}catch(ArithmeticException ae){
			System.out.println("Catch arthmtic exp");
		}
		
	
	}

}
