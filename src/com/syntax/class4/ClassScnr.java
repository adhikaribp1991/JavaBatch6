package com.syntax.class4;
import java.util.Scanner;


public class ClassScnr {
	public static void main(String[] args) {
		//capture name from a user and
		//print in the format
		//my name is _______
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name here");
		String text=scan.nextLine();
		
		System.out.print(text);
		
		System.out.println(" How old are you");
		int age =scan.nextInt();
		System.out.println(age);
		System.out.println("My Name is "+text+" I am "+age+" years old");
		
		
		
		
	
		

	}

}
