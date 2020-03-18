package com.syntax.class4;

public class NestedIf {
	public static void main(String [] args) {
		//Nested IF
		boolean isFriday=true;
		int date = 13;
		if (isFriday) {
			System.out.println("Today is Friday, i am going to a movies");
			if(date==12) {
				System.out.println("Its not 13 i am not going to watch a movie");
			}else if(date==13) {
				System.out.println("I am going for a movie");
			}else if(date==15) {
				System.out.println("Its not a 13");
				
			}else {
				System.out.println("I am not watching movie");
				
			}
	
		}else {
			System.out.println("Today is not Friday, I am staying home");
		}
		
		
		
	
		}
	}
	


