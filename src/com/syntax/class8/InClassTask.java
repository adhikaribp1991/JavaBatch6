package com.syntax.class8;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		//Write a program to ask a user to enter item they want to buy and the price of that item. 
		//Every time user enters money accumulate the amount and tell the user how much is left to pay off the amount.
		//If user give more money program should return a change.
		//Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the item");
		String item=scan.nextLine();
		System.out.println("Enter the price");
		int price = scan.nextInt();
		
	}

}
