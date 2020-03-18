package com.syntax.class3;

public class PrimitiveCasting {
	public static void main(String [] args) {
		//compiler tells us compile type error saying:
		//type mismatch, cannot convert double to int
		//casting in java is a conversion of 1 type into another type:
		//primitives and non primitives casting:
		// 2 types of casting:
		//1. Widening(Implicit casting, automatically)
		//byte,short,int,long,float,double
		//2. Narrowing (explicit casting, manually)
		short i=(short)1303334;
		System.out.println(i);
	}
}
