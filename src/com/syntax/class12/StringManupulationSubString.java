package com.syntax.class12;

public class StringManupulationSubString {

	public static void main(String[] args) {
		String str="Today is a rainy day";
		String partialString =str.substring(6);//start from 6 until string end
		System.out.println(partialString);
		
		//Rainy Day
		partialString =str.substring(11);
		System.out.println(partialString);
// to print Today
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		
		// to print rainy
		partialString=str.substring(11, 16);
		System.out.println(partialString);
	}

}
