package com.syntax.class15;

public class Number {
	void evenOdd(int a) {
		if (a%2==0) {
			System.out.println(a+" is an Even number");
		}else {
			System.out.println(a+ " is an Odd number");
		}
	}
	public static void main(String[] args) {
		Number num=new Number();
		num.evenOdd(9);
	}
}
