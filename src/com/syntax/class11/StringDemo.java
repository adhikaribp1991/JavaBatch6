package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		String school=" Syntax";
		String str = new String("HELLo");
		
		// how many characters String has:
		System.out.println("LENGTH --- FUNCTION");
		System.out.println(school.length());
		int size=str.length();
		System.out.println(size);
		
		//convert String to lowercase or uppercase
		System.out.println("LOWER CASE ----- UPPER CASE");
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		//concatinate 2 string
		System.out.println("-------concatination-----------");
		String newString=str+school;
		System.out.println(newString);
		String day="saturday";
		String date=" 14";
		String newDate=day.concat(date);
		//concate only works when there are 2 string.
		System.out.println(newDate);
		char grade='A';
		String str2="Student";
		//str2.concat(grade);
		//cause of string and char value in above it shows CE:concate error.
		// To check the value inside string is empty or not
		String str3="jhj";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("--------trim() FUNCTION-------");
		//trim removes the spaces front and the end only. it does not removes the spaces inbetween.
		String str4="  Welcome to Syntax!    ";
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces:"+str4);
		
		
	}

}
