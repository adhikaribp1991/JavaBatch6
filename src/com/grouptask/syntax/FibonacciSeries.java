package com.grouptask.syntax;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		int a=0, b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
		//Using Array
		int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 10; i++) {// to find rest fibonacci until 10
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int j = 0; j < 10; j++) {// number of index
			System.out.print(fib[j] + " ");
		
		}
	}

}
