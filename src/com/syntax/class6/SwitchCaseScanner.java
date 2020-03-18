package com.syntax.class6;

import java.util.Scanner;

public class SwitchCaseScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter gender: M or F");
		char gender=scan.next().charAt(0);
		String genderType;
		
		switch(gender) {
		case'M':
			genderType="Male";
			break;
		case 'F':
			genderType="Female";
			break;
		default:
			genderType= "Invalid";
		}
		System.out.println(genderType);
	}

}
