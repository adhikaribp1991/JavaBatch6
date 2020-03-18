package com.syntax.class4;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		boolean haveCreditcard= true;
		
		if (haveCreditcard) {
			
					
			System.out.println("How much is your Balance");
			int balance =abc.nextInt();
			
			if(balance>1000) {
				System.out.println("Pay off the balance immediately");
			}else {
				System.out.println("You can spend more");
			}


		}else {
			System.out.println("You can get a credit card");
		}
	}
	

}
