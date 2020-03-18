package com.syntax.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner tuna=new Scanner(System.in);
		System.out.println("convert num to result");
		int num = tuna.nextInt();
		int result=num+100;
		System.out.println("The result is "+result+".");
		
	}

}
