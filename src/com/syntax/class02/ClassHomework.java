package com.syntax.class02;

public class ClassHomework {
	public static void main(String[] args) {
		// Task 1
		double num1 = 15.22;
		double num2 = 20.44;
		double sum = num1 + num2;
		double sub = num2 - num1;
		double mul = num1 * num2;
		double div = num2 / num1;
		System.out.println("The addition, subtraction, multiply and divide values of 2 decimal numbers is equal to "
				+ sum + " " + sub + " " + mul + " " + div);
		//Task 2
		double num3 = 3.9;
		double square = num3 * num3;
		System.out.println("The square of the " + num3 + " " + "is " + square);
		//Task 3
		int width = 5;
		int height = 8;
		int area = width * height;
		int perimeter =2*(width + height);
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);
		System.out.println(num1+num2);
	}

}
