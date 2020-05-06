package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Exception {
	
	public static void main(String[] args){
		
	}
	public static List<Exception> getAllException(){
		List<Exception> exceptionList=new ArrayList<>();
		int [] array= {1,2,3};
		try {
			System.out.println(array[4]);
		}catch(ArrayIndexOutOfBoundsException aob) {
			//exceptionList.add(aob);
		}
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
		
		return exceptionList;
	}
}

