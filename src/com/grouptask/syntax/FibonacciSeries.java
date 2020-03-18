package com.grouptask.syntax;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		int a=2, b=3;
		int c;
		System.out.print(a+" "+b);
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		

	}

}
