package com.syntax.class8;

public class Example {

	public static void main(String[] args) {
		// write a program that print numbers from1 to 20
		//i do not want to print 5,6,7
		for(int i=1; i<=100; i++) {
			if(i>=35 && i<=55) {
			System.out.println("-");
				continue;
			}
			System.out.println(i);
			
		}

	}

}
