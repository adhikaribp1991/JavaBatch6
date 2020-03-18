package com.grouptask.syntax;

import java.util.Scanner;

public class Palimdrome {

	public static void main(String[] args) {
	//Write a Java Program to find whether a String is palindrome or not?
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your input");
		String Orginal=scan.next();
		String Reverse="";
		
		for(int i=Orginal.length()-1;i>=0;i--) {
			Reverse=Reverse+Orginal.charAt(i);
			
			
			
		}
		if(Orginal.equals(Reverse)) {
			System.out.println("Given String is Palindrome");
			
		}else {
			System.out.println("Given String is not Palindromed");
		}
		
		
	}

}
