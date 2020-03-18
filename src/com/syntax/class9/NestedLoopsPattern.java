package com.syntax.class9;

public class NestedLoopsPattern {
	public static void main(String[] args) {
		for(int a=5; a>=1; a--) {
			
			for(int b=1; b<=a; b++) {
				System.out.print(a+" ");
				
			}
			System.out.println();
		}
	}
}
