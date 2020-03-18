package com.syntax.class8;

import java.util.Scanner;

public class TaskLoops {

	public static void main(String[] args) {
		//Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an “yes” from a user program should stop asking.
		Scanner scan=new Scanner(System.in);
		
			//System.out.println("Apply for a credit card");
			//String response=scan.nextLine();
			
		for(int i=1; i<=10;i++) {
			System.out.println("Apply for a credit card");
			 String response=scan.nextLine();
			 if(response.equals("yes")) {
				break;
			 }
			System.out.println("");
			
				
			
			
		}
		

	}

}
