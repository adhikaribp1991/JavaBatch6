package com.syntax.class8;

public class ContinueInLoops {

	public static void main(String[] args) {
		
		for(int y=1; y<=10; y++) {
			if(y==4) {
				System.out.println("I am skipping iteration");
				//continue;
			}
			System.out.println(" I am inside loops");
			System.out.println(y);
		}

	}

}
