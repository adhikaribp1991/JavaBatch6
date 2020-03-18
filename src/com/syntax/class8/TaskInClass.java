package com.syntax.class8;

public class TaskInClass {

	public static void main(String[] args) {
		//print the number 1-50 except divisible by 3.
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
				
			}
			System.out.println(i);
		}

	}

}
