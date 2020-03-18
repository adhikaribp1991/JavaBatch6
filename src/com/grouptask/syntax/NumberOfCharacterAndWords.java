package com.grouptask.syntax;

public class NumberOfCharacterAndWords {

	public static void main(String[] args) {
		//Find out how many alpha characters are present in a String?
		//Find number of words in string?
		String a="Dog is a pet animal";
		int length;
		System.out.println("Alpha Character present in this String are "+a.length());
		String[] y=a.split(" ");
		
		System.out.print(y.length);
		
	}

}
