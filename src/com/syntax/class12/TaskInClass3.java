package com.syntax.class12;

import java.util.Scanner;

public class TaskInClass3 {
	public static void main(String[] args) {
		//Write a program that reads two people’s first names and if they expecting boy or girl?
		//Based on the input suggests a name for a baby:
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your Mom's first name");
		String momsName=scan.next();
		System.out.println("Please enter your Dad's first name");
		String dadsName=scan.next();
		System.out.println("what they are expecting Boy or girl");
		String expect=scan.next();
		int half1=momsName.length()/2;
		int half2=dadsName.length()/2;
		if(expect.equalsIgnoreCase("Boy")){
			System.out.println(dadsName.substring(0, half2 )+momsName.substring(half1));
			
		}else if(expect.equalsIgnoreCase("Girl")) {
			System.out.println(momsName.substring(0, half1)+dadsName.substring(half2));
		}else {
			System.out.println("Invalid Input");
		}
		
		
		
				
	}
}
