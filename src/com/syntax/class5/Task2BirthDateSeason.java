package com.syntax.class5;

import java.util.Scanner;

public class Task2BirthDateSeason {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String season = "";
			System.out.println("Enter your Birth Month");
		String birthMonth=scan.nextLine();
		if (birthMonth.equals("June") || birthMonth.equals("July")|| birthMonth.equals("August")) {
			season="Summer";
		}else if(birthMonth.equals("September")||birthMonth.equals("October")||birthMonth.equals("November")) {
			season="Autunm";
		}else if(birthMonth.equals("December")||birthMonth.equals("January")||birthMonth.equals("February")) {
			season="Winter";
		}
		System.out.println("You were born in "+season);

	}

}
