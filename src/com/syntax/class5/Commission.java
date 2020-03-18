package com.syntax.class5;

import java.util.Scanner;

public class Commission {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your sales here");
		int sales = scan.nextInt();
		double commission;
		if (sales>=1 && sales<=100) {
			commission = sales*0.10;
			System.out.println("Based on the amount of sales = "+commission);
		}else if(sales>100 && sales<=200) {
			commission = sales*0.2;
			System.out.println("Based on the amount of sales = "+commission);
			
		}else if(sales>200 && sales<=500) {
			commission =sales*0.30;
			System.out.println("Based on the amount of sales = "+commission);
		}else {
			commission=sales*0.5;
			System.out.println("Based on the amount of sales = "+commission);
		}
		if (commission>100) {
			System.out.println("you are good seller");
		}else {
			System.out.println("you are not a good seller");
		
			
		}
		
	}

}
