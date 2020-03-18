package com.syntax.class8;

import java.util.Scanner;

public class FeelHardExampleInLoop {

	public static void main(String[] args) {
		//write a program that reads a range of integers (start and end point)
		//provided by a user and then from that range prints the sum of odd and even integers.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your startPoint");
		int startPoint=scan.nextInt();
		System.out.println("Enter your endPoint");
		int endPoint=scan.nextInt();
		int sumofeven=0;
		int sumofodd=0;
		
		for(int i=startPoint; i<=endPoint; i++) {
			if(i%2==0) {
				sumofeven=sumofeven+i;
			}else {
				sumofodd=sumofodd+i;
			}
		}
		System.out.println("The sum of even is "+sumofeven);
		System.out.println("The sum of odd is "+sumofodd);
	}

}
