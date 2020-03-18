package com.syntax.class4;

public class PositiveNegativeOddEven {
	public static void main(String [] args) {
		int num = 0;
		int i1=0;
		if (num>i1) {
			System.out.println("It's a Positive Number");
			
		}else if(num<i1) {
			System.out.println("It's a Negative Number");
			
		}else {
			System.out.println("Your Number is 0");
		//Odd Even Task:
			int num1 = 15;
			int condition=2;
			int mod = num%condition;
			if (mod==0) {
				System.out.println("The number is Even");
				
				
			}else {
				System.out.println("The number is Odd");
			}
		}
	}
}
