
package com.syntax.class5;

import java.util.Scanner;

public class LogicalOperatorVsScanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = scan.nextInt();
	if(age>0) {
		 if(age>=0 && age<=3) {
			System.out.println("You are a baby");
		}else if(age>=4 && age<=5) {
			System.out.println("You are a kid");
		}else if(age>=6 && age<=12) {
			System.out.println("you are a child");
			
		}else if(age>=13 && age<=19) {
			System.out.println("You are teenager");
			
		}else if(age>=20 && age<=64) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are a senior");
		}	
		}else {
			System.out.println("Please enter valid age");
		}

	}

}
