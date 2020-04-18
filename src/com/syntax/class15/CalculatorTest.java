package com.syntax.class15;

public class CalculatorTest {
	
	int i;
	  double d;
	  char c;
	  void m1(){
	    System.out.println(i);
	    System.out.println(d);
	    System.out.println(c);
	    
	  }
	  public static void main(String [] args){
		  CalculatorTest obj1=new CalculatorTest();
	    obj1.i=10;
	    obj1.d=10.23;
	    obj1.c='a';
	    obj1.m1();
	    
	    CalculatorTest obj2=new CalculatorTest();
	    obj2.i=100;
	    obj2.d=100.23;
	    obj2.c='a';
	    obj2.m1();
	  }
}