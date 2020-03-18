package com.syntax.class6;

import java.util.Scanner;

public class TaskInClass1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=scan.nextLine();
		String language;
		switch(country) {
		case "Pakistan":
			language="Urdu";
			break;
		case "India":
			language="Hindi";
			break;
		case "Nepal":
			language="Nepali";
			break;
		default:
			language="Unknown";
			
		}
		System.out.println(language);
	}

}
