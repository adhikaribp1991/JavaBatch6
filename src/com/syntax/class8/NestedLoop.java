package com.syntax.class8;

public class NestedLoop {

	public static void main(String[] args) {
		//print the result like this;
		//	*
		//	**
		//	***
		//	****
		
		
		for(int i=1; i<=4; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
			
		}

	}


