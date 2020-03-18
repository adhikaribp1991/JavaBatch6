package com.syntax.class4;

public class Task2 {
	public static void main(String [] args) {
		double mortageRate = 3.5;
		int mortagePrice =250000;
		if (mortageRate>4.5) {
			System.out.println("User Will not Buy a house");
		}else {
			System.out.println("User will consider and buy a house");
			if(mortagePrice>200000) {
				System.out.println("User will take a loan");
				
			}else {
				System.out.println("User will pay a cash");
			}
		}
	}

}
