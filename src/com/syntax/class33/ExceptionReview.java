package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionReview {
	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		String fPath="";
		try {
			FileInputStream file=new FileInputStream(fPath);
		}catch(FileNotFoundException ex) {
			
		}
		System.out.println("end of program");
	}
	
}
