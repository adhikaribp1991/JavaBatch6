package com.syntax.class5;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		
	//logical operator class
	//if(ture && true)--->Result will be true
	//if (ture && false)-->Result will be false
	//if (false && true)-->Result will be false
	//if (false && false)-->Result will be false
	
	
	//if(true || true)--->Result will  be true
	//if(true || false)--->Result will be true
	//if(false || true)--->Result will be true
	//if(false || true)--->Result will be false

	int num = 4;
	if (num>=1 && num>10) {
		System.out.println("This number is small");
	}else if(num>=11 && num<=100) {
		System.out.println("This is big number");
		
	}else if(num>100 && num<=1000) {
		System.out.println("This is a large number");
		
	
	}else {
		System.out.println("Super large");
	}
	}
}