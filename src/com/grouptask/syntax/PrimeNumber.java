package com.grouptask.syntax;

public class PrimeNumber {
	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		
		int number=-2;
		int value=0;
		for(int i=2; i<number;i++) {
			if(number%i==0) {
				
			value=value+1;
			
			
			}
			
		}
		if(value>0) {
		System.out.println(number+" is not a Prime Number");
		}else {
			System.out.println(number+" is a Prime Number");
		}
	}

}
