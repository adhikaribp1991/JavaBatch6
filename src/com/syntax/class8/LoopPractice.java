package com.syntax.class8;

public class LoopPractice {

	public static void main(String[] args) {
		int i;
		int sumOfOdd=0;
		int j;
		int sumOfEven=0;
		//write a program calculate sum of odds and sum of even numbers from 1 to 99
		for( i=1;i<100;i++) {
			
			if(i%2!=0) {
				sumOfOdd=sumOfOdd+i;
				
			
			}else {
				sumOfEven=sumOfEven+i;
			
		}
		}
		System.out.println("The sum of Odd number is "+sumOfOdd);
		System.out.println("The sum of even is "+sumOfEven);

		
		
		
			
				
			
		}
		
	}


