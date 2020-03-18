package com.syntax.class02;

public class ArithematicOperators {
	public static  void main(String [] args) {
		int num1 = 30;
		int num2 = 10;
		int sum = num1+num2;
		double num3 = 33.54;
		double num4 = 955.5858;
		double sum1 = num3+num4;
		
		System.out.println(sum1);
		System.out.println(sum);
		int sub =num1-num2;
		System.out.println(sub);
		double sub1 = num4-num3;
		System.out.println(sub1);
		int mul = num1*num2;
		System.out.println(mul);
		double div = num4/num3;
		int div1 = num1/num2;
		System.out.println(div1);
		System.out.println(div);
		int rem = num1%num2;
		System.out.println(rem);
		double rem1 = num4%num3;
		System.out.println("The remainder here is "+rem1);
		double sum2 = num1+num3;
		System.out.println(sum2);
		double sub3 = num1-num2-num3-num4;
		System.out.println(sub3);
	}

}
