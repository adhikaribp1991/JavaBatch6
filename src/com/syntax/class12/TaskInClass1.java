package com.syntax.class12;

public class TaskInClass1 {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String day= "Sunday";
		char letter;
		for(int i=5;i>=0;i--) {
			letter=day.charAt(i);
			System.out.print(letter);
		}
	}

}
