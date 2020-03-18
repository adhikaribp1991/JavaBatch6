package com.syntax.class8;

public class NestedLoops {

	public static void main(String[] args) {
		// once i =4 ---> we want to stop the loop
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				System.out.println("I am stopping loop");
				break;
			}
			System.out.println(i);

		}
		System.out.println("i am outside of loop");
	}

}
