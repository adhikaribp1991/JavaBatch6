package com.syntax.class10;

public class PractiseArray {

	public static void main(String[] args) {
		String[] animals= {"Tiger", "Lion", "wolf", "Rabbit", "Rhino", "Deer"};
	
		for(String animal:animals) {
			System.out.println(animal);
		}
		System.out.println("''''''''Another Method'''''''''''''''");
		for(int i=0; i<animals.length;i++) {
			System.out.println(animals[i]);
			
		}
		//----------------other----------------
		int[] numbers= {5,3,8,6,3,9};
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			
		
		sum+=numbers[i];
		
		}
		System.out.println(sum);

		//---------Advance method----------------
		int add=0;
		for(int number:numbers) {
			//System.out.println(number);
			add+=number;
			
		}
		System.out.println(add);
	}

}
