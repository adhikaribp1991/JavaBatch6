package com.syntax.class7;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		//Ask a user to pay for a candy as long as the peice is not 2
		//keep ask for paying one amount is correct--->"Enjoy Your candy"
		int price;
		Scanner scan=new Scanner(System.in);
		do {
			System.out.println("Pay for a candy");
			price=scan.nextInt();
			
			
		}while(price!=2);
		System.out.println("Enjoy your candy");
		
		
		
		

	}

}
