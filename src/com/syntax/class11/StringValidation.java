package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		String str1="Welcome Syntax Students";
		String str2="Welcome Syntax students";
		//to compare equality of the 2 strings
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual="  Home - Syntax Technologies ";
		if (actual.equals(expected)) {
			System.out.println("pass");
			
		}else {
			System.out.println("failed");
		}
		
		if (actual.trim().equals(expected)) {
			System.out.println("pass");
			
		}else {
			System.out.println("failed");
		}
		
		
	}

}
